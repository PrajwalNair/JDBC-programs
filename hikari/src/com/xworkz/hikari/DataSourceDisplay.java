package com.xworkz.hikari;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSourceDisplay {

	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setUsername("root");
		config.setPassword("Xworkzodc@123");
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/xworkz_btm");
		DataSource source = new HikariDataSource(config);
		try {
			Connection connection = source.getConnection();
			System.out.println("Connection"+connection);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
