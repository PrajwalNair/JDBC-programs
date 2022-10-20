package com.xworkz.projector;

import com.xworkz.projector.dto.ProjectorDTO;
import com.xworkz.projector.service.ProjectorService;
import com.xworkz.projector.service.ProjectorServiceImpl;

public class ProjectorDisplay {

	public static void main(String[] args) {
	ProjectorDTO projectorDTO = new ProjectorDTO(1,"Table top mount", "Epson", 42599, 3, 4.6);
	ProjectorService projectorService = new ProjectorServiceImpl();
	projectorService.validateAndSave(projectorDTO);
	
	}

}
