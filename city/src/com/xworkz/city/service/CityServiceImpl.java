package com.xworkz.city.service;

import com.xworkz.city.dto.CityDTO;
import com.xworkz.city.repository.CityRepository;
import com.xworkz.city.repository.CityRepositoryImpl;

public class CityServiceImpl implements CityService {

	CityRepository repository = new CityRepositoryImpl();
	@Override
	public boolean validateAndSave(CityDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String language = dto.getLanguage();
		String country = dto.getCountry();
		String state = dto.getState();
		if(id>0) {
			System.out.println("id is valid");
			if(name!=null && name.length()>2 && name.length()<25) {
				System.out.println("name is valid");
				if(language!=null && language.length()>2 && language.length()<25) {
					System.out.println("language is valid");
					if(country!=null && country.length()>2 && country.length()<25) {
						System.out.println("country is valid");
						if(state!=null && state.length()>2 && state.length()<25) {
							System.out.println("state is valid");
							this.repository.save(dto);
						}else {
							System.err.println("state is invalid");
						}
					}else {
						System.err.println("country is invalid");
					}
				}else {
					System.err.println("language is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.err.println("id is invalid");
		}
		
		return true;
	}

}
