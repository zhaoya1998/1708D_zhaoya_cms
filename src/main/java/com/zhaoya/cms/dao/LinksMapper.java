package com.zhaoya.cms.dao;

import com.zhaoya.cms.domain.Links;

public interface LinksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);

    Links selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}