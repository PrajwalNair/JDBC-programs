package com.xworkz.person.enumeration;

public enum MySqlAccount {
	URL("jdbc:mysql://localhost:3306/xworkz_btm"),USERNAME("root"),SECRET("Xworkzodc@123"),
	DRIVER("com.mysql.cj.jdbc.Driver"),GMAIL("@gmail.com"),YAHOO("@yahoo.com");
	
	private String values;
	
	private MySqlAccount(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}

}
