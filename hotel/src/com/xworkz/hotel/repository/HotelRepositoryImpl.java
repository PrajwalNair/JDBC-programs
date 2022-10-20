package com.xworkz.hotel.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.xworkz.hotel.dto.HotelDTO;

public class HotelRepositoryImpl implements HotelRepository {

	private PreparedStatement prepareStatement;

	@Override
	public boolean save(HotelDTO dto)  {
		System.out.println("All dto data's are saved :"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String insert = "insert into hotel values (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(insert);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getType());
			prepareStatement.setString(4, dto.getCountry());
			prepareStatement.setString(5, dto.getState());
			prepareStatement.setString(6, dto.getCity());
			prepareStatement.setDouble(7, dto.getRating());
			prepareStatement.setInt(8, dto.getNoOfWaiters());
			prepareStatement.setInt(9, dto.getNoOfChair());
			prepareStatement.setInt(10, dto.getNoOfTable());
			prepareStatement.setInt(11, dto.getSince());
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public HotelDTO findById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String read = "select * from hotel where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(read);
			prepareStatement.setInt(1, id);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while(executeQuery.next()) {
				int id1 = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String type = executeQuery.getString(3);
				String country = executeQuery.getString(4);
				String state = executeQuery.getString(5);
				String city = executeQuery.getString(6);
				double rating = executeQuery.getDouble(7);
				int noOfWaiters = executeQuery.getInt(8);
				int noOfChair = executeQuery.getInt(9);
				int noOfTable = executeQuery.getInt(10);
				int since = executeQuery.getInt(11);
				
				HotelDTO dto =new HotelDTO();
				dto.setId(id1);
				dto.setName(name);
				dto.setType(type);
				dto.setCountry(country);
				dto.setState(state);
				dto.setCity(city);
				dto.setRating(rating);
				dto.setNoOfWaiters(noOfWaiters);
				dto.setNoOfChair(noOfChair);
				dto.setNoOfTable(noOfTable);
				dto.setSince(since);
				return dto;	
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean updateNameById(String newName, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String update = "Update hotel set name=? where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(update);
			prepareStatement.setString(1, newName);
			prepareStatement.setInt(2, id);
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean deleteById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm", "root", "Xworkzodc@123");
			String delete = "delete from hotel where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(delete);
			prepareStatement.setInt(1, id);
			int executeDelete = prepareStatement.executeUpdate();
			System.out.println(executeDelete);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
