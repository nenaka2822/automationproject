package com.selenium.practise;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qty_page {
	private WebDriver driver;
@FindBy(xpath="//i[@class='icon-plus']")
public WebElement qty;
public qty_page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this );
}
public WebElement getQty() {
	return qty;
}

@FindBy(name="group_1")
public WebElement size;
public WebElement getSize() {
return size;

}
@FindBy(name="Pink")
public WebElement clr;
public WebDriver getDriver() {
	return driver;
}
public WebElement getClr() {
	return clr;
}
@FindBy(name="Submit")
public WebElement Submit_btn;
public WebElement getSubmit_btn() {
	return Submit_btn;
}

}
