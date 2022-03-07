package com.admin.model;
//实体类 --实体类文件
//1. 私有化的成员属性变量
//2. 公有化的成员属性方法 getter/setter（用于外部访问）


public class AdminModel {
	//id name pass
	//AdminModel model = new AdminModel();
	//对象
	private String id;
	private String name;
	private String pass;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "AdminModel [id=" + id + ", name=" + name + ",  pass=" + pass+ "]";
	}

}
