package com.automation_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ptc {
	private WebDriver driver;
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	public WebElement ptc;
public ptc (WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPtc() {
		return ptc;
	}
	@FindBy(xpath=("(//a[@title='Proceed to checkout'])[2]"))
	public WebElement ptc1;
	public WebElement getPtc1() {
		return ptc1;
	}		
	
	@FindBy(name="processAddress")
	public WebElement add;
	public WebElement getAdd() {
		return add;
	}
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(name="processCarrier")
	public WebElement ptc2;
	public WebElement getPtc2() {
		return ptc2;
	}
	@FindBy(xpath="//a[@class='cheque']")
	public WebElement bank;
	public WebElement getBank() {
		return bank;
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement bookingorder;
	public WebElement getBookingorder() {
		return bookingorder;
	}
	@FindBy (xpath="//a[@title='Back to orders']")
	public WebElement bck;
	public WebElement getBck() {
		return bck;
	}
	
	
}

