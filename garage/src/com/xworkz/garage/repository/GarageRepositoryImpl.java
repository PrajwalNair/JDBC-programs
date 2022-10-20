package com.xworkz.garage.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.garage.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {
	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Data is saved :"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String insert="insert into garage values (?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(insert);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getState());
			prepareStatement.setString(4, dto.getCountry());
			prepareStatement.setString(5, dto.getCity());
			prepareStatement.setDouble(6, dto.getRating());
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
		
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
}

	@Override
	public GarageDTO findbyId(int id) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
		String read = "select * from garage where id=?";
		PreparedStatement prepareStatement = connection.prepareStatement(read);
		prepareStatement.setInt(1, id);
		ResultSet executeQuery = prepareStatement.executeQuery();
	//	System.out.println(executeQuery);
		while(executeQuery.next()) {
		int id1 = executeQuery.getInt(1);
		String name = executeQuery.getString(2);
		String state = executeQuery.getString(3);
		String country = executeQuery.getString(4);
		String city = executeQuery.getString(5);
		double ratting = executeQuery.getDouble(6);
		
		GarageDTO dto2=new GarageDTO();
		dto2.setId(id1);
		dto2.setName(name);
		dto2.setState(state);
		dto2.setCountry(country);
		dto2.setCity(city);
		dto2.setRating(ratting);
		return  dto2;
	
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return null;
		
	}
	
	@Override
	public void updateNameById(String newName, int id) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
		String update = "Update garage set name=? where id=?" ;
		PreparedStatement prepareStatement = connection.prepareStatement(update);
		prepareStatement.setString(1, newName);
		prepareStatement.setInt(2, id);
		int executeUpdate = prepareStatement.executeUpdate();
	    System.out.println(executeUpdate);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteById( int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String update = "delete from garage where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(update);
			prepareStatement.setInt(1, id);
			int executeUpdate = prepareStatement.executeUpdate();
		    System.out.println(executeUpdate);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

