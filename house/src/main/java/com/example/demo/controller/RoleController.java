package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.service.IRoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
@RestController
@Api(value = "角色操作", description = "角色操作")
@RequestMapping("/roleManage")
public class RoleController {
	@Autowired
	private IRoleService roleService;
	@Autowired
	private RoleMapper roleMapper;
	
	@ApiOperation("获取所有角色信息")
    @GetMapping("/getRoles")
    public List<Role> getRoles(){
		List<Role> list=roleService.getRoles();
		return list;
	}
	
	@ApiOperation("新增角色信息")
    @PostMapping("/insertRole")
    public int insertRole(@RequestBody Role role){
		int i=roleMapper.insert(role);
		return i;
	}
	
	@ApiOperation("修改角色信息")
    @PutMapping("/updateRole")
    public int updateRole(@RequestBody Role role){
		int i=roleMapper.updateRole(role);
		return i;
	}
	
	@ApiOperation("删除角色信息")
    @RequestMapping("/deleteRole")
    public int deleteRole(String roid){
		int i=roleMapper.deleteRole(roid);
		return i;
	}
}
