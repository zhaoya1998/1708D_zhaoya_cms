package com.zhaoya.cms.domain;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String title;

    private String picture;

    private Integer channelId;

    private Integer categoryId;

    private Integer userId;
    
    private User user;//发布人
    
    private Channel channel;//栏目
    private Category category;//分类

    private Integer hits;

    private Integer hot;

    private Integer status;

    private Integer deleted;

    private Date created;

    private Date updated;

    private Integer contentType;

    private String keywords;

    private String original;

    
    private Integer complainNum;//文章举报次数


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public Integer getChannelId() {
		return channelId;
	}


	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}


	public Integer getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Channel getChannel() {
		return channel;
	}


	public void setChannel(Channel channel) {
		this.channel = channel;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Integer getHits() {
		return hits;
	}


	public void setHits(Integer hits) {
		this.hits = hits;
	}


	public Integer getHot() {
		return hot;
	}


	public void setHot(Integer hot) {
		this.hot = hot;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getDeleted() {
		return deleted;
	}


	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Date getUpdated() {
		return updated;
	}


	public void setUpdated(Date updated) {
		this.updated = updated;
	}


	public Integer getContentType() {
		return contentType;
	}


	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}


	public String getKeywords() {
		return keywords;
	}


	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}


	public String getOriginal() {
		return original;
	}


	public void setOriginal(String original) {
		this.original = original;
	}


	public Integer getComplainNum() {
		return complainNum;
	}


	public void setComplainNum(Integer complainNum) {
		this.complainNum = complainNum;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Article(Integer id, String title, String picture, Integer channelId, Integer categoryId, Integer userId,
			User user, Channel channel, Category category, Integer hits, Integer hot, Integer status, Integer deleted,
			Date created, Date updated, Integer contentType, String keywords, String original, Integer complainNum) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.channelId = channelId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.user = user;
		this.channel = channel;
		this.category = category;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.contentType = contentType;
		this.keywords = keywords;
		this.original = original;
		this.complainNum = complainNum;
	}


	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}