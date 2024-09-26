package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


