package com.zhaoya.cms.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.dao.ArticleMapper;
import com.zhaoya.cms.dao.ComplainMapper;
import com.zhaoya.cms.domain.Complain;
import com.zhaoya.cms.util.CMSException;
import com.zhaoya.cms.vo.ComplainVO;
import com.zhaoya.common.untils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml") 
@Service
public class ComplainServiceImpl implements ComplainService {
	@Resource
	private ComplainMapper complainMapper;
	@Resource
	private ArticleMapper articleMapper;

	@Override
	public boolean insert(Complain complain) {
		try {
			//校验举报的地址是否合法
			boolean b = StringUtil.isHttpUrl(complain.getUrl());
			if(!b) {
				throw new CMSException("url 不合法");
			}
			
			//举报
			complainMapper.insert(complain);
			//增加次数
			articleMapper.updateComplainnum(complain.getArticleId());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("举报失败");
			
		}
	
	}

	@Override
	public PageInfo<Complain> selects(ComplainVO complainVO, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Complain> list = complainMapper.selects(complainVO);
		return new PageInfo<Complain>(list);
	}
	
	//进行单元测试，保存投诉表必须进行测试
	@Test
	public void testInsert() {
		boolean b = StringUtil.isHttpUrl("fveffdafd dvf");
		System.out.println(b);
	}

	@Override
	public ArrayList<Complain> look(Integer id) {
		// TODO Auto-generated method stub
		return complainMapper.look(id);
	}
    

}
