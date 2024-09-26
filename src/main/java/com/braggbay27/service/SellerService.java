package com.braggbay27.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay27.domain.Seller;
import com.braggbay27.dto.SellerDTO;
import com.braggbay27.dto.SellerSearchDTO;
import com.braggbay27.dto.SellerPageDTO;
import com.braggbay27.dto.SellerConvertCriteriaDTO;
import com.braggbay27.service.GenericService;
import com.braggbay27.dto.common.RequestDTO;
import com.braggbay27.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface SellerService extends GenericService<Seller, Integer> {

	List<Seller> findAll();

	ResultDTO addSeller(SellerDTO sellerDTO, RequestDTO requestDTO);

	ResultDTO updateSeller(SellerDTO sellerDTO, RequestDTO requestDTO);

    Page<Seller> getAllSellers(Pageable pageable);

    Page<Seller> getAllSellers(Specification<Seller> spec, Pageable pageable);

	ResponseEntity<SellerPageDTO> getSellers(SellerSearchDTO sellerSearchDTO);
	
	List<SellerDTO> convertSellersToSellerDTOs(List<Seller> sellers, SellerConvertCriteriaDTO convertCriteria);

	SellerDTO getSellerDTOById(Integer sellerId);







}




