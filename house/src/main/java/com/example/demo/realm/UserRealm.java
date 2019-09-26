package com.example.demo.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.RolepermissionDto;
import com.example.demo.entity.User;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.mapper.RolepermissionMapper;
import com.example.demo.service.IUserService;

public class UserRealm extends AuthorizingRealm{
	@Autowired
	private IUserService userService;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private RolepermissionMapper rpMapper;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//这里做权限控制
    	SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
    	User user=(User) principals.getPrimaryPrincipal();
    	//User user2=userService.searchUser(user.getAccount());
        List<RolepermissionDto> list1=rpMapper.getRolepermissionsByRoleId(user.getUroid());
    	List<String> list2=new ArrayList<String>();
    	for (RolepermissionDto rpDto : list1) {
			String str=rpDto.getRppename();
            System.out.println("str:"+str);
            list2.add(str);
		}
    	info.addStringPermissions(list2);
        return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		AuthenticationInfo info;
		String uname=(String) token.getPrincipal();
		User user=userService.getUserByName(uname);
		if(user!=null) {
			info=new SimpleAuthenticationInfo(user, user.getUpwd(), "登录");
			return info;
		}
		return null;
	}
	
}