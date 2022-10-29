package com.xworkz.city;

import com.xworkz.city.dto.CityDTO;
import com.xworkz.city.service.CityService;
import com.xworkz.city.service.CityServiceImpl;

public class CityDisplay {

	public static void main(String[] args) {
		CityDTO cityDTO = new CityDTO(1, "Hubli", "kannada", "india", "karnataka");
		CityDTO cityDTO1 = new CityDTO(2, "kannur", "malayalam", "india", "kerala");
		CityDTO cityDTO2 = new CityDTO(3, "bangalore", "kannada", "india", "karnataka");
		CityDTO cityDTO3 = new CityDTO(4, "kochi", "malayalam", "india", "kerala");
		CityDTO cityDTO4 = new CityDTO(5, "belgaum", "kannada", "india", "karnataka");
		
		CityService service =new CityServiceImpl();
		service.validateAndSave(cityDTO);
		service.validateAndSave(cityDTO1);
		service.validateAndSave(cityDTO2);
		service.validateAndSave(cityDTO3);
		service.validateAndSave(cityDTO4);
		

	}

}
