package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.Permission;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface PermissionMapper extends BaseMapper<Permission> {

	//修改权限信息
	@Update("update permission set pename=#{pename} where peid=#{peid}")
	public int updatePermission(Permission permission);
	
	//删除权限信息
	@Delete("delete from permission where peid=#{peid}")
	public int deletePermission(int peid);
	
	//通过主键查询信息
	@Select("select * from permission where peid=#{peid}")
	public Permission getPermissionById(int peid);
}
