package com.capgemini.olx.olx.loginpojo;

public class LoginPojo {
	
	private String name;
	private String address;
	private String password;
	private String emailId;
	private String phoneNo;
	
	private String userId;
	private String userType;
	private boolean activated;
	
	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public LoginPojo(String name, String address, String password,
			String emailId, String phoneNo, String userId, String userType,
			boolean activated) {
		super();
		this.name = name;
		this.address = address;
		this.password = password;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.userId = userId;
		this.userType = userType;
		this.activated = activated;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}



	@Override
	public String toString() {
		return "LoginPojo [name=" + name + ", address=" + address
				+ ", password=" + password + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + ", userId=" + userId + ", userType="
				+ userType + ", activated=" + activated + "]";
	}
	
	

	
}
