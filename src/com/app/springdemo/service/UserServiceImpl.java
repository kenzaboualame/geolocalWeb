package com.app.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.springdemo.dao.UserDAO;
import com.app.springdemo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// need to inject customer DAO
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public List<User> getUsers() {

		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {

		userDAO.saveUser(theUser);
	}

	@Override
	@Transactional
	public User getUser(int theId) {
		return userDAO.getUser(theId);
	}

	@Override
	@Transactional
	public void deleteUser(int theId) {
		userDAO.deleteUser(theId);
		
	}

}
