package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


