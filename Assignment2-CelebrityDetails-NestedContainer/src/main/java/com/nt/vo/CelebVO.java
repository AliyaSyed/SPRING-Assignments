package com.nt.vo;

public class CelebVO {
	private String serialNo;
	private String cid;
	private String cname;
	private String cIndustry;
	private String age;
	private String cType;
	

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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
		return "CelebVO [serialNo=" + serialNo + ", cid=" + cid + ", cname=" + cname + ", cIndustry=" + cIndustry
				+ ", age=" + age + ", cType=" + cType + "]";
	}
	
	
}
