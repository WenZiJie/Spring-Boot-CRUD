package com.wen.crud.user.entity;


public class User {
	private int id;
	private String userCode;
	private String userName;
	private String userPassword;
	private String gender;
	private String birthday;
	private String phone;
	private String address;
	private String userRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public User(String userCode, String userName, String birthday, String phone, String address,String gender) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}
	public User() {	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", birthday=" + birthday
				+ ", phone=" + phone + ", address=" + address +  ", gender=" + gender + "]";
	}
	
	
}
