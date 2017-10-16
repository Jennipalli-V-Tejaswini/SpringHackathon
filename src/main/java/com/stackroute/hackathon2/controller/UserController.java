package com.stackroute.hackathon2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.hackathon2.domain.UserModel;
import com.stackroute.hackathon2.interf.UserInterface;
import com.stackroute.hackathon2.service.UserService;


@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	public UserService userService;

	@RequestMapping
	public ResponseEntity<Iterable<UserModel>> getAllUsers() {
		
		return new ResponseEntity<Iterable<UserModel>>(userService.getAllUsers(), HttpStatus.OK);
	}

	@RequestMapping("{userid}")
	public ResponseEntity<UserModel> getUser(@PathVariable(value = "userid") int id) {
		return new ResponseEntity<UserModel>(userService.getUser(id), HttpStatus.OK);
	}

	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody UserModel userModel) {
		userService.addUser(userModel);
		return new ResponseEntity<String>("Added successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "{userid}", method = RequestMethod.DELETE)
	public ResponseEntity<String> Delete(@PathVariable(value = "userid") int id) {
		userService.deleteUser(id);
		return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);

	}
	
	@RequestMapping(value = "{userid}/{emailId}", method = RequestMethod.PUT)
	public ResponseEntity<String> Update(@PathVariable(value = "userid") int id,@PathVariable(value = "emailId") String EmailId) {
		userService.updateUser(id,EmailId);
		return new ResponseEntity<String>("Updated successfully", HttpStatus.OK);

	}
	

}