package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit Wait Statement
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://www.flipkart.com");
		WebElement wb=dr.findElement(By.xpath("//button[text()='✕']"));
		wb.click();
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//div[text()='Home']"))).build().perform();
		dr.findElement(By.xpath("//*[text()='Bedroom room Furniture']"));
		dr.findElement(By.linkText("Beds")).click();
		
	}

}
