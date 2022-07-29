package com.mindtree.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tide {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@class=\"lilo3746-close-link lilo3746-close-icon\"]")).click();	
	    driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("ultra oxi");
	    driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	    driver.findElement(By.xpath("//*[@class=\"header-logo d-flex\"]")).click();
	    driver.findElement(By.xpath("//*[@class=\"menu-item-title event_menu_click \"]")).click();
	    driver.findElement(By.xpath("//*[@class=\"header-logo d-flex\"]")).click();
	    driver.findElement(By.xpath("//a[@href='/en-us/contact-us']")).click();
	  	     
	  	}

}
