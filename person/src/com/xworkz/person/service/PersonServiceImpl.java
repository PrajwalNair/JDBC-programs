package com.xworkz.person.service;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

import static com.xworkz.person.enumeration.MySqlAccount.*;

public class PersonServiceImpl implements PersonService {
	PersonRepository person = new PersonRepositoryImpl();

	@Override
	public boolean validateAndSave(PersonDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		Long mobileNumber = dto.getMobileNumber();
		char gender = dto.getGender();
		String qualification = dto.getQualification();
		Boolean married = dto.getMarried();
		Boolean working = dto.getWorking();
		String companyName = dto.getCompanyName();
		int salary = dto.getSalary();
		int age = dto.getAge();
		double experience = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long aadharNumber = dto.getAadharNumber();
		String panNumber = dto.getPanNumber();
		Boolean alive = dto.getAlive();
		long bankAccountNo = dto.getBankAccountNo();
		if(id>0 && id<=30) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<30) {
				System.out.println("name is valid");
				if(email!=null && email.length()>5 && email.length()<50 && (email.endsWith(GMAIL.getValues()) || email.endsWith(YAHOO.getValues()))) {
					System.out.println("email is valid");
					if(mobileNumber>0) {
						System.out.println("mobileNumber is valid");
						if(gender == 'M' || gender == 'F' || gender == 'O') {
							System.out.println("gender is valid");
							if(qualification!=null) {
								System.out.println("qualification is valid");
								if(married == true || married == false) {
									System.out.println("marriage is valid");
									if(working == true || working==false) {
										System.out.println("working is valid");
										if(companyName!=null && companyName.length()>4 && companyName.length()<50) {
											System.out.println("company name is valid");
											if(salary>0) {
												System.out.println("salary is valid");
												if(age>0) {
													System.out.println("age is valid");
													if(experience>=0 && experience<100) {
														System.out.println("experience is valid");
														if(location!=null && location.length()>3 && location.length()<50){ 
															System.out.println("location is valid");
															if(city!=null && city.length()>3 && city.length()<50) {
																System.out.println("city is valid");
																if(state!=null && state.length()>2 && state.length()<50) {
																	System.out.println("state is valid");
																	if(country!=null && country.length()>2 && country.length()<50) {
																		System.out.println("country is valid");
																		if(aadharNumber>0) {
																			System.out.println("aadhaar is vaid");
																			if(panNumber!=null && panNumber.length()==10) {
																				System.out.println("pan number is valid");
																				if(alive == true || alive == false) {
																					System.out.println("persom is alive");
																					if(bankAccountNo>0 ) {
																						System.out
																								.println("bank account number is valid");
																						this.person.save(dto);
																					}else {
																						System.err
																								.println("bank account number is invalid");
																					}
																				}else {
																					System.err.println("person is not alive");
																				}
																			}else {
																				System.err.println("pan number is invalid");
																			}
																		}else {
																			System.err.println("aadhaar is invalid");
																		}
																	}else {
																		System.err.println("country is invalid");
																	}
																}else {
																	System.err.println("state is invalid");
																}
															}else {
																System.out.println("city is invalid");
															}
														}else {
															System.err.println("location is invalid");
														}
													}else {
														System.err.println("experience is invalid");
													}
												}else {
													System.err.println("age is invalid");
												}
											}else {
												System.out.println("salary is invalid");
											}
										}else {
											System.err.println("company name is invalid");
										}
									}else {
										System.err.println("working is invalid");
									}
								}else {
									System.err.println("marriage is invalid");
								}
							}else {
								System.err.println("qualification is invalid");
							}
						}else {
							System.err.println("gender is invalid");
						}
					}else {
						System.err.println("mobileNumber is invalid");
					}
				}else {
					System.err.println("email is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.err.println("id is invalid");
		}
		
		
		
		return false;
	}
	
	@Override
	public void displayAll() {
		System.out.println("all values are read");
		this.person.displayAll();
		
	}
	
	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		System.out.println("all values are greater than the given age");
		this.person.displayAllAgeGreaterThanOrderByName(age);
	}
	
	@Override
	public void displayAllByGenderDescOrderByName(char gender) {
		System.out.println("All values by gender");
		this.person.displayAllByGenderDescOrderByName(gender);
	}
	
	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		System.out.println("all salary in desc");
		this.person.displayAllBySalaryGreaterThanOrderByDesc(salary);
	}
	
	
	@Override
	public void displayCount() {
		System.out.println("count");
		this.person.displayCount();
	}
	
	@Override
	public void SumOfSalary() {
		System.out.println("sum of salary");
		this.person.SumOfSalary();
	}

}
