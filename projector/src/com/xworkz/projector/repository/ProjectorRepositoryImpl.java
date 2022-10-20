package com.xworkz.projector.repository;

import com.xworkz.projector.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {
	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Data is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

}
