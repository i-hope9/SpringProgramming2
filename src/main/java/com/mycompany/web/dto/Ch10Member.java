package com.mycompany.web.dto;

// 데이터베이스의 칼럼 이름을 갖고 만들기
public class Ch10Member {
	private String mid;
	private String mname;
	private String mpassword;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	
	
}
