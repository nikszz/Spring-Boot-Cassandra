package com.project.Controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Repository.UserRepository;
import com.project.pojo.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;

	@RequestMapping("/")
	public void saveUser() {

		List<User> users = new ArrayList<>();
		users.add(new User(0, "Nikhil", "delhi", 25));
		users.add(new User(1, "navin", "nepal", 21));
		users.add(new User(2, "ANil", "delhi", 55));
		users.add(new User(3, "dinesh", "kolkata", 27));
		users.add(new User(4, "akhil", "kanpur", 35));
		repo.saveAll(users);
		System.out.println("Data Injected");
	}

	@RequestMapping("/getAllUsers")
	public List<User> getUsers(){
		return repo.findAll();
	}

	
	
	
}
