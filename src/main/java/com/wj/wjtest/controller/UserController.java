package com.wj.wjtest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/getUserInfo")
	public List<Map<String, Object>> getUserInfo() {
		
		
		return userService.getUserInfo();
	}
}
