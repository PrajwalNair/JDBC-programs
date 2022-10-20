package com.xworkz.garage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GarageDTO {
	private int id;
	private String name;
	private String state;
	private String country;
	private String city;
	private double rating;
	 

}
