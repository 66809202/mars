package com.wj.wjtest.service;

import java.util.List;
import java.util.Map;

public interface IUserService {
	/**
	 * 查询user信息
	 * @return List
	 */
	List<Map<String, Object>> getUserInfo(Map<String, String> map);
	
	void addUser(Map<String, Object> map);
}
