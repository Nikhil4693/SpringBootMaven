package com.bs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.bean.User;
import com.bs.repo.UserDAO;

public interface UserService {
public User saveUser(User user);
public User updateUser(User user);
public User getUser(int userId);
public List<User> getAllUsers();
public String deleteUser(int userId);
	
}
