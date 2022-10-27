package com.xworkz.super_market.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static com.xworkz.super_market.constants.MySqlAccount.*;
import com.xworkz.super_market.dto.SuperMarketDTO;
public class SuperMarketRepositoryImpl implements SuperMarketRepository {

	@Override
	public boolean save(SuperMarketDTO dto) {
		System.out.println("date is saved"+dto);
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "insert into super_market values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getCompany());
			prepareStatement.setString(4,dto.getGstNo());
			prepareStatement.setInt(5, dto.getPincode());
			prepareStatement.setString(6, dto.getType());
			int executeUpdate = prepareStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println(executeUpdate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void displayByName(String name) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(),USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from super_market where name =?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, name);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while(executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				String gstNo = executeQuery.getString(4);
				int pincode = executeQuery.getInt(5);
				String type = executeQuery.getString(6);
				System.out.println(id+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean save(List<SuperMarketDTO> list) {
		System.out.println("method saved using list"+list);
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "insert into super_market values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			
			for (SuperMarketDTO superMarketDTO : list) {
				prepareStatement.setInt(1, superMarketDTO.getId());
				prepareStatement.setString(2, superMarketDTO.getName());
				prepareStatement.setString(3, superMarketDTO.getCompany());
				prepareStatement.setString(4,superMarketDTO.getGstNo());
				prepareStatement.setInt(5, superMarketDTO.getPincode());
				prepareStatement.setString(6, superMarketDTO.getType());
				int executeUpdate = prepareStatement.executeUpdate();
				if(executeUpdate>0) {
					System.out.println(executeUpdate);
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
