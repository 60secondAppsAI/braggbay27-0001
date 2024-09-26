package com.braggbay27.dao;

import java.util.List;

import com.braggbay27.dao.GenericDAO;
import com.braggbay27.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


