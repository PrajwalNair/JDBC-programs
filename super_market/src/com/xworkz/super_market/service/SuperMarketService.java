package com.xworkz.super_market.service;

import java.util.List;

import com.xworkz.super_market.dto.SuperMarketDTO;

public interface SuperMarketService {
	boolean validateAndSave(SuperMarketDTO dto);
	void displayByName (String name);
	boolean validateAndSave(List<SuperMarketDTO> list);
	
	

}
