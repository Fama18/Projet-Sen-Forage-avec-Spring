package com.senforage.service;

import java.util.List;

import com.senforage.entities.User;

public interface UserService {
	
	User saveUser(User u);
	List<User> getAllUsers();

}
