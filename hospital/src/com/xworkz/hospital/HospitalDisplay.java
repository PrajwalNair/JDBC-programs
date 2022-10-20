package com.xworkz.hospital;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalDisplay {

	public static void main(String[] args) {
		HospitalDTO hospitalDTO = new HospitalDTO(1, "Jayadeva", "C N Manjunath", "Cardiac", 1972);
		HospitalDTO hospitalDTO1 = new HospitalDTO(2, "SDM", "virendra hegde", "multi speciality", 2001);
		HospitalDTO hospitalDTO2 = new HospitalDTO(3, "Manipal", "Rajan pai", "multi speciality", 1991);
		HospitalDTO hospitalDTO3 = new HospitalDTO(4, "Suchirayu", "prabakar korey", "multi speciality", 2012);
		HospitalDTO hospitalDTO4 = new HospitalDTO(5, "Jithuri", "venkatesh", "cardiac", 1975);
		HospitalDTO hospitalDTO5 = new HospitalDTO(6, "Sushrutha", "Devraj", "cardiac", 1996);
		HospitalDTO hospitalDTO6 = new HospitalDTO(7, "Shakuntala", "VE Gadagi", "Diabetics", 1999);
		HospitalDTO hospitalDTO7 = new HospitalDTO(8, "Fortis", "Shivinder mohan sigh", "Kidney", 1962);
		HospitalDTO hospitalDTO8 = new HospitalDTO(9, "Jeevannavar", "jeevanna", "Dibetics", 1997);
		HospitalDTO hospitalDTO9 = new HospitalDTO(10, "Miraj", "anuj", "ortho", 2005);
		
		HospitalDTO hospitalDTO10 = new HospitalDTO(11, "Hanchinmani", "viraj", "pediatrics", 1993);
		HospitalDTO hospitalDTO11 = new HospitalDTO(12, "Avvannavar", "avvanna", "neurology", 1994);
		HospitalDTO hospitalDTO12 = new HospitalDTO(13, "Vivekanand", "raju", "multi speciality", 1989);
		HospitalDTO hospitalDTO13 = new HospitalDTO(14, "Aster CMI", "mahadev", "multi speciality", 2005);
		HospitalDTO hospitalDTO14 = new HospitalDTO(15, "Apollo", "raju", "multi speciality", 2002);
		HospitalDTO hospitalDTO15 = new HospitalDTO(16, "columbia asia", "chandrashekar", "multi speciality", 2003);
		HospitalDTO hospitalDTO16 = new HospitalDTO(17, "Hosmat", "Thomas", "multi speciality", 2007);
		HospitalDTO hospitalDTO17 = new HospitalDTO(18, "st John medical", "saji", "multi speciality", 2008);
		HospitalDTO hospitalDTO18 = new HospitalDTO(19, "Bowring and Lady", "abhijeet chavan", "multi speciality", 1992);
		HospitalDTO hospitalDTO19 = new HospitalDTO(20, "Victoria", "kemananjammani", "multi speciality", 1897);
		
		HospitalDTO hospitalDTO20 = new HospitalDTO(21, "st. philomena", "JMJ sisters", "multi speciality", 1937);
		HospitalDTO hospitalDTO21 = new HospitalDTO(22, "karanth", "ramu", "orthopaedic", 1952);
		HospitalDTO hospitalDTO22 = new HospitalDTO(23, "KIMS", "government", "multi speciality", 1963);
		HospitalDTO hospitalDTO23 = new HospitalDTO(23, "Sri Sai", "Omkarappa", "Cardiac", 1969);
		HospitalDTO hospitalDTO24 = new HospitalDTO(24, "Al Ameen", "Surappa", "Cardiac", 1998);
		HospitalDTO hospitalDTO25 = new HospitalDTO(25, "Bapuji", "Suresh", "Cardiac", 1962);
		HospitalDTO hospitalDTO26 = new HospitalDTO(26, "Chirag", "Yogesh", "Cardiac", 1996);
		HospitalDTO hospitalDTO27 = new HospitalDTO(27, "City Central", "Hanumanth", "Cardiac", 1995);
		HospitalDTO hospitalDTO28 = new HospitalDTO(28, "Davanagere Heart", "Suhas", "Cardiac", 1988);
		HospitalDTO hospitalDTO29 = new HospitalDTO(29, "Guru Poly Clinic", "Sachin", "Cardiac", 1972);
		HospitalDTO hospitalDTO30 = new HospitalDTO(30, "MS Dental", "Basavarajappa", "Cardiac", 2006);
		
		HospitalDTO hospitalDTO31 = new HospitalDTO(31, "Nadigar Dental", "Naresh", "Cardiac", 2008);
		HospitalDTO hospitalDTO32 = new HospitalDTO(32, "Narayana Hrudayalaya", "Nagesh", "Cardiac", 2010);
		HospitalDTO hospitalDTO33 = new HospitalDTO(33, "Nayana Eye", "Nagappa", "Cardiac", 2018);
		HospitalDTO hospitalDTO34 = new HospitalDTO(34, "New Dental", "Kallesh", "Cardiac", 2022);
		HospitalDTO hospitalDTO35 = new HospitalDTO(35, "Sai Multi Speciality", "Bojanna", "Cardiac", 2016);
		HospitalDTO hospitalDTO36 = new HospitalDTO(36, "Sreedurga", "Vasu", "Cardiac", 1972);
		HospitalDTO hospitalDTO37 = new HospitalDTO(37, "SS Hospital", "Darshan", "Cardiac", 2014);
		HospitalDTO hospitalDTO38 = new HospitalDTO(38, "Suchetana", "Palakshappa", "Cardiac", 2016);
		HospitalDTO hospitalDTO39 = new HospitalDTO(39, "Spandana Urology", "Krishnamurti", "Cardiac", 2015);
		HospitalDTO hospitalDTO40 = new HospitalDTO(40, "Surbhi", "Suresh", "Cardiac", 2019);
		
		HospitalDTO hospitalDTO41 = new HospitalDTO(41, "Veeresh ENT", "Ragini", "Cardiac", 1998);
		HospitalDTO hospitalDTO42 = new HospitalDTO(42, "Sri Nivasa", "Sumadura", "Cardiac", 1993);
		HospitalDTO hospitalDTO43 = new HospitalDTO(43, "Thrombosis", "Divyakka", "Cardiac", 2000);
		HospitalDTO hospitalDTO44 = new HospitalDTO(44, "Ullal Gen", "Vidyakka", "Cardiac", 2002);
		HospitalDTO hospitalDTO45 = new HospitalDTO(45, "Uma Nursing", "Sushmakka", "Cardiac", 2005);
		HospitalDTO hospitalDTO46 = new HospitalDTO(46, "1 Health Medical", "Malatesh", "Cardiac", 1994);
		HospitalDTO hospitalDTO47 = new HospitalDTO(47, "32 Smiles", "Manoj", "Cardiac", 1993);
		HospitalDTO hospitalDTO48 = new HospitalDTO(48, "A Dent care", "Nanu", "Cardiac", 2000);
		HospitalDTO hospitalDTO49 = new HospitalDTO(49, "A J Dental", "Byrappa", "Cardiac", 2006);
		HospitalDTO hospitalDTO50 = new HospitalDTO(50, "A R clinic", "Barappa", "Cardiac", 2006);
		
		HospitalDTO hospitalDTO51 = new HospitalDTO(51, "Sumohan Medico", "Sanjanna", "Cardiac", 2009);
		HospitalDTO hospitalDTO52 = new HospitalDTO(52, "Sundar", "Ramappa", "Cardiac", 2021);
		HospitalDTO hospitalDTO53 = new HospitalDTO(53, "Supra", "Manikanta", "Cardiac", 2022);
		HospitalDTO hospitalDTO54 = new HospitalDTO(54, "Surabhi", "Sunil", "Cardiac", 2019);
		HospitalDTO hospitalDTO55 = new HospitalDTO(55, "Suraksha", "Usha", "Cardiac", 2017);
		HospitalDTO hospitalDTO56 = new HospitalDTO(56, "Surya", "Inchara", "Cardiac", 1989);
		HospitalDTO hospitalDTO57 = new HospitalDTO(57, "Sushruta", "Ravi", "Cardiac", 1987);
		HospitalDTO hospitalDTO58 = new HospitalDTO(58, "Sushruta eye", "Chandru", "Cardiac", 1986);
		HospitalDTO hospitalDTO59 = new HospitalDTO(59, "Swathi ENT", "Chethan", "Cardiac", 1982);
		HospitalDTO hospitalDTO60 = new HospitalDTO(60, "Susruta", "Anil", "Cardiac", 1983);
		
		HospitalDTO hospitalDTO61 = new HospitalDTO(61, "Taluk Health", "Kempanna", "Cardiac", 1976);
		HospitalDTO hospitalDTO62 = new HospitalDTO(62, "Tanmay", "Charan", "Cardiac", 1979);
		HospitalDTO hospitalDTO63 = new HospitalDTO(63, "Tara", "Kuberappa", "Cardiac", 1985);
		HospitalDTO hospitalDTO64 = new HospitalDTO(64, "Telsang Maternity", "Chandan", "Cardiac", 1987);
		HospitalDTO hospitalDTO65 = new HospitalDTO(65, "The karnatak Cancer Therapy", "Sanjay", "Cardiac", 1998);
		HospitalDTO hospitalDTO66 = new HospitalDTO(66, "Thibbadevi", "Nityanand", "Cardiac", 1991);
		
		
		
		
		
		 HospitalService hospitalService = new HospitalServiceImpl();
		 hospitalService.validateAndSave(hospitalDTO);
		 hospitalService.validateAndSave(hospitalDTO1);
		 hospitalService.validateAndSave(hospitalDTO2);
		 hospitalService.validateAndSave(hospitalDTO3);
		 hospitalService.validateAndSave(hospitalDTO4);
		 hospitalService.validateAndSave(hospitalDTO5);
		 hospitalService.validateAndSave(hospitalDTO6);
		 hospitalService.validateAndSave(hospitalDTO7);
		 hospitalService.validateAndSave(hospitalDTO8);
		 hospitalService.validateAndSave(hospitalDTO9);
		 hospitalService.validateAndSave(hospitalDTO10);
		 
		 hospitalService.validateAndSave(hospitalDTO11);
		 hospitalService.validateAndSave(hospitalDTO12);
		 hospitalService.validateAndSave(hospitalDTO13);
		 hospitalService.validateAndSave(hospitalDTO14);
		 hospitalService.validateAndSave(hospitalDTO15);
		 hospitalService.validateAndSave(hospitalDTO16);
		 hospitalService.validateAndSave(hospitalDTO17);
		 hospitalService.validateAndSave(hospitalDTO18);
		 hospitalService.validateAndSave(hospitalDTO19);
		 hospitalService.validateAndSave(hospitalDTO20);
		 
		 hospitalService.validateAndSave(hospitalDTO21);
		 hospitalService.validateAndSave(hospitalDTO22);
		 hospitalService.validateAndSave(hospitalDTO23);
		 hospitalService.validateAndSave(hospitalDTO24);
		 hospitalService.validateAndSave(hospitalDTO25);
		 hospitalService.validateAndSave(hospitalDTO26);
		 hospitalService.validateAndSave(hospitalDTO27);
		 hospitalService.validateAndSave(hospitalDTO28);
		 hospitalService.validateAndSave(hospitalDTO29);
		 hospitalService.validateAndSave(hospitalDTO30);
		 
		 hospitalService.validateAndSave(hospitalDTO31);
		 hospitalService.validateAndSave(hospitalDTO32);
		 hospitalService.validateAndSave(hospitalDTO33);
		 hospitalService.validateAndSave(hospitalDTO34);
		 hospitalService.validateAndSave(hospitalDTO35);
		 hospitalService.validateAndSave(hospitalDTO36);
		 hospitalService.validateAndSave(hospitalDTO37);
		 hospitalService.validateAndSave(hospitalDTO38);
		 hospitalService.validateAndSave(hospitalDTO39);
		 hospitalService.validateAndSave(hospitalDTO40);
		 
		 hospitalService.validateAndSave(hospitalDTO41);
		 hospitalService.validateAndSave(hospitalDTO42);
		 hospitalService.validateAndSave(hospitalDTO43);
		 hospitalService.validateAndSave(hospitalDTO44);
		 hospitalService.validateAndSave(hospitalDTO45);
		 hospitalService.validateAndSave(hospitalDTO46);
		 hospitalService.validateAndSave(hospitalDTO47);
		 hospitalService.validateAndSave(hospitalDTO48);
		 hospitalService.validateAndSave(hospitalDTO49);
		 hospitalService.validateAndSave(hospitalDTO50);
		 
		 hospitalService.validateAndSave(hospitalDTO51);
		 hospitalService.validateAndSave(hospitalDTO52);
		 hospitalService.validateAndSave(hospitalDTO53);
		 hospitalService.validateAndSave(hospitalDTO54);
		 hospitalService.validateAndSave(hospitalDTO55);
		 hospitalService.validateAndSave(hospitalDTO56);
		 hospitalService.validateAndSave(hospitalDTO57);
		 hospitalService.validateAndSave(hospitalDTO58);
		 hospitalService.validateAndSave(hospitalDTO59);
		 hospitalService.validateAndSave(hospitalDTO60);
		 
		 hospitalService.validateAndSave(hospitalDTO61);
		 hospitalService.validateAndSave(hospitalDTO62);
		 hospitalService.validateAndSave(hospitalDTO63);
		 hospitalService.validateAndSave(hospitalDTO64);
		 hospitalService.validateAndSave(hospitalDTO65);
		 hospitalService.validateAndSave(hospitalDTO66);
		 
		 
		
	}

}
