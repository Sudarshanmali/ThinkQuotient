package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		//Enter URL
		dr.get("https://online.actitime.com/smali/login.do");
		dr.manage().window().maximize();
		WebElement wb=dr.findElement(By.name("username"));
		wb.sendKeys("sudarshanmali703@gmail.com");
		wb.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(3000);
		wb.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		wb.sendKeys(Keys.TAB);
		wb.click();
		Thread.sleep(3000);
		wb.sendKeys(Keys.CONTROL,"v");
		
	}
}
