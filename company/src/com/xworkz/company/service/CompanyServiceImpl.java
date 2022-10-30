package com.xworkz.company.service;

import com.xworkz.company.repository.CompanyRepositoryImpl;
import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.repository.CompanyRepository;

public class CompanyServiceImpl implements CompanyService {

	CompanyRepository repository = new CompanyRepositoryImpl();
	@Override
	public CompanyDTO validateAndSave(CompanyDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String location = dto.getLocation();
		String owner = dto.getOwner();
		
		if(id>0) {
			System.out.println("id is valid");
			if(name!=null && name.length()>2 && name.length()<25) {
				System.out.println("name is valid");
				if(location!=null && location.length()>2 && location.length()<25) {
					System.out.println("location is valid");
					if(owner!=null && owner.length()>2 && owner.length()<25) {
						System.out.println("owner is valid");
						this.repository.save(dto);
						return dto;
					}else {
						System.err.println("owner is invalid");
					}
				}else {
					System.err.println("location is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.err.println("id is invalid");
		}
		return null;
	}

}
