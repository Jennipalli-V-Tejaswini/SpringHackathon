package com.stackroute.hackathon2.controller;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.stackroute.hackathon2.Application;
import com.stackroute.hackathon2.domain.UserModel;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest extends TestCase {
    
    String user1;
    
    @LocalServerPort
    private int port;
    
    TestRestTemplate restTemplate = new TestRestTemplate();
    
    HttpHeaders headers = new HttpHeaders();
    
    UserModel user;
    
    @Before
    public void setUp() throws Exception {
         user = new UserModel(1,"chidiya","chidiya@yahoo.com","sdfgds");
    }
    
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
    
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testAddUsers() throws Exception {
        HttpEntity<UserModel> entity = new HttpEntity<UserModel>(user, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user"),
                HttpMethod.POST, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Added successfully",actual);
    }
    
   @Test
    public void testGetAllUsers() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);
    }
    
   @Test
    public void testgetUsersById() throws Exception{
        HttpEntity<UserModel> entity = new HttpEntity<UserModel>(user, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user/1"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);
    }
    
   @Test
    public void testdeleteUsersById() throws Exception{
        HttpEntity<UserModel> entity = new HttpEntity<UserModel>(user, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/user/1"),
                HttpMethod.DELETE, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("deleted successfully",actual);

   }
    
}