package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalDisplay {

	public static void main(String[] args) {
		HospitalDTO hospitalDTO = new HospitalDTO(1, "Jayadeva", "C N Manjunath", "Cardiac", 1972);
		 HospitalService hospitalService = new HospitalServiceImpl();
		 hospitalService.validateAndSave(hospitalDTO);
		
	}

}
