package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.Role;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {

	//修改角色信息
	@Update("update role set roname=#{roname} where roid=#{roid}")
	public int updateRole(Role role);
	
	//删除角色信息
	@Delete("delete from role where roid=#{roid}")
	public int deleteRole(String roid);
}
