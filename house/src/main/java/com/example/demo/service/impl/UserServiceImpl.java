package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	//通过用户名查询用户
	public User getUserByName(String uname) {
		// TODO Auto-generated method stub
		return userMapper.getUserByName(uname);
	}

	@Override
	//查询所有用户
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectList(null);
	}

	@Override
	//新增用户
	public Integer insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	@Override
	//通过主键修改用户表
	public Integer updateUserById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateById(user);
	}

	@Override
	//通过主键删除用户表
	public Integer deleteUserById(int uid) {
		// TODO Auto-generated method stub
		return userMapper.deleteById(uid);
	}

	@Override
	//更改密码
	public int updatePwdById(String upwd, int uid) {
		// TODO Auto-generated method stub
		return userMapper.updatePwdById(upwd, uid);
	}

}
