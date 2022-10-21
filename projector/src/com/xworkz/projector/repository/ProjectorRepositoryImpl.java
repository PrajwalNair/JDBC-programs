package com.xworkz.projector.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.projector.dto.ProjectorDTO;
import com.xworkz.projector.enumeration.MySqlAccount;

public class ProjectorRepositoryImpl implements ProjectorRepository {
	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Data is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlAccount.URL.getValues(), MySqlAccount.USERNAME.getValues(), MySqlAccount.SECRET.getValues());
			String insert = "insert into projector values ("+dto.getId()+",'"+dto.getType()+"','"+dto.getBrand()+"',"+dto.getPrice()+","+dto.getNoOfUsbPort()+","+dto.getRating()+")";
			Statement createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate(insert);
			if(executeUpdate>0) {
				System.out.println(executeUpdate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
