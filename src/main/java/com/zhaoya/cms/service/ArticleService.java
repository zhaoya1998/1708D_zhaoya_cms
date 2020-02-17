package com.zhaoya.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.Article;
import com.zhaoya.cms.domain.ArticleWithBLOBs;

public interface ArticleService {
	/**
	 * 
	 * @Title: updateByPrimaryKeySelective
	 * @Description: 修改文章
	 * @param record
	 * @return
	 * @return: int
	 */
	int updateByPrimaryKeySelective(ArticleWithBLOBs record);

	/**
	 * 
	 * @Title: selectByPrimaryKey
	 * @Description: 文章详情
	 * @param id
	 * @return
	 * @return: ArticleWithBLOBs
	 */
	ArticleWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * 
	 * @Title: selects
	 * @Description: 文章列表
	 * @param article
	 * @param page
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Article>
	 */
	PageInfo<Article> selects(Article article, Integer page, Integer pageSize);

	/**
	 * 增加文章
	 * 
	 * @Title: insertSelective
	 * @Description: TODO
	 * @param record
	 * @return
	 * @return: int
	 */
	int insertSelective(ArticleWithBLOBs record);

}
