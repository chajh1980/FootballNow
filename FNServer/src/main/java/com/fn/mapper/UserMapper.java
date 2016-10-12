package com.fn.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fn.common.AbstractDAO;

@Repository("userMapper")
public class UserMapper extends AbstractDAO {

	public List<Map<String, Object>> selectUserList() {
		return (List<Map<String,Object>>)selectList("userMapper.selectUserList");
	}

	public List<Map<String, Object>> selectUser(Map<String, Object> map) {
		return (List<Map<String,Object>>)selectList("userMapper.selectUser",map);
	}

	public void insertUser(Map<String, Object> map) {
		insert("userMapper.insertUser", map);
	}

	public void updateUser(Map<String, Object> map) {
		update("userMapper.updateUser", map);
	}
	
	public List<Map<String, Object>> selectNickname(Map<String, Object> map) {
		return (List<Map<String,Object>>)selectList("userMapper.selectNickname",map);
	}
}
