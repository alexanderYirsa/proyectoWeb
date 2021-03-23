package com.co.bancodebogota;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FactoryTextBox {
	
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement campo1;
	
	@FindBy(id="userEmail")
	WebElement campo2;
	
	@FindBy(id="currentAddress")
	WebElement campo3;
	
	@FindBy(xpath="(//textarea[@class='form-control'])[2]")
	WebElement campo4;
	
	@FindBy(id="submit")
	WebElement boton1;
	
	public FactoryTextBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	public void ingresarCampo1() {
		
		campo1.sendKeys("Alexander");
		
	}
	
	public void ingresarCampo2() {
		
		campo2.sendKeys("alexander@gmail.com");
		
	}
	
	public void ingresarCampo3() {
		
		campo3.sendKeys("calle 6 sur No. 18 B 66");
		
	}
	
	public void ingresarCampo4() {
		
		campo4.sendKeys("calle 16 sur No. 18 B 66");
		
	}
	
	public void ClickBoton() {
		
		boton1.click();
		
	}	

}
