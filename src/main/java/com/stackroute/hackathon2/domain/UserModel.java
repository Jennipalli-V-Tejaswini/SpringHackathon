package com.stackroute.hackathon2.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class UserModel {
	
	@Id
	
	
	private String UserId;
	private String UserEmailId;
	private String UserName;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserEmailId() {
		return UserEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		UserEmailId = userEmailId;
	}
	
	public UserModel() {}

	
}
