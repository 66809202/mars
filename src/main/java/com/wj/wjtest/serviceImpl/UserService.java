package com.wj.wjtest.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.wjtest.dao.IUserDao;
import com.wj.wjtest.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	IUserDao userDao;

	@Override
	public List<Map<String, Object>> getUserInfo(Map<String, String> map) {

		return userDao.getUserInfo(map);
	}

	@Override
	public void addUser(Map<String, Object> map) {

		userDao.addUser(map);
		
	}

}
