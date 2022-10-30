package com.xworkz.company;

import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.service.CompanyService;
import com.xworkz.company.service.CompanyServiceImpl;

public class CompanyDisplay {

	public static void main(String[] args) {
		CompanyDTO dto = new CompanyDTO(1, "bchjb", "cvgvc", "dcfsdcf");
		CompanyDTO dto1 = new CompanyDTO(2, "bchjb", "cvgvc", "dcfsdcf");
		
		CompanyService service = new CompanyServiceImpl();
		System.out.println(service.validateAndSave(dto));
		System.out.println(service.validateAndSave(dto1));
				
		

	}

}
