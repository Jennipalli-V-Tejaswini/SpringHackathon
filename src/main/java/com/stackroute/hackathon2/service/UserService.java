package com.stackroute.hackathon2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.stackroute.hackathon2.domain.UserModel;
import com.stackroute.hackathon2.interf.UserInterface;
import com.stackroute.hackathon2.repository.UserRepository;

@Service

public class UserService implements UserInterface {
	@Autowired
	public UserRepository userRepository;
	

	@Override
	public List<UserModel> getAllUsers() {
		List<UserModel> List1=(List<UserModel>)userRepository.findAll();
		return List1;
	}

	@Override
	public void addUser(UserModel userModel) {
		// TODO Auto-generated method stub
		
		userRepository.save(userModel);
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
		}
	
    @Override
	public UserModel getUser(int id) {
		// TODO Auto-generated method stub 
		return userRepository.findOne(id);
		}

	@Override
	public void updateUser(int id,UserModel userModel) {
		userRepository.delete(id);
		userRepository.save(userModel);
		
		
	}

	public void setUserRepository(UserRepository userRepository2) {
	this.userRepository=userRepository2;
		
	}
    
}

	

	


