package com.zhaoya.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaoya.cms.dao.SlideMapper;
import com.zhaoya.cms.domain.Slide;
import com.zhaoya.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {
	@Resource
	private SlideMapper slideMapper;

	@Override
	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideMapper.selects();
	}

}
