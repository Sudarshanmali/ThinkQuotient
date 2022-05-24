package com.SeleniumWebDriver;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement3 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
			//Launch d browser
			WebDriver dr=new ChromeDriver();
			//Enter URL
			dr.get("https://online.actitime.com/smali/login.do");
			org.openqa.selenium.Point location=dr.findElement(By.id("loginButton")).getLocation();
			System.out.println(location);
			String color=dr.findElement(By.id("loginButton")).getCssValue("color");
			System.out.println(color);
			String fontweight=dr.findElement(By.id("loginButton")).getCssValue("font-weight");
			System.out.println(fontweight);
			String fontsize=dr.findElement(By.id("loginButton")).getCssValue("font-size");
			System.out.println(fontsize);
			dr.close();
		}
}