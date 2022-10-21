package com.xworkz.property.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.property.dto.PropertyDTO;
import com.xworkz.property.enumeration.MySqlAccount;

public class PropertyRepositoryImpl implements PropertyRepository {
	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Data is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlAccount.URL.getValue(), MySqlAccount.USERNAME.getValue(), MySqlAccount.SECRET.getValue());
			String insert ="insert into property values ("+dto.getId()+",'"+dto.getName()+"',"+dto.getAge()+",'"+dto.getState()+"','"+dto.getCountry()+"','"+dto.getCity()+"')";
			Statement createStatement = connection.createStatement();
			System.out.println(insert);
			int executeUpdate = createStatement.executeUpdate(insert);
			if(executeUpdate>0) {
				System.out.println(executeUpdate);
			}

			connection.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
