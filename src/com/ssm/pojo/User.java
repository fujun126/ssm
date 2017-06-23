package com.ssm.pojo;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	
	private  Integer  id;
	@Size(min=1,max=10,message="{user.name.length}")
	private  String   name;
	@NotNull(message="{user.pwd.isNotNull}")
	private  String   pwd;
	//@Pattern(regexp="[0-9]{4}-[0-9]{2}-[0-9]{2}",message="{user.birthday.ne}")
	
	private  Date     birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
