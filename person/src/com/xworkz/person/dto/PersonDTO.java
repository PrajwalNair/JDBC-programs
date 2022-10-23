package com.xworkz.person.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonDTO implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private long mobileNumber;
	private char gender;
	private String qualification;
	private Boolean married;
	private Boolean working;
	private String companyName;
	private int salary;
	private int age;
	private double experience;
	private String location;
	private String city;
	private String state;
	private String country;
	private long aadharNumber;
	private String panNumber;
	private Boolean alive;
	private long bankAccountNo;
	

}
