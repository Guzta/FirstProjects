package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoUsuarioAppObject {

	private WebDriver driver;
	// esse primeiro (getContaTextField) é um botão, ver como faz o click
	private WebElement getContaTextField;
	private WebElement getEmailTextField;
	private WebElement getUserNameField;
	private WebElement displayedname; 

	public NovoUsuarioAppObject(WebDriver driver) {
		this.driver = driver;
		//this.getContaTextField = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[3]/ul/li[2]/a"));
		//this.getEmailTextField = driver.findElement(By.id("email_field"));
		//this.getUserNameField  = driver.findElement(By.id("username_field"));		
		this.displayedname = driver.findElement(By.xpath("//*[@id=\"name_field\"]"));
	}
	
	public WebElement getGetContaTextField() {
		return getContaTextField;
	}
	
	public WebElement getGetEmailTextField() {
		return getEmailTextField;
	}
	
	public WebElement getUserNameField() {
		return getUserNameField;
	}

	public WebElement getDisplayedNameTextField() {
		return displayedname;
	}
	

}