package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ComplainDto;
import com.example.demo.entity.Complain;
import com.example.demo.mapper.ComplainMapper;

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
@Api(value = "住户投诉管理操作", description = "住户投诉管理操作")
@RequestMapping("/complain")
public class ComplainController {
	@Autowired
	private ComplainMapper complainMapper;
	
	@ApiOperation("获取所有物业管理信息")
    @GetMapping("/getComplains")
    public List<ComplainDto> getComplains(){
		List<ComplainDto> list=complainMapper.getComplains();
		return list;
	}
	
	@ApiOperation("新增物业管理信息")
    @PostMapping("/insertComplain")
    public int insertComplain(@RequestBody Complain Complain){
		int i=complainMapper.insert(Complain);
		return i;
	}
	
	@ApiOperation("修改物业管理信息")
    @PutMapping("/updateComplain")
    public int updateComplain(@RequestBody Complain Complain){
		int i=complainMapper.updateById(Complain);
		return i;
	}
	
	@ApiOperation("删除物业管理信息")
    @RequestMapping("/deleteComplain")
    public int deleteComplain(int cpid){
		int i=complainMapper.deleteById(cpid);
		return i;
	}
}
