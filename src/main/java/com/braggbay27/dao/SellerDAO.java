package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.Seller;





public interface SellerDAO extends GenericDAO<Seller, Integer> {
  
	List<Seller> findAll();
	






}


