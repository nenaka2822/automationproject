package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project_qickview {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\selenium practise\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	driver.get("http://automationpractice.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("mahaa2@gmail.com");
	WebElement pword = driver.findElement(By.name("passwd"));
	pword.sendKeys("mahaa28");
	Thread.sleep(5000);
	WebElement btn = driver.findElement(By.id("SubmitLogin"));
    btn.click();
    Thread.sleep(5000);
	WebElement dress= driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
    dress.click();
    WebElement even = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[3]"));
    even.click();
    Thread.sleep(5000);
	WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	img.click();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	qty.click();
	WebElement size = driver.findElement(By.name("group_1"));
	size.click();
	Select sc=new Select(size);
	sc.selectByValue("2");
	WebElement clr = driver.findElement(By.name("Pink"));
	clr.click();
	WebElement sub_btn = driver.findElement(By.name("Submit"));
	sub_btn.click();
	Thread.sleep(3000);
	WebElement ptc = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
	ptc.click();
	WebElement ptc1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	ptc1.click();
	Thread.sleep(3000);
	WebElement add = driver.findElement(By.name("processAddress"));
	add.click();
	Thread.sleep(5000);
	WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	chkbox.click();Thread.sleep(5000);
	WebElement ptc2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	ptc2.click(); 
	Thread.sleep(5000);
    WebElement bank = driver.findElement(By.xpath("//a[@class='cheque']"));
	bank.click();
	WebElement booking_order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	booking_order.click();
	WebElement bck = driver.findElement(By.xpath("//a[@title='Back to orders']"));
    bck.click();
	

	}}