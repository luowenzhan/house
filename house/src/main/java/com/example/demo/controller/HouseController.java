package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.House;
import com.example.demo.mapper.HouseMapper;

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
@Api(value = "房屋操作", description = "房屋操作")
@RequestMapping("/house")
public class HouseController {
	@Autowired
	private HouseMapper houseMapper;
	
	@ApiOperation("获取所有房屋信息")
    @GetMapping("/getHouses")
    public List<House> getHouses(){
		List<House> list=houseMapper.selectList(null);
		return list;
	}
	
	@ApiOperation("新增房屋信息")
    @PostMapping("/insertHouse")
    public int insertHouse(@RequestBody House house){
		int i=houseMapper.insert(house);
		return i;
	}
	
	@ApiOperation("修改房屋信息")
    @PutMapping("/updateHouse")
    public int updateHouse(@RequestBody House house){
		int i=houseMapper.updateById(house);
		return i;
	}
	
	@ApiOperation("删除房屋信息")
    @RequestMapping("/deleteHouse")
    public int deleteHouse(int hid){
		int i=houseMapper.deleteById(hid);
		return i;
	}
}
