package com.xworkz.garden;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.service.GardenService;
import com.xworkz.garden.service.GardenServiceImpl;

public class GardenDisplay {
	public static void main(String[] args) {
		GardenDTO gardenDTO = new GardenDTO(1,"MG park", 10, "Karnataka", "India", "Hubli");
		GardenService gardenService = new GardenServiceImpl();
		gardenService.validateAndSave(gardenDTO);
		
	}

}
