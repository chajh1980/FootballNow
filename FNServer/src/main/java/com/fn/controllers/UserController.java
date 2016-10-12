package com.fn.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fn.common.CommandMap;
import com.fn.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/list")
	public ResponseEntity<List<Map<String,Object>>> selectUserList(Model model){
		//userService.selectUserList();
		return new ResponseEntity<List<Map<String,Object>>>(userService.selectUserList(),HttpStatus.OK);
	}
	
	@RequestMapping("/info")
	public ResponseEntity<List<Map<String,Object>>> selectUserInfo(Model model, @RequestParam Map<String,Object> map){
		return new ResponseEntity<List<Map<String,Object>>>(userService.selectUser(map),HttpStatus.OK);
	}

	@RequestMapping("/join")
	public ResponseEntity<List<Map<String,Object>>> insertUser(CommandMap commandMap){
		userService.insertUser(commandMap.getMap());
		return new ResponseEntity<List<Map<String,Object>>>(userService.selectUser(commandMap.getMap()), HttpStatus.OK);
	}

	@RequestMapping("/update")
	public ResponseEntity<List<Map<String,Object>>> updateUser(CommandMap commandMap){
		userService.updateUser(commandMap.getMap());
		return new ResponseEntity<List<Map<String,Object>>>(userService.selectUser(commandMap.getMap()), HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping("/nicknameDuplCheck")
	public boolean nicknameDuplCheck(Model model, @RequestParam Map<String,Object> map){
		return userService.selectNickname(map).size() > 0 ? true : false; 
	}
	
	//test
}
