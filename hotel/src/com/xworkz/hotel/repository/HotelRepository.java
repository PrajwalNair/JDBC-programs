package com.xworkz.hotel.repository;

import com.xworkz.hotel.dto.HotelDTO;

public interface HotelRepository {
	boolean save(HotelDTO dto);
	HotelDTO findById(int id);
	boolean updateNameById(String newName, int id);
	boolean deleteById(int id);

}
