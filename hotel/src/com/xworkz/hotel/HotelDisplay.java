package com.xworkz.hotel;

import com.xworkz.hotel.dto.HotelDTO;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImpl;

public class HotelDisplay {

	public static void main(String[] args) {
		HotelDTO hotelDTO = new HotelDTO(1,"Canara", "veg", "india", "karnataka", "hubli", 4.9d, 5, 10, 5, 1983);
		HotelService hotelService = new HotelServiceImpl();
		//hotelService.validateAndSave(hotelDTO);
		HotelDTO findById = hotelService.findById(1);
		System.out.println(findById);
		hotelService.validateUpdateNameById("karnataka bhavan", 1);
		hotelService.deleteById(1);
		
	}

}
