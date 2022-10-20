package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {
	
	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		int id = dto.getId();
		String name =dto.getName();
		String founder =dto.getFounder();
		String speacialist =dto.getSpecialist();
		int since =dto.getSince();
		if(id>0 && id<50000) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<50) {
				System.out.println("name is valid");
				if(founder!=null && founder.length()>3 && founder.length()<50) {
					System.out.println("founder name is valid");
					if(speacialist!=null && speacialist.length()>3 && speacialist.length()<50) {
						System.out.println("Speacialist is valid");
						if(since>1900 && since<2023) {
							System.out.println("year is valid");
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
						}
						else {
							System.out.println("year is invalid");
						}
					}
					else {
						System.out.println("Specialist is invalid");
					}
				}
				else {
					System.err.println("founder name is invalid");
				}
			}
			else {
				System.err.println("name is invalid");
			}
		}
		else {
			System.err.println("id is invalid");
		}
		
		return false;
	}

}
