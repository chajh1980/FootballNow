package com.fn.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fn.common.AbstractDAO;

@Repository("userMatchMapper")
public class UserMatchMapper extends AbstractDAO {

	public void insertUserMatch(Map<String, Object> map) {
		insert("userMatchMapper.insertUserMatch", map);
	}

	public List<Map<String, Object>> selectUserMatch(Map<String, Object> map) {
		return (List<Map<String,Object>>)selectList("userMatchMapper.selectUserMatch",map);
	}
}
