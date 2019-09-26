package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Personnel;
import com.example.demo.mapper.PersonnelMapper;

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
@Api(value = "人事管理操作", description = "人事管理操作")
@RequestMapping("/personnel")
public class PersonnelController {
	@Autowired
	private PersonnelMapper personnelMapper;
	
	@ApiOperation("获取所有人事信息")
    @GetMapping("/getPersonnels")
    public List<Personnel> getPersonnels(){
		List<Personnel> list=personnelMapper.selectList(null);
		return list;
	}
	
	@ApiOperation("新增人事信息")
    @PostMapping("/insertPersonnel")
    public int insertPersonnel(@RequestBody Personnel Personnel){
		int i=personnelMapper.insert(Personnel);
		return i;
	}
	
	@ApiOperation("修改人事信息")
    @PutMapping("/updatePersonnel")
    public int updatePersonnel(@RequestBody Personnel Personnel){
		int i=personnelMapper.updateById(Personnel);
		return i;
	}
	
	@ApiOperation("删除人事信息")
    @RequestMapping("/deletePersonnel")
    public int deletePersonnel(int pid){
		int i=personnelMapper.deleteById(pid);
		return i;
	}
}
