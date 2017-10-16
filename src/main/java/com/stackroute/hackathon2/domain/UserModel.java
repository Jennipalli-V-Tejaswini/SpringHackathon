package com.stackroute.hackathon2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class UserModel {

	@Id
	//@GeneratedValue()
	@Column(name = "id")

	private int id;
	private String userId;
	private String userEmailId;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserModel(int id, String userId, String userEmailId, String userName) {
		super();
		this.id = id;
		this.userId = userId;
		this.userEmailId = userEmailId;
		this.userName = userName;
	}

	public UserModel() {
		
	}

}
