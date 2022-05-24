package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit Wait Statement
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement wb=dr.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement web1=dr.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		Actions act=new Actions(dr);
		act.dragAndDrop(wb, web1);
		act.perform();
	}

}
