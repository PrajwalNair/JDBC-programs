package com.xworkz.person;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.service.PersonService;
import com.xworkz.person.service.PersonServiceImpl;

public class PersonDisplay {

	public static void main(String[] args) {
		PersonDTO dto = new PersonDTO(1, "prajwal", "prajwalnairxworkz@gmail.com", 9148106364l, 'M', "BE", false, true, "creation beyond imagination", 100000000, 25, 3, "somewhere on earth", "somewhere there is peace", "where people live like me", "where my heart is fallen", 14785296332l, "CXSC1311db", false, 12100008777882l);
		PersonDTO dto1 = new PersonDTO(2, "honey", "honeyxworkz@gmail.com", 9148106365l, 'M', "BE", false, true, "will be decided", 10000000, 25, 3.2, "Aralikatti", "hubli", "karnataka", "india", 14785296333l, "CXSC1311ab", false, 12100008777883l);
		PersonDTO dto2 = new PersonDTO(3, "suhas", "suhasxworkz@gmail.com", 9148106366l, 'M', "BE", false, true, "Should decide", 1000000000, 26, 3.5, "where there is a way", "Shivamogga", "karnataka", "india", 14785296334l, "CXSC1311bb", false, 12100008777884l);
		PersonDTO dto3 = new PersonDTO(4, "chandru", "chandruxworkz@gmail.com", 9148106367l, 'M', "BE", false, true, "innovative", 200000000, 24, 2.5, "dont know", "davanagere", "karnataka", "india", 14785296335l, "CXSC1311cb", false, 12100008777885l);
		PersonDTO dto4 = new PersonDTO(5, "dyamanna", "dyamannaxworkz@yahoo.com", 9148106368l, 'M', "BE", false, true, "creative", 300000000, 23, 2.5, "mudhol", "bagalkot", "karnataka", "india", 14785296336l, "CXSC1311eb", false, 12100008777886l);
		PersonDTO dto5 = new PersonDTO(6, "sharat", "sharatxworkz@gmail.com", 9148106369l, 'M', "Mtech", false, true, "builders", 25000, 26, 1, "vikas nagar", "hubli", "karnataka", "india", 14785296337l, "CXSC1311fb", false, 12100008777887l);
		PersonDTO dto6 = new PersonDTO(7, "manohar", "manoharxworkz@yahoo.com", 9148106379l, 'M', "BSc", false, true, "innovation", 20000, 22, 1, "navanagar", "kolar", "karnataka", "india", 14785296338l, "CXSC1311gb", false, 12100008777888l);
		PersonDTO dto7 = new PersonDTO(8, "kalyan", "kalyanxworkz@yahoo.com", 9148106389l, 'M', "BCA", false, true, "inflowsol", 26000, 28, 1, "whitefield", "bangalore", "karnataka", "india", 14785296339l, "CXSC1311hb", false, 12100008777889l);
		PersonDTO dto8 = new PersonDTO(9, "dharshan", "dharshanxworkz@yahoo.com", 9148106399l, 'M', "BE", false, true, "tremplien", 26000, 28, 1, "whitefield", "bangalore", "karnataka", "india", 14785296349l, "CXSC1311ib", false, 12100008777899l);
		PersonDTO dto9 = new PersonDTO(10, "manoj", "manojxworkz@yahoo.com", 9148106499l, 'M', "BE", false, true, "torry harris", 36000, 28, 1, "madhur", "mandya", "karnataka", "india", 14785296359l, "CXSC1311jb", false, 12100008777199l);
		PersonService personService = new PersonServiceImpl();
		personService.validateAndSave(dto);
		personService.validateAndSave(dto1);
		personService.validateAndSave(dto2);
		personService.validateAndSave(dto3);
		personService.validateAndSave(dto4);
		personService.validateAndSave(dto5);
		personService.validateAndSave(dto6);
		personService.validateAndSave(dto7);
		personService.validateAndSave(dto8);
		personService.validateAndSave(dto9);
		System.out.println("--------------------------------");
		personService.displayAll();
		System.out.println("--------------------------------");
		personService.displayAllAgeGreaterThanOrderByName(20);
		System.out.println("--------------------------------");
		personService.displayAllByGenderDescOrderByName('M');
		System.out.println("--------------------------------");
		personService.displayAllBySalaryGreaterThanOrderByDesc(5000.00);
		System.out.println("--------------------------------");
		personService.displayCount();
		System.out.println("--------------------------------");
		personService.SumOfSalary();

	}

}
