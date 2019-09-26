package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Permission;
import com.example.demo.mapper.PermissionMapper;

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
@Api(value = "权限操作", description = "权限操作")
@RequestMapping("/permissionManage")
public class PermissionController {
	@Autowired
	private PermissionMapper permissionMapper;
	
	@ApiOperation("获取所有权限信息")
    @GetMapping("/getPermissions")
    public List<Permission> getPermissions(){
		List<Permission> list=permissionMapper.selectList(null);
		return list;
	}
	
	@ApiOperation("新增权限信息")
    @PostMapping("/insertPermission")
    public int insertPermission(@RequestBody Permission permission){
		int i=permissionMapper.insert(permission);
		return i;
	}
	
	@ApiOperation("修改权限信息")
    @PutMapping("/updatepermission")
    public int updatepermission(@RequestBody Permission permission){
		int i=permissionMapper.updatePermission(permission);
		return i;
	}
	
	@ApiOperation("删除权限信息")
    @RequestMapping("/deletepermission")
    public int deletepermission(int peid){
		int i=permissionMapper.deletePermission(peid);
		return i;
	}
}
