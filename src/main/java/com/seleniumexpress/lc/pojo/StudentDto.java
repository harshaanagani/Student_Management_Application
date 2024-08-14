package com.seleniumexpress.lc.pojo;

public class StudentDto {
	private String name="Mr x";
	private long mobile=8499940L;
	private String country="India";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	
}
