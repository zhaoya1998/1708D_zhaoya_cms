package com.zhaoya.cms.service;

import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.Complain;
import com.zhaoya.cms.vo.ComplainVO;

public interface ComplainService {
	// 举报
	boolean insert(Complain complain);

	// 查询举报
	PageInfo<Complain> selects(ComplainVO complainVO, Integer page, Integer pageSize);

	//详情
	ArrayList<Complain> look(Integer id);
}
