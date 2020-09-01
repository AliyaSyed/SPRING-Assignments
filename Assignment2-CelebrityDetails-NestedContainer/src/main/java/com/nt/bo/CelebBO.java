package com.nt.bo;

import java.io.Serializable;

public class CelebBO implements Serializable {
	private Integer serialNo;
	private Integer cid;
	private String cname;
	private String cIndustry;
	private Integer age;
	private String cType;
	
	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getcIndustry() {
		return cIndustry;
	}

	public void setcIndustry(String cIndustry) {
		this.cIndustry = cIndustry;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	@Override
	public String toString() {
		return "CelebBO [serialNo=" + serialNo + ", cid=" + cid + ", cname=" + cname + ", cIndustry=" + cIndustry
				+ ", age=" + age + ", cType=" + cType + "]";
	}
	
	

}
