package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.ChargeDto;
import com.example.demo.entity.Charge;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface ChargeMapper extends BaseMapper<Charge> {
	//查询所有
	@Select("select c.cid,c.ctype,c.ctime,c.chid,h.hnumber chnumber,c.cmoney from house h,charge c where h.hid=c.chid")
	public List<ChargeDto> getCharges();
}
