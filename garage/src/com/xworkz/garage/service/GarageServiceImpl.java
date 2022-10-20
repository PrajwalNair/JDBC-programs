package com.xworkz.garage.service;

import com.xworkz.garage.dto.GarageDTO;
import com.xworkz.garage.repository.GarageRepository;
import com.xworkz.garage.repository.GarageRepositoryImpl;

public class GarageServiceImpl implements GarageService {

	@Override
	public boolean validateAndSave(GarageDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String state = dto.getState();
		String country = dto.getCountry();
		String city = dto.getCity();
		double rating = dto.getRating();
		if (id > 0 && id < 500) {
			System.out.println("id is valid");
			if (name != null && name.length() > 3 && name.length() < 50) {
				System.out.println("name is valid");
				if (state != null && state.length() > 2 && state.length() < 50) {
					System.out.println("state is invalid");
					if (country != null && country.length() > 2 && country.length() < 50) {
						System.out.println("country is valid");
						if (city != null && city.length() > 2 && city.length() < 50) {
							System.out.println("city is valid");
							if (rating > 0 && rating <= 5) {
								System.out.println("rating is valid");
								GarageRepository garageRepository = new GarageRepositoryImpl();
								garageRepository.save(dto);
							} else {
								System.err.println("rating is invalid");
							}
						} else {
							System.err.println("city is invalid");
						}
					} else {
						System.err.println("country is invalid");
					}
				} else {
					System.err.println("state is invalid");
				}
			} else {
				System.err.println("name is invalid");
			}
		} else {
			System.out.println("is is invalid");
		}

		return false;
	}

	@Override
	public GarageDTO findbyId(int id) {
		System.out.println("finding id");

		GarageRepository garageRepository = new GarageRepositoryImpl();
		return garageRepository.findbyId(id);
	}

	@Override
	public void updateNameById(String newName, int id) {
		System.out.println("Update method");
		GarageRepository garageRepository = new GarageRepositoryImpl();
		if(newName!=null && newName.length()>3 && newName.length()<50) {
			System.out.println("new name is valid");
			garageRepository.updateNameById(newName, id);
		}else {
			System.out.println("new name is inavlid");
		}
		
	}

	@Override
	public void deleteById( int id) {
		System.out.println("Delete method");
		GarageRepository garageRepository = new GarageRepositoryImpl();
		garageRepository.deleteById(id);

	}

}
