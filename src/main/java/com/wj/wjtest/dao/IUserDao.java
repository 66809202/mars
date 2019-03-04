package com.wj.wjtest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {
	List<Map<String, Object>> getUserInfo(Map<String, String> map);
	void addUser(Map<String, Object> map);
}
