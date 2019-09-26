package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.WarrantyDto;
import com.example.demo.entity.Warranty;
import com.example.demo.mapper.WarrantyMapper;

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
@Api(value = "住户保修管理操作", description = "住户保修管理操作")
@RequestMapping("/warranty")
public class WarrantyController {
	@Autowired
	private WarrantyMapper warrantyMapper;
	
	@ApiOperation("获取所有物业管理信息")
    @GetMapping("/getWarrantys")
    public List<WarrantyDto> getWarrantys(){
		List<WarrantyDto> list=warrantyMapper.getWarrantys();
		return list;
	}
	
	@ApiOperation("新增物业管理信息")
    @PostMapping("/insertWarranty")
    public int insertWarranty(@RequestBody Warranty Warranty){
		int i=warrantyMapper.insert(Warranty);
		return i;
	}
	
	@ApiOperation("修改物业管理信息")
    @PutMapping("/updateWarranty")
    public int updateWarranty(@RequestBody Warranty Warranty){
		int i=warrantyMapper.updateById(Warranty);
		return i;
	}
	
	@ApiOperation("删除物业管理信息")
    @RequestMapping("/deleteWarranty")
    public int deleteWarranty(int wid){
		int i=warrantyMapper.deleteById(wid);
		return i;
	}
}
