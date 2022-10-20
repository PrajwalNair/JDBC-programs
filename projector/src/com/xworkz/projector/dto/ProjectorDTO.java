package com.xworkz.projector.dto;

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
public class ProjectorDTO {
	int id;
	private String type;
	private String brand;
	private double price;
	private int noOfUsbPort;
	private double rating;
	

}
