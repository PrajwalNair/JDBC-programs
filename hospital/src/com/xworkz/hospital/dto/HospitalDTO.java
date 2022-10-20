package com.xworkz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class HospitalDTO {

	
	private int id;
	private String name;
	private String founder;
	private String specialist;
	private int since;
	
}
