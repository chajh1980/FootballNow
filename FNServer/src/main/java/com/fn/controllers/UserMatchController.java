package com.fn.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fn.common.CommandMap;
import com.fn.service.UserMathService;

@Controller
@RequestMapping("/match")
public class UserMatchController {
	@Autowired
	UserMathService userMathService;
	
	@RequestMapping("/add")
	public ResponseEntity<List<Map<String,Object>>> insertUserMatch(CommandMap commandMap){
		userMathService.insertUserMatch(commandMap.getMap());
		return new ResponseEntity<List<Map<String,Object>>>(userMathService.selectUserMatch(commandMap.getMap()), HttpStatus.OK);
	}
}
