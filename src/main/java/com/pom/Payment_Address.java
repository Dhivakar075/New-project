package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Payment_Address extends Base_Class{

	public Payment_Address() {
		
		PageFactory.initElements(driver,this);
	}
	
		@FindBy(xpath = Payment_Add_Interface.pincode)
		private WebElement pincode;

		
		@FindBy(xpath = Payment_Add_Interface.fullname)
		private WebElement fullname;
		
		@FindBy(xpath = Payment_Add_Interface.locality)
		private WebElement locality;

		@FindBy(xpath = Payment_Add_Interface.flatname)
		private WebElement flatname;
		
		@FindBy(xpath = Payment_Add_Interface.streetname)
		private WebElement streetname;
		
		@FindBy(xpath = Payment_Add_Interface.creditcardbtn)
		private WebElement creditcardbtn;

		@FindBy(xpath = Payment_Add_Interface.cardno)
		private WebElement cardno;

		@FindBy(xpath = Payment_Add_Interface.cardname)
		private WebElement cardname;
		
		@FindBy(xpath = Payment_Add_Interface.cardmonth)
		private WebElement cardmonth;
		
		@FindBy(xpath = Payment_Add_Interface.cardyear)
		private WebElement cardyear;
		
		@FindBy(xpath = Payment_Add_Interface.cvv)
		private WebElement cvv;
		
		@FindBy(xpath = Payment_Add_Interface.confirmorder)
		private WebElement confirmorder;
	
	
		public WebElement getPincode() {
			return pincode;
		}

		public WebElement getFullname() {
			return fullname;
		}

		public WebElement getLocality() {
			return locality;
		}

		public WebElement getFlatname() {
			return flatname;
		}

		public WebElement getStreetname() {
			return streetname;
		}

		public WebElement getCreditcardbtn() {
			return creditcardbtn;
		}

		public WebElement getCardno() {
			return cardno;
		}

		public WebElement getCardname() {
			return cardname;
		}

		public WebElement getCardmonth() {
			return cardmonth;
		}

		public WebElement getCardyear() {
			return cardyear;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getConfirmorder() {
			return confirmorder;
		}

}
