package com.stackroute.hackathon2.service;

import java.util.List;

import org.tejas.NewsAggregator.domain.NewsModel;

import com.stackroute.hackathon2.domain.UserModel;
import com.stackroute.hackathon2.interf.UserInterface;

public class UserService implements UserInterface {

	@Override
	public List<UserModel> getAllUsers() {
		List<UserModel> List1=(List<UserModel>)newsAggregatorRepository.findAll();
		return null;
	}

	@Override
	public UserModel addUser(UserModel userModel) {
		// TODO Auto-generated method stub
		newsAggregatorRepository.save(newsModel);
		
		return null;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		newsAggregatorRepository.delete(UserId);
		
	}

	@Override
	public void getUser(String id) {
		// TODO Auto-generated method stub
		newsAggregatorRepository.get(UserId);
		
	}

	@Override
	public void updateUser(String id) {
		// TODO Auto-generated method stub
		
	}

}
