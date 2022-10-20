package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDTO;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.repository.HotelRepositoryImpl;

public class HotelServiceImpl implements HotelService {

	@Override
	public boolean validateAndSave(HotelDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String type = dto.getType();
		String country = dto.getCountry();
		String state = dto.getState();
		String city = dto.getCity();
		double rating = dto.getRating();
		int noOfWaiters = dto.getNoOfWaiters();
		int noOfChair = dto.getNoOfChair();
		int noOfTable = dto.getNoOfTable();
		int since = dto.getSince();
		if(id>0 && id<50) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<25) {
				System.out.println("name is valid");
				if(type=="veg" || type=="non veg") {
					System.out.println("type is valid");
					if(country!=null && country.length()>2 && country.length()<30) {
						System.out.println("country name is valid");
						if(state!=null && state.length()>2 && state.length()<35) {
							System.out.println("state name is valid");
							if(city!=null && city.length()>2 && city.length()<40) {
								System.out.println("city name is valid");
								if(rating>0 && rating<5) {
									System.out.println("rating is valid");
									if(noOfWaiters>0) {
										System.out.println("data of waiter is valid");
										if(noOfChair>0) {
											System.out.println("data of chair is valid");
											if(noOfTable>0) {
												System.out.println("data of table is valid");
												if(since>1950 && since<2023) {
													System.out.println("year is valid");
													HotelRepository hotelRepository = new HotelRepositoryImpl();
													hotelRepository.save(dto);
												}else {
													System.out.println("year is invalid");
												}
											}else {
												System.out.println("data of table is invalid");
											}
										}else {
											System.out.println("data of chair is invalid");
										}
									}else {
										System.out.println("data of waiter is invalid");
									}
								}else {
									System.out.println("rating is invalid");
								}
							}else {
								System.out.println("city name is invalid");
							}
						}else {
							System.out.println("state name is invalid");
						}
					}else {
						System.out.println("country name is invalid");
					}
				}else {
					System.err.println("type is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.err.println("id is invalid");
		}
		
		return false;
	}
	
	@Override
	public HotelDTO findById(int id) {
		HotelRepository hotelRepository = new HotelRepositoryImpl();
		return hotelRepository.findById(id);
	}
	
	@Override
	public boolean validateUpdateNameById(String newName, int id) {
		HotelRepository hotelRepository = new HotelRepositoryImpl();
		hotelRepository.updateNameById(newName, id);
		return false;
	}
	
	@Override
	public boolean deleteById(int id) {
		HotelRepository hotelRepository = new HotelRepositoryImpl();
		hotelRepository.deleteById(id);
		return false;
	}

}
