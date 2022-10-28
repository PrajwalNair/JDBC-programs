package com.xworkz.super_market.repository;

import java.util.List;

import com.xworkz.super_market.dto.SuperMarketDTO;

public interface SuperMarketRepository {
	boolean save(SuperMarketDTO dto);
	void displayByName(String name);
	boolean save(List<SuperMarketDTO> list);
	
	
	SuperMarketDTO findByName(String name);
	SuperMarketDTO findById(int id);
	List<SuperMarketDTO> findAll();
	List<SuperMarketDTO> findByType(String type);
	List<SuperMarketDTO> findByPincodeAndType(String type, int pincode);
	int totalCount();
	

}
