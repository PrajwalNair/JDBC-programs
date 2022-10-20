package com.xworkz.property.service;

import com.xworkz.property.dto.PropertyDTO;
import com.xworkz.property.repository.PropertyRepository;
import com.xworkz.property.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {
	@Override
	public boolean validateAndSave(PropertyDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		int age = dto.getAge();
		String state = dto.getState();
		String country = dto.getCountry();
		String city = dto.getCity();
		if(id>0 && id<100000) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<50) {
				System.out.println("name is valid");
				if(age>0) {
					System.out.println("Age is valid ");
					if(state!=null && state.length()>2 && state.length()<50) {
						System.out.println("state is valid");
						if(country!=null && country.length()>3 && country.length()<50) {
							System.out.println("country is valid");
							if (city!=null && city.length()>3 && city.length()<50) {
								System.out.println("city is valid");
								PropertyRepository propertyRepository = new PropertyRepositoryImpl();
								propertyRepository.save(dto);
							}else {
								System.err.println("city is invalid");
							}
						}else {
							System.err.println("country is invalid");
						}
					}else {
						System.err.println("state is invalid");
					}
				}else {
					System.err.println("Age is invalid");
				}
			}else {
				System.err.println("name invalid");
			}
		}else {
			System.out.println("id is invalid");
		}
		
		
		return false;
	}

}
