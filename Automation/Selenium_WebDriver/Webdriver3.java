package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
		WebElement wb=dr.findElement(By.xpath("//button[text()='✕']"));
		wb.click();
		Thread.sleep(3000);
		WebElement wb1=dr.findElement(By.xpath("//div[text()='Mobiles']"));
		wb1.click();
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().forward();
		Thread.sleep(3000);
		dr.navigate().refresh();	
	}

}
