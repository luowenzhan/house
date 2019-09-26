package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FacilityDto;
import com.example.demo.entity.Facility;
import com.example.demo.mapper.FacilityMapper;

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
@Api(value = "物业设备管理操作", description = "物业设备管理操作")
@RequestMapping("/facility")
public class FacilityController {
	@Autowired
	private FacilityMapper facilityMapper;
	
	@ApiOperation("获取所有物业管理信息")
    @GetMapping("/getFacilitys")
    public List<FacilityDto> getFacilitys(){
		List<FacilityDto> list=facilityMapper.getFacilitys();
		return list;
	}
	
	@ApiOperation("新增物业管理信息")
    @PostMapping("/insertFacility")
    public int insertFacility(@RequestBody Facility Facility){
		int i=facilityMapper.insert(Facility);
		return i;
	}
	
	@ApiOperation("修改物业管理信息")
    @PutMapping("/updateFacility")
    public int updateFacility(@RequestBody Facility Facility){
		int i=facilityMapper.updateById(Facility);
		return i;
	}
	
	@ApiOperation("删除物业管理信息")
    @RequestMapping("/deleteFacility")
    public int deleteFacility(int fid){
		int i=facilityMapper.deleteById(fid);
		return i;
	}
}
