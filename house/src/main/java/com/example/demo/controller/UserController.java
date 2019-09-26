package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

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
@Api(value = "用户操作", description = "用户操作")
@RequestMapping("/userManage")
public class UserController {
	
	@Autowired 
	private IUserService userService;
	
//  @ApiImplicitParam(paramType = "query", name = "adminUserId", value = "业务经理ID", dataType = "Integer" ,required = true)
    @ApiOperation("获取所有用户信息")
    @GetMapping("/getUsers")
    public List<User> getUsers(){
		List<User> list=new ArrayList<User>();
		list=userService.getUsers();
		return list;
	}
	
    @ApiOperation("新增用户信息")
    @PostMapping("/insertUser")
    public int insertUser(@RequestBody User user){
		int i=userService.insertUser(user);
		return i;
	}
    
    @ApiOperation("修改用户信息")
    @PutMapping("/updateUser")
    public int updateUser(@RequestBody User user){
		int i=userService.updateUserById(user);
		return i;
	}
	   
    @ApiOperation("删除用户信息")
    @RequestMapping("/deleteUser")
    public int deleteUser(@RequestParam("uid") int uid){
		int i=userService.deleteUserById(uid);
		return i;
	}
    
    @ApiOperation("修改密码")
    @PutMapping("/updatePwdById")
    public int updatePwdById(String upwd,int uid){
		int i=userService.updatePwdById(upwd,uid);
		return i;
	}
}
