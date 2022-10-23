package com.xworkz.person.service;

import com.xworkz.person.dto.PersonDTO;

public interface PersonService {
	boolean validateAndSave(PersonDTO dto);
	void displayAll();
	void displayAllAgeGreaterThanOrderByName(int age);
	void displayAllByGenderDescOrderByName(char gender);
	void displayAllBySalaryGreaterThanOrderByDesc(double salary);
	void displayCount();
	void SumOfSalary();
	

}
