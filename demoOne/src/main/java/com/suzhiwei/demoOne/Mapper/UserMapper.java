package com.suzhiwei.demoOne.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.suzhiwei.demoOne.Bean.User;
@Mapper
public interface UserMapper {
	/**
	 * 根据名称查询用户
	 * @param name
	 * @return
	 */
	User findUserByName(@Param("name")String name);
	/**
	 * 新增用户
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * 展示所有用户
	 */
	List<User> showAllUser();
}
