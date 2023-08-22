package com.pom;


public interface Payment_Add_Interface {

	String pincode = "//input[@id='pnAl']";

	
	String fullname = "//input[@id='fnAl']";
	
	String locality = "//label[@for='address_locality']";

	String flatname = "//label[text()='Flat / House No. / Building Name *']";
	
	String streetname = "//input[@id='aaaAl']";
	
	String creditcardbtn = "//label[@for='pmode_cc']";

	String cardno = "//label[@for='cc_number']";

	String cardname = "//label[@for='cc_name']";
	
	String cardmonth = "//select[@id='cc_mm']";
	
	String cardyear = "//select[@id='cc_yy']";
	
	String cvv = "//label[@for='cc_cvv']";
	
	String confirmorder = "//form[@id=\"tar-cc\"]//div[normalize-space(text())='CONFIRM ORDER']";
}
