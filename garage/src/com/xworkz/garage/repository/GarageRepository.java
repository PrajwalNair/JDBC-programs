package com.xworkz.garage.repository;

import com.xworkz.garage.dto.GarageDTO;

public interface GarageRepository {
	boolean save(GarageDTO dto);

	GarageDTO findbyId(int id);

	void updateNameById(String newName, int id);

	void deleteById(int id);
}
