package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResidentDto;
import com.example.demo.entity.Resident;
import com.example.demo.mapper.ResidentMapper;

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
@Api(value = "住户管理操作", description = "住户管理操作")
@RequestMapping("/resident")
public class ResidentController {
	@Autowired
	private ResidentMapper residentMapper;
	
	@ApiOperation("获取所有人事信息")
    @GetMapping("/getResidents")
    public List<ResidentDto> getResidents(){
		List<ResidentDto> list=residentMapper.getResidents();
		return list;
	}
	
	@ApiOperation("新增人事信息")
    @PostMapping("/insertResident")
    public int insertResident(@RequestBody Resident Resident){
		int i=residentMapper.insertResident(Resident);
		return i;
	}
	
	@ApiOperation("修改人事信息")
    @PutMapping("/updateResident")
    public int updateResident(@RequestBody Resident Resident){
		int i=residentMapper.updateById(Resident);
		return i;
	}
	
	@ApiOperation("删除人事信息")
    @RequestMapping("/deleteResident")
    public int deleteResident(int reid){
		int i=residentMapper.deleteById(reid);
		return i;
	}
}
