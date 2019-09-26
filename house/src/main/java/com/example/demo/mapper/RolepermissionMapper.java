package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.RolepermissionDto;
import com.example.demo.entity.Rolepermission;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface RolepermissionMapper extends BaseMapper<Rolepermission> {
	//修改角色权限信息
	@Update("update rolepermission set rproid=#{rproid},rppeid=#{rppeid} where rpid=#{rpid}")
	public int updateRolepermission(Rolepermission rolepermission);
	
	//删除角色权限信息
	@Delete("delete from rolepermission where rpid=#{rpid}")
	public int deleteRolepermission(int rpid);
	
	//查询所有
	@Select("select rp.rpid,rp.rproid,r.roname rproname,rppeid,p.pename rppename from rolepermission rp,role r,permission p where rp.rproid=r.roid and rp.rppeid=p.peid" )
	public List<RolepermissionDto> getRolepermissions();
	
	//通过角色id查询想对应所有权限
	@Select("select rp.rpid,rp.rproid,r.roname rproname,rppeid,p.pename rppename from rolepermission rp,role r,permission p where rp.rproid=r.roid and rp.rppeid=p.peid and rp.rproid=#{roid}" )
	public List<RolepermissionDto> getRolepermissionsByRoleId(String roid);
}
