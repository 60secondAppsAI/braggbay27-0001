package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.Buyer;





public interface BuyerDAO extends GenericDAO<Buyer, Integer> {
  
	List<Buyer> findAll();
	






}


