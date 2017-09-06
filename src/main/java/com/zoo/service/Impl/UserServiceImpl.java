package com.zoo.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zoo.dao.UserDao;
import com.zoo.pojo.User;
import com.zoo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public User getUserById(String userId) {
		return userDao.getUserById(userId);
	}

}
