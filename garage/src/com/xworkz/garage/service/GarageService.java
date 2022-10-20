package com.xworkz.garage.service;

import com.xworkz.garage.dto.GarageDTO;

public interface GarageService {
	boolean validateAndSave(GarageDTO dto);
	GarageDTO findbyId(int id);
	void updateNameById (String newName,int id);
	void deleteById(int id);

}
