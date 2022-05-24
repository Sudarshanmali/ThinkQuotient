package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		//Enter URL
		dr.get("https://online.actitime.com/smali/login.do");
		WebElement wb=dr.findElement(By.id("username"));
		//Enter d value to Username field
		wb.sendKeys("sudarshanmali703@gmail.com");
		Thread.sleep(3000);
		String text=dr.findElement(By.id("keepLoggedInLabel")).getText();
		System.out.println(text);
		String forgotelement=dr.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(forgotelement);
		dr.close();
		dr.quit();
	}

}
