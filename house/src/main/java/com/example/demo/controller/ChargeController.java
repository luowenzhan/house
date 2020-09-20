package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ChargeDto;
import com.example.demo.entity.Charge;
import com.example.demo.mapper.ChargeMapper;

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
@Api(value = "物业收费操作", description = "物业收费操作")
@RequestMapping("/charge")
public class ChargeController {
	@Autowired
	private ChargeMapper chargeMapper;
	
	@ApiOperation("获取所有物业收费信息")
    @GetMapping("/getCharges")
    public List<ChargeDto> getCharges(){
		List<ChargeDto> list=chargeMapper.getCharges();
		return list;
	}
	
	@ApiOperation("新增物业收费信息")
    @PostMapping("/insertCharge")
    public int insertCharge(@RequestBody Charge Charge){
		int i=chargeMapper.insert(Charge);
		return i;
	}
	
	@ApiOperation("修改物业收费信息")
    @PutMapping("/updateCharge")
    public int updateCharge(@RequestBody Charge Charge){
		int i=chargeMapper.updateById(Charge);
		return i;
	}
	
	@ApiOperation("删除物业收费信息")
    @RequestMapping("/deleteCharge")
    public int deleteCharge(int cid){
		int i=chargeMapper.deleteById(cid);
		return i;
		//aaaaa
		//bbbbb
	}
}
