package com.fn.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fn.common.CommandMap;
import com.fn.service.UserMatchService;

@Controller
@RequestMapping("/match")
public class UserMatchController {
	@Autowired
	UserMatchService userMatchService;
	
	@RequestMapping("/match_search")
	public ResponseEntity<List<Map<String,Object>>> selectMatchSearch(Model model){
		//userService.selectUserList();
		return new ResponseEntity<List<Map<String,Object>>>(userMatchService.selectMatchSearch(),HttpStatus.OK);
	} 
	
	@RequestMapping("/add")
	public ResponseEntity<List<Map<String,Object>>> insertUserMatch(CommandMap commandMap){
		userMatchService.insertUserMatch(commandMap.getMap());
		return new ResponseEntity<List<Map<String,Object>>>(userMatchService.selectUserMatch(commandMap.getMap()), HttpStatus.OK);
	}
}
