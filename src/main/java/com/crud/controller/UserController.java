package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.User;
import com.crud.repository.UserRepository;
import com.crud.service.UserService;

@RestController
public class UserController {
@Autowired
public UserService userService;

@GetMapping("/user")
private List<User>getAllUser()
{
	return userService.getAllUser();
}
@GetMapping("/user/{userid}")
private User getUser(@PathVariable ("userid") int userid) {
	return userService.getUserById(userid);
}
@DeleteMapping("/user/{userid}")  
private void deleteBook(@PathVariable("userid") int userid)   
{  
userService.delete(userid);  
}
@PostMapping("/user")  
private User saveUser(@RequestBody User user)   
{  
	return userService.saveOrUpdate(user);  
//return userService.getUserById(user);  
  

}
}