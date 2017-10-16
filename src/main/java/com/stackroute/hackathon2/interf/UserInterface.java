package com.stackroute.hackathon2.interf;

import java.util.List;

import com.google.common.base.Optional;
import com.stackroute.hackathon2.domain.UserModel;

public interface UserInterface {

		
		public List<UserModel> getAllUsers( );
		   public  void addUser(UserModel userModel);
		   public  void deleteUser(int id);
	       public  UserModel getUser(int id);
	       public void updateUser(int id,UserModel userModel);
		   

	}
