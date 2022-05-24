package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		//Enter URL
		dr.get("https://online.actitime.com/smali/login.do");
		//Identify d Username
		WebElement wb=dr.findElement(By.id("username"));
		//Enter d value to username field
		wb.sendKeys("sudarshanmali703@gmail.com");
		String value=wb.getAttribute("value");
		//Attribute is used to capture the value of  placeholder
		System.out.println(value);
		dr.close();
	}
}
