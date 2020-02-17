package com.zhaoya.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaoya.cms.domain.Complain;
import com.zhaoya.cms.vo.ComplainVO;

public interface ComplainMapper {
	
	int insert(Complain complain);
	
	//查询举报
	List<Complain> selects(ComplainVO complainVO);

	ArrayList<Complain> look(@Param("id")Integer id);

}
