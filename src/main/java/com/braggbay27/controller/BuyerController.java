package com.braggbay27.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggbay27.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggbay27.domain.Buyer;
import com.braggbay27.dto.BuyerDTO;
import com.braggbay27.dto.BuyerSearchDTO;
import com.braggbay27.dto.BuyerPageDTO;
import com.braggbay27.service.BuyerService;
import com.braggbay27.dto.common.RequestDTO;
import com.braggbay27.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/buyer")
@RestController
public class BuyerController {

	private final static Logger logger = LoggerFactory.getLogger(BuyerController.class);

	@Autowired
	BuyerService buyerService;



	//@AllowSystem(AuthScopes.READ)
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Buyer> getAll() {

		List<Buyer> buyers = buyerService.findAll();
		
		return buyers;	
	}

	//@ReadAccess
	@GetMapping(value = "/{buyerId}")
	@ResponseBody
	public BuyerDTO getBuyer(@PathVariable Integer buyerId) {
		
		return (buyerService.getBuyerDTOById(buyerId));
	}

 	//@WriteAccess
 	@RequestMapping(value = "/addBuyer", method = RequestMethod.POST)
	public ResponseEntity<?> addBuyer(@RequestBody BuyerDTO buyerDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = buyerService.addBuyer(buyerDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}
		
		return result.asResponseEntity();
	}

	//@ReadAccess
	@GetMapping("/buyers")
	public ResponseEntity<BuyerPageDTO> getBuyers(BuyerSearchDTO buyerSearchDTO) {
 
		return buyerService.getBuyers(buyerSearchDTO);
	}	

 	//@WriteAccess
	@RequestMapping(value = "/updateBuyer", method = RequestMethod.POST)
	public ResponseEntity<?> updateBuyer(@RequestBody BuyerDTO buyerDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = buyerService.updateBuyer(buyerDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}