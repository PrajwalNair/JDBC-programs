package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("data is saved :" +dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
