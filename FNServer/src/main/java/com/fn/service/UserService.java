package com.fn.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fn.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	public List<Map<String,Object>> selectUserList(){ 
		return userMapper.selectUserList();
	}
	
	public List<Map<String,Object>> selectUser(Map<String,Object> map){ 
		return userMapper.selectUser(map);
	}
	
	public void insertUser(Map<String,Object> map){
		userMapper.insertUser(map);
	}

	public void updateUser(Map<String, Object> map) {
		userMapper.updateUser(map);
	}

	public List<Map<String, Object>> selectNickname(Map<String, Object> map) {
		return userMapper.selectNickname(map);
	}
	
}
