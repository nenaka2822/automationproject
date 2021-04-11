package com.automation_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class image_page {

	public WebDriver driver;
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
private WebElement image;	
	
	public image_page(WebDriver driver2) {
		this.driver=driver2;
	
	PageFactory.initElements(driver,this);	
	
}
	public WebElement getImage() {
		return image;
	}
	
	
	
	
	
	
	
}
