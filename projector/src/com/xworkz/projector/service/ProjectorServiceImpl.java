package com.xworkz.projector.service;

import com.xworkz.projector.dto.ProjectorDTO;
import com.xworkz.projector.repository.ProjectorRepository;
import com.xworkz.projector.repository.ProjectorRepositoryImpl;

public class ProjectorServiceImpl implements ProjectorService {
	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		int id = dto.getId();
		String type = dto.getType();
		String brand = dto.getBrand();
		double price = dto.getPrice();
		int usbPorts = dto.getNoOfUsbPort();
		double rating = dto.getRating();
		if(id>0 && id<50000) {
			System.out.println("id is valid");
			if(type!=null && type.length()>5 && type.length()<30) {
				System.out.println("type is valid");
				if(brand!=null && brand.length()>4 && brand.length()<50) {
					System.out.println("brand is valid");
					if(price>0) {
						System.out.println("price is valid");
						if(usbPorts>0 && usbPorts<5) {
							System.out.println("usb ports are valid");
							if(rating>0 && rating<5) {
								System.out.println("rating is valid");
								ProjectorRepository projectorRepository = new ProjectorRepositoryImpl();
								projectorRepository.save(dto);
							}else {
								System.err.println("rating is invalid");
							}
						}else {
							System.err.println("usb ports are invalid");
						}
					}else {
						System.err.println("price is invalid");
					}
				}else {
					System.err.println("brand is invalid");
				}
			}else {
				System.err.println("type is invalid");
			}
		}else {
			System.out.println("id is invalid");
		}
		
		
		return false;
	}

}
