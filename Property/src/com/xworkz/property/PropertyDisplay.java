package com.xworkz.property;

import com.xworkz.property.dto.PropertyDTO;
import com.xworkz.property.service.PropertyService;
import com.xworkz.property.service.PropertyServiceImpl;

public class PropertyDisplay {

	public static void main(String[] args) {
		PropertyDTO propertyDTO = new PropertyDTO(1,"Honey", 25, "Karnataka", "India", "Hubli");
		PropertyService propertyService = new PropertyServiceImpl();
		propertyService.validateAndSave(propertyDTO);
	}

}
