package com.xworkz.garden.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.enumeration.MysqlAccount;

public class GardenRepositoryImpl implements GardenRepository{
	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("Data is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MysqlAccount.URL.getValue(), MysqlAccount.USERNAME.getValue(), MysqlAccount.SECRET.getValue());
			String insert ="insert into garden value ("+dto.getId()+",'"+dto.getName()+"',"+dto.getEntryFees()+",'"+dto.getState()+"','"+dto.getCountry()+"','"+dto.getCity()+"')";
			System.out.println(insert);
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
