package com.SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://www.naukri.com/");
		WebElement wb=dr.findElement(By.xpath("//div[text()='Companies']"));
		Actions act=new Actions(dr);
		act.moveToElement(wb).build().perform();
		dr.findElement(By.xpath("//a[text()='Product based']")).click();
		Set<String> windowid=dr.getWindowHandles();
		Iterator<String> itr=windowid.iterator();
		String Parentid=itr.next();
		String Childid=itr.next();
		dr.switchTo().window(Childid);
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[text()='Startup (155)']")).click();
	}

}
