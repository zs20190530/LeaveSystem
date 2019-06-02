package org.ls.service.impl;

import org.ls.entity.User;
import org.ls.mapper.UserMapper;
import org.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		return userMapper.queryWithUsernameAndPassword(user);
	}
	
}
