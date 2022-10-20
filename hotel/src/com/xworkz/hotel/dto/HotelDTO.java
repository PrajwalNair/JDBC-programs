package com.xworkz.hotel.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class HotelDTO implements Serializable {
	
	private int id;
	private String name;
	private String type;
	private String country;
	private String state;
	private String city;
	private double rating;
	private int noOfWaiters;
	private int noOfChair;
	private int noOfTable;
	private int since;

	

}
