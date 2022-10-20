package com.xworkz.garage;

import com.xworkz.garage.dto.GarageDTO;
import com.xworkz.garage.service.GarageService;
import com.xworkz.garage.service.GarageServiceImpl;

public class GarageDisplay {

	public static void main(String[] args) {
		GarageDTO garageDTO = new GarageDTO(1,"Cleanse", "Karnataka", "India", "Hubli", 4.7);
		GarageService garageService = new GarageServiceImpl();
		garageService.validateAndSave(garageDTO);

	}

}
