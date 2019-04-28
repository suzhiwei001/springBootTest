package com.suzhiwei.demoOne.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzhiwei.demoOne.Bean.User;
import com.suzhiwei.demoOne.Mapper.UserMapper;
import com.suzhiwei.demoOne.Service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserByName(String name) {
		return userMapper.findUserByName(name);
	}
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
	@Override
	public List<User> showAllUser() {
		return userMapper.showAllUser();
	}

}
