package com.step;

import com.Base.Base_Class;
import com.pom.Page_Object_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Step_Definition extends Base_Class{

	Page_Object_Manager pom = new Page_Object_Manager();

	@Given("User can get limeroad url {string}")
	public void user_can_get_limeroad_url(String string) {
		
		getUrl(string);
	}

	@Given("Clicking on Shop men button")
	public void clicking_on_shop_men_button() {
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	} 
		clickingWebElement(pom.getPs().getShopmenbtn());
	}
	
	@When("Moving over men catagory")
	public void moving_over_men_catagory() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		actionWebElement(pom.getPs().getMenbtn(),"Move to WebElement");
	}
	
	@When("select formal shoe from footwear")
	public void select_formal_shoe_from_footwear() {
		clickingWebElement(pom.getPs().getFormalshoebtn());
		implicitelywait(10);
	}
	@When("clicking on filter type high price")

	public void clicking_on_filter_type_high_price() {
		clickingWebElement(pom.getPs().getHighpricefilter());
	}
	
	@When("clicking the shoe")
	public void clicking_the_shoe() {
		implicitelywait(10);
		clickingWebElement(pom.getPs().getShoe());
	}
	
	@Given("Select the size for shoe")
	public void select_the_size_for_shoe() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	clickingWebElement(pom.getCart().getShoesize());
	}	
	
	@When("Click on add to cart button")
	public void click_on_add_to_cart_button() {
		clickingWebElement(pom.getCart().getAddtocartbtn());
	}
	
	@When("Click on pay now button")
	public void click_on_pay_now_button() {
	  clickingWebElement(pom.getCart().getBuynowbtn());
	}
	
	@When("Enter your mobile number")
	public void enter_your_mobile_number() {
		implicitelywait(10);
		
		sendKeys(pom.getCart().getPhoneinput(), "9600093882");
		
	}

	@When("enter your otp")
	public void enter_your_otp() {
		implicitelywait(30);
	}
	
//	@Given("Entering address")
//	public void entering_address() {
//		
//		System.out.println("Address Already Entered");
//		
//		sendKeys(pom.getPayAdd().getPincode(), "600008");
//		sendKeys(pom.getPayAdd().getFullname(), "Manikandan");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		clickingWebElement(pom.getPayAdd().getFlatname());
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		sendKeys(pom.getPayAdd().getFlatname(), "Arun Appartment");
//		clickingWebElement(pom.getPayAdd().getLocality());
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		sendKeys(pom.getPayAdd().getLocality(), "Egmore Chennai");
//	}
//
//	@When("clicking on credit card")
//	public void clicking_on_credit_card() {
//		clickingWebElement(pom.getPayAdd().getCreditcardbtn());
//	}
//	
//	@When("Entering card details")
//	public void entering_card_details() {
//		implicitelywait(15);
//		clickingWebElement(pom.getPayAdd().getCardno());
//	    sendKeys(pom.getPayAdd().getCardno(), "4012888888881881");
//	    sendKeys(pom.getPayAdd().getCardname(), "Manikandan");
//	    dropdown(pom.getPayAdd().getCardmonth(), "Value", "06");
//	    dropdown(pom.getPayAdd().getCardyear(), "Value", "26");
//	    sendKeys(pom.getPayAdd().getCvv(), "987");
//	}
//	@When("Clicking on confirm order")
//	public void clicking_on_confirm_order() {
//		clickingWebElement(pom.getPayAdd().getConfirmorder());
//	}


	
	
	
	
	
	

//	
//	@Given("Navigating to men tab")
//	public void navigating_to_men_tab() {
//		//div[@id="men_category_expand"]//a[@class='c5 subCatItem tdN vT cuP' and text()='formal shoes']
//	}
//	
//	@When("selecting casual shoe from footwear")
//	public void selecting_casual_shoe_from_footwear() {
//		System.out.println("Success 3");
//	}
//	
//	@When("clicking on a shoe")
//	public void clicking_on_a_shoe() {
//		System.out.println("Success 4");
//	}
//
//	@When("Click on add to cart button")
//	public void click_on_add_to_cart_button() {
//		System.out.println("Success 5");
//	}
//	
//	@When("Click on pay now button")
//	public void click_on_pay_now_button() {
//		System.out.println("Success 6");
//	}
//	
//	@When("Enter your mobile number")
//	public void enter_your_mobile_number() {
//		System.out.println("Success 7");
//	}
//	
//	@When("enter your otp")
//	public void enter_your_otp() {
//		System.out.println("Success 8");
//	}
//
//	@Given("Select the size for shoe")
//	public void select_the_size_for_shoe() {
//		System.out.println("Success 9");
//	}
//
//	@When("click on confirm order")
//	public void click_on_confirm_order() {
//	   System.out.println("Success 10");
//	}
//
//	@Given("Entering address")
//	public void entering_address() {
//	   System.out.println("Success 11");
//	}
//


}


//Scenario: Entering the adderss and confirming the order
//
//Given Entering address
//
//When clicking on credit card
//
//And Entering card details
//
//And Clicking on confirm order