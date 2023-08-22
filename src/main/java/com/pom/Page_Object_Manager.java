package com.pom;

public class Page_Object_Manager {

	
private ProductSelection ps;
private Cart cart;
private Payment_Address pa;

public ProductSelection getPs() {
	ps = new ProductSelection();
	return ps;
}

public Cart getCart() {
	
	cart = new Cart();
	return cart;
}

public Payment_Address getPayAdd() {
	
	pa = new Payment_Address();
	return pa;
}


}
