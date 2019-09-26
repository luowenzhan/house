package com.example.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface IUserService{
	//通过用户名查询用户
	public User getUserByName(String uname);
	
	//查询所有用户
	public List<User> getUsers();
	
	//新增用户
	public Integer insertUser(User user);
	
	//通过主键修改用户表
	public Integer updateUserById(User user);
	
	//通过主键删除用户信息
	public Integer deleteUserById(int uid);
	
	//更改密码
	public int updatePwdById(String upwd,int uid);
}
