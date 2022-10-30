package com.xworkz.company.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.company.dto.CompanyDTO;

public class CompanyRepositoryImpl implements CompanyRepository {

	@Override
	public CompanyDTO save(CompanyDTO dto) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root",
					"Xworkzodc@123");
			String sql = "insert into company values (?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getLocation());
			prepareStatement.setString(4, dto.getOwner());

			int executeUpdate = prepareStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("data saved" + executeUpdate);

			}
			return dto;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
