package com.xworkz.garden.service;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.repository.GardenRepository;
import com.xworkz.garden.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {
	@Override
	public boolean validateAndSave(GardenDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		double entryFees = dto.getEntryFees();
		String state = dto.getState();
		String country = dto.getCountry();
		String city = dto.getCity();
		if(id>0 && id<5000) {
			System.out.println("is is valid");
			if(name!=null && name.length()>3 && name.length()<50) {
				System.out.println("name is valid");
				if(entryFees == 10) {
					System.out.println("entry fees is valid");
					if(state!=null && state.length()>2 && state.length()<50) {
						System.out.println("state is valid");
						if(country!=null && country.length()>2 && country.length()<50) {
							System.out.println("country is valid");
							if(city!=null && city.length()>2 && city.length()<50) {
								System.out.println("city is valid");
								GardenRepository gardenRepository = new GardenRepositoryImpl();
								gardenRepository.save(dto);
								
							}else{
								System.out.println("city is invalid");
							}
						}else {
							System.out.println("country is invalid");
						}
					}else {
						System.err.println("state is invalid");
					}
				}else {
					System.err.println("entry fees is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.out.println("id is invalid");
		}
		
		
		return false;
	}
}
