package com.com.bancodebogota.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.co.bancodebogota.FactoryTextBox;
import com.co.bancodebogota.TestLinkIntegration;

import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Prueba1 {
	
	private WebDriver driver = null;
	FactoryTextBox prueba;
	
	@BeforeMethod
	@Parameters({"browser"})
	  public void beforeMethod(String browser) throws InterruptedException {
		
		
		if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
			driver = new FirefoxDriver();
					
		  }
		 
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
			driver = new ChromeDriver();
			
		}
	  	prueba=new FactoryTextBox(driver);
		
	  }
	
	@Test
	  public void f1() throws InterruptedException, TestLinkAPIException {
		driver.get("https://www.toolsqa.com/javascript-tutorial/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@id='primary-menu']//span[@class='menu-item-text']//span[@class='menu-text'])[48]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='category-cards']/div)[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		Thread.sleep(2000);
		prueba.ingresarCampo1();
		Thread.sleep(2000);
		prueba.ingresarCampo2();
		Thread.sleep(2000);
		prueba.ingresarCampo3();
		Thread.sleep(2000);
		prueba.ingresarCampo4();
		Thread.sleep(3000);
		prueba.ClickBoton();
		TestLinkIntegration.updateResults("CP-01leidy", null, TestLinkAPIResults.TEST_PASSED);
		
	  }
	@Test
	  public void f2() throws InterruptedException {
		driver.get("https://www.toolsqa.com/javascript-tutorial/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@id='primary-menu']//span[@class='menu-item-text']//span[@class='menu-text'])[48]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='category-cards']/div)[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		Thread.sleep(2000);
		prueba.ingresarCampo1();
		Thread.sleep(2000);
		prueba.ingresarCampo2();
		Thread.sleep(2000);
		prueba.ingresarCampo3();
		Thread.sleep(2000);
		prueba.ingresarCampo4();
		Thread.sleep(3000);
		prueba.ClickBoton();
		
	  }
  
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
