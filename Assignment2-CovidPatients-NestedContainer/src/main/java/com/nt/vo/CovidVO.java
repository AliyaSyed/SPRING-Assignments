package com.nt.vo;

public class CovidVO {
	private String serialNo;
	private String pid;
	private String pname;
	private String age;
	private String paddr;
	private String gender;
	
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
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
	@Override
	public String toString() {
		return "CovidBO [serialNo=" + serialNo + ", pid=" + pid + ", pname=" + pname + ", age=" + age + ", paddr="
				+ paddr + ", gender=" + gender + "]";
	}
	
	
}
