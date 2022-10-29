package com.xworkz.city.repository;

import static com.xworkz.city.enums.MySqlAccount.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.city.dto.CityDTO;

public class CityRepositoryImpl implements CityRepository {

	@Override
	public boolean save(CityDTO dto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String insert = "insert into city values (?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(insert);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getLanguage());
			prepareStatement.setString(4, dto.getCountry());
			prepareStatement.setString(5, dto.getState());

			int executeUpdate = prepareStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println(executeUpdate+" : "+dto);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
