package com.xworkz.garden.enumeration;

public enum MysqlAccount {

	URL("jdbc:mysql://localhost:3306/xworkz_btm"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String value;
	
	private MysqlAccount(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
