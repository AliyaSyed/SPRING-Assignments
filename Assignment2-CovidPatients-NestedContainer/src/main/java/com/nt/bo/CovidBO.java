package com.nt.bo;

import java.io.Serializable;

public class CovidBO  implements Serializable{
	private Integer serialNo;
	private Integer pid;
	private String pname;
	private Integer age;
	private String paddr;
	private String gender;
	
	
	@Override
	public String toString() {
		return "CovidBO [serialNo=" + serialNo + ", pid=" + pid + ", pname=" + pname + ", age=" + age + ", paddr="
				+ paddr + ", gender=" + gender + "]";
	}
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}
