package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}

