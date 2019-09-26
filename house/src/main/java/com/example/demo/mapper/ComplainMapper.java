package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.dto.ComplainDto;
import com.example.demo.entity.Complain;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public interface ComplainMapper extends BaseMapper<Complain> {
	//查询所有
	@Select("select c.cpid,c.cpcontent,c.cptime,c.cpreid,re.rename cprename,c.cppida,pa.pname cppaname,c.cppidb,pb.pname cppbname from complain c,resident re,personnel pa,personnel pb\n" + 
			"where c.cpreid=re.reid and c.cppida=pa.pid and c.cppidb=pb.pid")
	public List<ComplainDto> getComplains();
}
