package com.fn.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fn.mapper.UserMatchMapper;

@Service
public class UserMatchService {
	@Autowired
	UserMatchMapper userMatchMapper;
	
	public List<Map<String,Object>> selectUserMatch(Map<String,Object> map){ 
		return userMatchMapper.selectUserMatch(map);
	}
	
	public List<Map<String,Object>> selectMatchSearch(){ 
		return userMatchMapper.selectMatchSearch();
	}
	
	public void insertUserMatch(Map<String,Object> map){
		userMatchMapper.insertUserMatch(map);
	}

}
