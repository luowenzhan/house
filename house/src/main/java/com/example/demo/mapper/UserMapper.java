package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface UserMapper extends BaseMapper<User>{
	//通过用户名查询用户
	@Select("select * from user where uname=#{uname}")
	public User getUserByName(String uname);
	
	//查询所有用户
//	@Select("select * from user")
//	public List<User> getUsers();
	
	//新增用户
	@Insert("insert into user(uname,upwd,uroid) values(#{uname},#{upwd},#{uroid})")
	public int insertUser(User user);

	//更改密码
	@Update("update user set upwd=#{upwd} where uid=#{uid}")
	public int updatePwdById(String upwd,int uid);
}
