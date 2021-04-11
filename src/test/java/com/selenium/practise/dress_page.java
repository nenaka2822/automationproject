package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress_page{
	
public WebDriver driver;

@FindBy(xpath="(//a[@title='Dresses'])[2]") 

private WebElement Dress;
public dress_page (WebDriver driver2){
	this.driver=driver2;
	
	PageFactory.initElements(driver,this);	
	
}
public WebElement getDress() {
	return Dress;
	
}
 @FindBy(xpath=("(//a[@title='Evening Dresses'])[3]"))
private WebElement eveningdress;
public WebElement getEveningdress() {
	return eveningdress;
}


}


