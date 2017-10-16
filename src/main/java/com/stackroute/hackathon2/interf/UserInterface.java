package com.stackroute.hackathon2.interf;

import java.util.List;

import com.stackroute.hackathon2.domain.UserModel;

public interface UserInterface {

		
		public List<UserModel> getAllUsers( );
		   public  UserModel addUser(UserModel userModel);
		   public  void deleteUser(String id);
	       public  void getUser(String id);
	       public void updateUser(String id);
		   

	}
