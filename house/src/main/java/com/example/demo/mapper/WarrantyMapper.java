package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.WarrantyDto;
import com.example.demo.entity.Warranty;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface WarrantyMapper extends BaseMapper<Warranty> {
	//查询所有
	@Select("select w.wid,w.wcontent,w.wtime,w.wreid,re.rename wrename,w.wpida,pa.pname wpaname,w.wpidb,pb.pname wpbname from warranty w,resident re,personnel pa,personnel pb\n" + 
			"where w.wreid=re.reid and w.wpida=pa.pid and w.wpidb=pb.pid")
	public List<WarrantyDto> getWarrantys();
}
