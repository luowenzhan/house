package com.example.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.Role;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface IRoleService{
	//获取所有角色
	public List<Role> getRoles();
}
