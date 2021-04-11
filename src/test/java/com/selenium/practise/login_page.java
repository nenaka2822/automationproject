package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
public WebDriver driver;

@FindBy(id="email")
private WebElement email;
public login_page(WebDriver driver2) {
	this.driver=driver2;
	
	PageFactory.initElements(driver,this);	
	
}

public WebElement getEmail() {
	return email;}

@FindBy(name="passwd")
private WebElement password;

public WebElement getPassword() {
	return password;
}

public WebElement getBtn() {
	return btn;
}

@FindBy(id="SubmitLogin")
private WebElement btn;




}

