package com.xworkz.property.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDTO {
	private int id;
	private String name;
	private int age;
	private String state;
	private String country;
	private String city;
	

}
