package com.xworkz.super_market;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.super_market.dto.SuperMarketDTO;
import com.xworkz.super_market.service.SuperMarketService;
import com.xworkz.super_market.service.SuperMarketServiceImpl;

public class SuperMarketDisplay {

	public static void main(String[] args) {
		SuperMarketDTO dto1 = new SuperMarketDTO(1, "Big bazar", "big bazar", "22AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto2 = new SuperMarketDTO(2, "Smart bazar", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto3 = new SuperMarketDTO(3, "D mart", "D company", "22AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto4 = new SuperMarketDTO(4, "hyper market", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto5 = new SuperMarketDTO(5, "super market", "big bazar", "22AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto6 = new SuperMarketDTO(6, "reliance", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto7 = new SuperMarketDTO(7, "more", "D company", "22AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto8 = new SuperMarketDTO(8, "vishal mart", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");

		List<SuperMarketDTO> collection = new ArrayList();
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		
		SuperMarketService service = new SuperMarketServiceImpl();
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.validateAndSave(dto4);
		
		service.displayByName("D mart");
		
		
//		Iterator<SuperMarketDTO> list = collection.iterator();
//		while (list.hasNext()) {
//			SuperMarketDTO superMarketDTO = (SuperMarketDTO) list.next();
//			System.out.println(superMarketDTO);
//			SuperMarketService service = new SuperMarketServiceImpl();
//
//			service.validateAndSave(superMarketDTO);
//
//		}
		
//		for (SuperMarketDTO superMarketDTO : collection) {
//			System.out.println(superMarketDTO);
//			service.validateAndSave(superMarketDTO);
//		}
		
		
		collection.stream().forEach(ref->System.out.println(service.validateAndSave(ref)));
		
		
		
		
		
	}

}
