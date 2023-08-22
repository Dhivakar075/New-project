package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Cart extends Base_Class{
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Cart_Interface.shoesize)
	private WebElement shoesize;

	@FindBy(xpath = Cart_Interface.addtocartbtn)
	private WebElement addtocartbtn;
	
	@FindBy(xpath = Cart_Interface.buynowbtn)
	private WebElement buynowbtn;
	
	@FindBy(xpath = Cart_Interface.phoneinput)
	private WebElement phoneinput;
	
	@FindBy(xpath = Cart_Interface.otpinput)
	private WebElement otpinput;
	
	public WebElement getShoesize() {
		return shoesize;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getBuynowbtn() {
		return buynowbtn;
	}

	public WebElement getPhoneinput() {
		return phoneinput;
	}

	public WebElement getOtpinput() {
		return otpinput;
	}
	
	
	
	
}
