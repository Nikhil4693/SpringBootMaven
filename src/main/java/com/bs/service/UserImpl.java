package com.bs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bs.bean.User;
import com.bs.repo.UserDAO;
@Service
public class UserImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public User saveUser(User user) {
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		User existedUser = getUser(user.getId());
		if (user.getId() != 0)
			return dao.save(user);
		else
			return null;
	}

	@Override
	public User getUser(int iduser) {
		Optional<User> existedUser = dao.findById(iduser);
		if (existedUser.isPresent())
			return existedUser.get();
		else
			return null;
	}

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}

	@Override
	public String deleteUser(int id) {
		Optional<User> existedUser = dao.findById(id);
		if (existedUser.isPresent()) {
			dao.deleteById(id);
			return "deleted";
		} else
			return "user not present";
	}

}
