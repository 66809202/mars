package com.wj.wjtest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wj.wjtest.service.IUserService;

/**
 * user Controller
 * @author jian.k.wang
 *
 */
@RestController
public class UserController {
	
	@Autowired
	IUserService userService;

	@RequestMapping(value = "/getUserInfo/{name}", method = RequestMethod.GET)
	public List<Map<String, Object>> getUserInfo(@PathVariable String name) {
		
		Map<String, String> paramMap = new HashMap<String, String>();
		
		paramMap.put("name", name);
		
		return userService.getUserInfo(paramMap);
	}
	
	/**
	 * 查询所有user
	 * @return
	 */
	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public List<Map<String, Object>> getUserList() {
		
		return userService.getUserInfo(new HashMap<String, String>());
	}
	
	/**
	 * 添加user
	 * @param map
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(@RequestBody Map<String, Object> map) {
		userService.addUser(map);
	}
}
