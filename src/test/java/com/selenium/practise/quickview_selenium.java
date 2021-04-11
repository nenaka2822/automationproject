package com.selenium.practise;
import java.text.NumberFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class quickview_selenium extends base_class{
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException  {

	driver=getbrower("chrome");
	getUrl("http://automationpractice.com/");
	driver.manage().window().maximize();
	
	home_page home=new home_page(driver);
Clickonelement(home.getSignin());
Thread.sleep(5000);
login_page login=new login_page(driver);
	clickonvalue(login.getEmail(),"mahaa2@gmail.com");
	Thread.sleep(5000);
	clickonvalue(login.getPassword(),"mahaa28");
	Thread.sleep(5000);
	Clickonelement(login.getBtn());
	Thread.sleep(5000);
	dress_page dress=new dress_page(driver);
	Clickonelement(dress.getDress());

	Clickonelement(dress.getEveningdress());
	Thread.sleep(5000);
	image_page image =new image_page(driver);	
	Clickonelement(image.getImage());
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	
	qty_page qty=new qty_page(driver);
    Clickonelement(qty.getQty());
  
	Clickonelement(qty.getSize());
	dropdown (qty.getSize(), "byvalue", "2");
	Clickonelement(qty.getClr());
	Clickonelement(qty.getSubmit_btn());
	Thread.sleep(3000);
	ptc p=new ptc(driver);
	Clickonelement(p.getPtc());
	Thread.sleep(5000);
	Clickonelement(p.getPtc1());
	Thread.sleep(5000);
	Clickonelement(p.getAdd());
	Thread.sleep(5000);
	Clickonelement(p.checkbox);
	Thread.sleep(5000);
	Clickonelement(p.getPtc2());
	Thread.sleep(5000);
	Clickonelement(p.getBank());
	Clickonelement(p.getBookingorder());
	Clickonelement(p.getBck());
		
		}
private static void dropdown(WebElement element, String type, String value) {
	
	
		try {
			Select s=new Select(element);

if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
}
else if (type.equalsIgnoreCase("byvisibletext"))
				{
s.selectByVisibleText(value);
}
else if (type.equalsIgnoreCase("byindex")) {
int parseint =Integer.parseInt(value);
s.selectByIndex(parseint);
}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}	
	}
		
		
	


