package com.xworkz.person.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.person.enumeration.MySqlAccount.*;

import com.xworkz.person.dto.PersonDTO;

public class PersonRepositoryImpl implements PersonRepository{
	
	@Override
	public boolean save(PersonDTO dto) {
		System.out.println("data is save :"+dto);
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String insert = "insert into person values ("+dto.getId()+",'"+dto.getName()+"','"+dto.getEmail()+"',"+dto.getMobileNumber()+",'"+dto.getGender()+"','"+dto.getQualification()+"',"+dto.getMarried()+","+dto.getWorking()+",'"+dto.getCompanyName()+"',"+dto.getSalary()+","+dto.getAge()+","+dto.getExperience()+",'"+dto.getLocation()+"','"+dto.getCity()+"','"+dto.getState()+"','"+dto.getCountry()+"',"+dto.getAadharNumber()+",'"+dto.getPanNumber()+"',"+dto.getAlive()+","+dto.getBankAccountNo()+")";
			Statement createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate(insert);
			if(executeUpdate > 0) {
				System.out.println(executeUpdate);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return true;
	}
	
	@Override
	public void displayAll() {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "Select * from person";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobileNumber = executeQuery.getLong(4);
				String gender = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				boolean married = executeQuery.getBoolean(7);
				boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				int salary = executeQuery.getInt(10);
				int age = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long aadhaarNumber = executeQuery.getLong(17);
				String panNumber = executeQuery.getString(18);
				boolean alive = executeQuery.getBoolean(19);
				long bankAccountNo = executeQuery.getLong(20);
				
				System.out.println(id+" "+name+" "+email+" "+mobileNumber+" "+gender+" "+qualification+" "+married+" "+working+" "+companyName+" "+salary+" "+age+" "+experience+" "+location+" "+city+" "+state+" "+country+" "+aadhaarNumber+" "+panNumber+" "+alive+" "+bankAccountNo);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "select * from person where age >"+age+" order by name";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
//				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
//				String email = executeQuery.getString(3);
//				long mobileNumber = executeQuery.getLong(4);
//				String gender = executeQuery.getString(5);
//				String qualification = executeQuery.getString(6);
//				boolean married = executeQuery.getBoolean(7);
//				boolean working = executeQuery.getBoolean(8);
//				String companyName = executeQuery.getString(9);
//				int salary = executeQuery.getInt(10);
				int age1 = executeQuery.getInt(11);
//				double experience = executeQuery.getDouble(12);
//				String location = executeQuery.getString(13);
//				String city = executeQuery.getString(14);
//				String state = executeQuery.getString(15);
//				String country = executeQuery.getString(16);
//				long aadhaarNumber = executeQuery.getLong(17);
//				String panNumber = executeQuery.getString(18);
//				boolean alive = executeQuery.getBoolean(19);
//				long bankAccountNo = executeQuery.getLong(20);
				
//				System.out.println(id+" "+name+" "+email+" "+mobileNumber+" "+gender+" "+qualification+" "+married+" "+working+" "+companyName+" "+salary+" "+age1+" "+experience+" "+location+" "+city+" "+state+" "+country+" "+aadhaarNumber+" "+panNumber+" "+alive+" "+bankAccountNo);
				System.out.println(name+" "+age1);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@Override
	public void displayAllByGenderDescOrderByName(char gender) {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "select * from person where gender = '"+gender+"' order by name desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
//				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
//				String email = executeQuery.getString(3);
//				long mobileNumber = executeQuery.getLong(4);
				String gender1 = executeQuery.getString(5);
//				String qualification = executeQuery.getString(6);
//				boolean married = executeQuery.getBoolean(7);
//				boolean working = executeQuery.getBoolean(8);
//				String companyName = executeQuery.getString(9);
//				int salary = executeQuery.getInt(10);
//				int age1 = executeQuery.getInt(11);
//				double experience = executeQuery.getDouble(12);
//				String location = executeQuery.getString(13);
//				String city = executeQuery.getString(14);
//				String state = executeQuery.getString(15);
//				String country = executeQuery.getString(16);
//				long aadhaarNumber = executeQuery.getLong(17);
//				String panNumber = executeQuery.getString(18);
//				boolean alive = executeQuery.getBoolean(19);
//				long bankAccountNo = executeQuery.getLong(20);
				
//				System.out.println(id+" "+name+" "+email+" "+mobileNumber+" "+gender1+" "+qualification+" "+married+" "+working+" "+companyName+" "+salary+" "+age1+" "+experience+" "+location+" "+city+" "+state+" "+country+" "+aadhaarNumber+" "+panNumber+" "+alive+" "+bankAccountNo);
				System.out.println(name+" "+gender1);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "select * from person where salary > "+salary+" order by salary desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
//				int id = executeQuery.getInt(1);
//				String name = executeQuery.getString(2);
//				String email = executeQuery.getString(3);
//				long mobileNumber = executeQuery.getLong(4);
//				String gender1 = executeQuery.getString(5);
//				String qualification = executeQuery.getString(6);
//				boolean married = executeQuery.getBoolean(7);
//				boolean working = executeQuery.getBoolean(8);
//				String companyName = executeQuery.getString(9);
				int salary1 = executeQuery.getInt(10);
//				int age1 = executeQuery.getInt(11);
//				double experience = executeQuery.getDouble(12);
//				String location = executeQuery.getString(13);
//				String city = executeQuery.getString(14);
//				String state = executeQuery.getString(15);
//				String country = executeQuery.getString(16);
//				long aadhaarNumber = executeQuery.getLong(17);
//				String panNumber = executeQuery.getString(18);
//				boolean alive = executeQuery.getBoolean(19);
//				long bankAccountNo = executeQuery.getLong(20);
				
				//System.out.println(id+" "+name+" "+email+" "+mobileNumber+" "+gender1+" "+qualification+" "+married+" "+working+" "+companyName+" "+salary1+" "+age1+" "+experience+" "+location+" "+city+" "+state+" "+country+" "+aadhaarNumber+" "+panNumber+" "+alive+" "+bankAccountNo);
				System.out.println(salary1);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	
		
	}
	
	
	@Override
	public void displayCount() {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "select Count(*) from person ";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				System.out.println(id);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void SumOfSalary() {
		try {
			Class.forName(DRIVER.getValues());
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues());
			String read = "select sum(salary) from person ";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {		
				int salary1 = executeQuery.getInt(1);
			
				
				
				System.out.println(salary1);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
