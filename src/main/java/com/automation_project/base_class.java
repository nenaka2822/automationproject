package com.automation_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base_class {
	public static WebDriver driver;
	public static WebDriver getbrower(String type) {
		
	
	if(type.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
     +"//driver//chromedriver.exe");
	driver=new ChromeDriver();
		
	}
	else if (type.equalsIgnoreCase("geckodriver")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")
			     +"//driver//geckodriver.exe");
			driver= new FirefoxDriver();
					
	}			
	
	return driver;

	}
	public static void getUrl(String Url) {
		driver.get(Url);
	}
public static void Clickonelement(WebElement element) {
  element.click();
}
public static void clickonvalue(WebElement element,String value) {
element.sendKeys(value);


}

}
