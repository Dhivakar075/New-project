package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class ProductSelection extends Base_Class {

	public ProductSelection() {

		PageFactory.initElements(driver, this);
	}
	
	//casual shoe xpath //div[@id='men_category_expand']//a[text()='casual shoes' and @class='c5 subCatItem tdN vT cuP']
	
	@FindBy(xpath = Product_select_Interface.shopmenbtn)
	private WebElement shopmenbtn;
	
	@FindBy(xpath = Product_select_Interface.menbtn)
	private WebElement menbtn;

	@FindBy(xpath = Product_select_Interface.formalshoebtn)
	private WebElement formalshoebtn;
	
	@FindBy(xpath = Product_select_Interface.highpricefilter)
	private WebElement highpricefilter;
	
	@FindBy(xpath = Product_select_Interface.shoe)
	private WebElement shoe;
	
	
	public WebElement getShopmenbtn() {
		return shopmenbtn;
	}
	
	public WebElement getMenbtn() {
		return menbtn;
	}
	
	public WebElement getFormalshoebtn() {
		return formalshoebtn;
	}

	public WebElement getHighpricefilter() {
		return highpricefilter;
	}

	public WebElement getShoe() {
		return shoe;
	}

}
