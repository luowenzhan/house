package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.FacilityDto;
import com.example.demo.entity.Facility;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface FacilityMapper extends BaseMapper<Facility> {
	//查询所有
	@Select("select f.fid,f.ftype,f.fprice,f.ftime,f.fusetime,f.fpid,p.pname fpname from facility f,personnel p where f.fpid=p.pid")
	public List<FacilityDto> getFacilitys();
}
