package com.example.demo.controller;

import com.example.demo.dto.ResultDto;
import com.example.demo.util.ResultDtoFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author yufengpeng
 */
@RestController
@Api(value = "身份认证", description = "登录操作")
@RequestMapping("/login")
public class LoginController {
    @ApiOperation(value = "通过shiro实现登录功能", notes = "用户登录的实现")
    @GetMapping("/toLogin")
	public int toLogin(String uname, String upwd, /* String security, */HttpSession session) {
        //实现登录操作首先获取其shiro主体Subject
//    	System.out.println("java");
        Subject subject = SecurityUtils.getSubject();
        System.out.println(uname+"  "+upwd);
//        if(!security.equals(session.getAttribute("imgcode"))) {
////        	return ResultDtoFactory.toNack("验证码错误！");
////        	return new ResponseEntity<Integer>(0,HttpStatus.OK);
//        	return 0;
//        }
        //然后拿到身份认证的令牌UsernamePasswordToken
        UsernamePasswordToken token = new UsernamePasswordToken(uname,upwd);
        //进行登录操作
        try {
            subject.login(token);
            //登录成功将用户名放进session中
            session.setAttribute("uname", uname);
//            return ResultDtoFactory.toAck("登录成功",1);
//            return new ResponseEntity<Integer>(1,HttpStatus.OK);
            return 1;
        } catch (UnknownAccountException e) {
//            return ResultDtoFactory.toNack("用户名不存在");
//        	return new ResponseEntity<Integer>(0,HttpStatus.OK);
        	return 0;
        } catch (IncorrectCredentialsException e) {
//            return ResultDtoFactory.toNack("用户名存在但是密码不正确");
//        	return new ResponseEntity<Integer>(0,HttpStatus.OK);
        	return 0;
        }
	       
    }


    @ApiOperation(value = "退出登录操作",notes = "已登录的可以退出登录")
    @GetMapping("/toLogout")
    public ResultDto toLogout(){
        //1、要退出登录之前要获取主体subject
        Subject subject = SecurityUtils.getSubject();
        //2、判断
        if (subject != null) {
            subject.logout();
            return ResultDtoFactory.toAck("退出登录成功");
        }
         return ResultDtoFactory.toNack("根本没登陆，怎么退出呢");
    }
    
    @ApiOperation(value = "无权限操作",notes = "无权限操作")
    @RequestMapping("/noauth")
    public String noauth(){
        return "没有权限";
    }
}
