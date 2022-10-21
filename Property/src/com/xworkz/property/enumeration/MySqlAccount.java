package com.xworkz.property.enumeration;

public enum MySqlAccount {
	
URL("jdbc:mysql://localhost:3306/xworkz_btm"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String value;
	
	private MySqlAccount(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
