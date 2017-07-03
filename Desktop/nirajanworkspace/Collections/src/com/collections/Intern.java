package com.collections;

public class Intern {
	private String name;
	private String regNo;
	private String address;
	private Long phNumber;

	public Intern(String name, String regNo, String address, Long phNumber) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.address = address;
		this.phNumber = phNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(Long phNumber) {
		this.phNumber = phNumber;
	}

}
