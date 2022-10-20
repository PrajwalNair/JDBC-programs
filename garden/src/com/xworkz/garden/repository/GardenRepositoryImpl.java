package com.xworkz.garden.repository;

import com.xworkz.garden.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository{
	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("Data is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
