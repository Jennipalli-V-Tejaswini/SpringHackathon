package com.stackroute.hackathon2.service;


	
	import org.junit.Before;
	import org.junit.Test;
	import org.mockito.Mock;
	import org.mockito.Mockito;
	import org.mockito.MockitoAnnotations;

import com.stackroute.hackathon2.domain.UserModel;
import com.stackroute.hackathon2.repository.UserRepository;

import static org.mockito.Mockito.*;
	import static org.hamcrest.CoreMatchers.equalTo;
	import static org.hamcrest.CoreMatchers.is;
	import static org.hamcrest.MatcherAssert.assertThat;
	public class UserServiceTest {
	    
	       
	       private UserService userService;
	        @Mock
	        private UserRepository userRepository;
	        @Mock
	        private UserModel user;
	        @Before
	        public void setupMock() {
	            MockitoAnnotations.initMocks(this);
	            userService=new UserService();
	            userService.setUserRepository(userRepository);
	        }
	        @Test
	        public void TestgetById() throws Exception {
	            // Arrange
	            when(userRepository.findOne(2)).thenReturn(user);
	            // Act
	            UserModel retrievedUser = userService.findById(2);
	            // Assert
	            assertThat(retrievedUser, is(equalTo(user)));
	       }
	        
	        /*@Test
	        public void TestUpdate() throws Exception {
	            // Arrange
	            when(userRepository.save(user)).thenReturn(user);
	            // Act
	            userService.updateUser(user);
	            // Assert
	            assertThat(userRepository.findOne(1), is(userRepository.findOne(1)));
	        }*/
	        @Test
	        public void TestDelete() throws Exception {
	            // Arrange
	            doNothing().when(userRepository).delete(1);
	            UserRepository my = Mockito.mock(UserRepository.class);
	            // Act
	           userService.deleteUser(1);
	            // Assert
	            verify(userRepository, times(1)).delete(1);
	        }
	    }


