package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.repository.user;

@RestController
public class usercontroller {
	@Autowired
	user userr;
	@PostMapping("/saveusers")
	
	public String saveusers(@RequestBody User user1)
	{
	System.out.println(user1.getUserid());
	userr.save(user1);
	return "user save";
	
}
	@GetMapping("/user")
	public List<User>users(){
	List<User>userList=userr.findAll();
	return userList;
}


@DeleteMapping("/deleteuser/{id}")
public String deleteuser(@PathVariable int id)
{
	Optional<User>user1=userr.findById(id);
	if(user1.isPresent()) {
		userr.delete(user1.get());
	}
	return "user deleted";
	
	
	
}
@PutMapping("/updateuser/{id}")
public void updateUserData(@RequestBody User user1)
{
	userr.save(user1);
	
}


}
