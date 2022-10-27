package com.xworkz.super_market.constants;

public enum MySqlAccount {
	URL("jdbc:mysql://localhost:3306/xworkz_btm"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String values;
	
	private MySqlAccount(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}

}
