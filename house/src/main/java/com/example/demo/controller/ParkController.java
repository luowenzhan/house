package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Park;
import com.example.demo.mapper.ParkMapper;

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
@Api(value = "停车场操作", description = "停车场操作")
@RequestMapping("/park")
public class ParkController {
	@Autowired
	private ParkMapper parkMapper;
	
	@ApiOperation("获取所有停车场信息")
    @GetMapping("/getParks")
    public List<Park> getParks(){
		List<Park> list=parkMapper.selectList(null);
		return list;
	}
	
	@ApiOperation("新增停车场信息")
    @PostMapping("/insertPark")
    public int insertPark(@RequestBody Park park){
		int i=parkMapper.insert(park);
		return i;
	}
	
	@ApiOperation("修改停车场信息")
    @PutMapping("/updatePark")
    public int updatePark(@RequestBody Park park){
		int i=parkMapper.updateById(park);
		return i;
	}
	
	@ApiOperation("删除停车场信息")
    @RequestMapping("/deletePark")
    public int deletePark(int paid){
		int i=parkMapper.deleteById(paid);
		return i;
	}
}
