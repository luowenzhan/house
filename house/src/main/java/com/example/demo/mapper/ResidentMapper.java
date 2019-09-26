package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.ResidentDto;
import com.example.demo.entity.Resident;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface ResidentMapper extends BaseMapper<Resident> {
	//查询所有
	@Select("select r.reid,r.rename,r.reage,r.resex,r.recard,r.rephone,r.recheckintime,r.rereid,re.rename rerename,r.rehid,h.hnumber rehnumber from resident r,resident re,house h\n" + 
			"where r.rereid=re.reid and r.rehid=h.hid")
	public List<ResidentDto> getResidents();
	
	//新增住户信息
	@Insert("insert into resident(rename,reage,resex,recard,rephone,recheckintime,rereid,rehid) values(#{rename},#{reage},#{resex},#{recard},#{rephone},#{recheckintime},#{rereid},#{rehid})")
	public int insertResident(Resident resident);
}
