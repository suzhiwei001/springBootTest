package com.suzhiwei.demoOne.Service;
import java.util.List;

import com.suzhiwei.demoOne.Bean.User;

public interface UserService {
	/**
	 * @param name 用户名称
	 * @return User
	 */
	User findUserByName(String name);
	
	/**
	 * 新增用户
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * 展示所有人员
	 */
	List<User> showAllUser();
}
