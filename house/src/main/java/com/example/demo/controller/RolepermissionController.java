package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RolepermissionDto;
import com.example.demo.entity.Rolepermission;
import com.example.demo.mapper.RolepermissionMapper;

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
@Api(value = "角色权限权限操作", description = "角色权限权限操作")
@RequestMapping("/rolepermission")
public class RolepermissionController {
	@Autowired
	private RolepermissionMapper rpMapper;
	
	@ApiOperation("获取所有角色权限信息")
    @GetMapping("/getRolepermissions")
    public List<RolepermissionDto> getRoles(){
		List<RolepermissionDto> list=rpMapper.getRolepermissions();
		return list;
	}
	
	@ApiOperation("新增角色权限信息")
    @PostMapping("/insertRolepermission")
    public int insertRolepermission(@RequestBody Rolepermission rolepermission){
		int i=rpMapper.insert(rolepermission);
		return i;
	}
	
	@ApiOperation("修改角色权限信息")
    @PutMapping("/updateRolepermission")
    public int updateRole(@RequestBody Rolepermission rolepermission){
		int i=rpMapper.updateRolepermission(rolepermission);
		return i;
	}
	
	@ApiOperation("删除角色权限信息")
    @RequestMapping("/deleteRolepermission")
    public int deleteRolepermission(int rpid){
		int i=rpMapper.deleteRolepermission(rpid);
		return i;
	}
}
