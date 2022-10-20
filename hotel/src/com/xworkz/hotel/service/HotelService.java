package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDTO;

public interface HotelService {
	boolean validateAndSave(HotelDTO dto);
	HotelDTO findById(int id);
	boolean validateUpdateNameById(String newName,int id);
	boolean deleteById(int id);
	

}
