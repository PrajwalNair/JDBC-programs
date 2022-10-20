package com.xworkz.garden.dto;

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
public class GardenDTO {
	private int id;
	private String name;
	private double entryFees;
	private String state;
	private String country;
	private String city;
	

}
