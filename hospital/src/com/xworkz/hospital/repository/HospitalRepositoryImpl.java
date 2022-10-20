package com.xworkz.hospital.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.enumeration.MySqlAccount;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("data is saved :" +dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlAccount.URL.getValues(), MySqlAccount.USERNAME.getValues(), MySqlAccount.SECRET.getValues());
			String insert = "insert into hospital values ("+dto.getId()+",'"+dto.getName()+"','"+dto.getFounder()+"','"+dto.getSpecialist()+"',"+dto.getSince()+")";
			Statement createStatement = connection.createStatement();
			System.out.println(insert);
			int executeUpdate = createStatement.executeUpdate(insert);
			if (executeUpdate >0) {
				System.out.println(executeUpdate);
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
		
	
	
	
}
