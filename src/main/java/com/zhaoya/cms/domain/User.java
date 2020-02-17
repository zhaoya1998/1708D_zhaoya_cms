package com.zhaoya.cms.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String username;

    private String password;
    
    private  String repassword;//重复密码

    private String nickname;//昵称

    private Date birthday;//

    private Integer gender;//0:女,1:男

    private Integer locked;//1:禁用 .0:正常.默认 0

    private Date created;

    private Date updated;

    private String role;//角色: 0:普通用户  1:管理员

    private String url;

    private String isRemember;//记住用户

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsRemember() {
		return isRemember;
	}

	public void setIsRemember(String isRemember) {
		this.isRemember = isRemember;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User(Integer id, String username, String password, String repassword, String nickname, Date birthday,
			Integer gender, Integer locked, Date created, Date updated, String role, String url, String isRemember) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.nickname = nickname;
		this.birthday = birthday;
		this.gender = gender;
		this.locked = locked;
		this.created = created;
		this.updated = updated;
		this.role = role;
		this.url = url;
		this.isRemember = isRemember;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
    
}