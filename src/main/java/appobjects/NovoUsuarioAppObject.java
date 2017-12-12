package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoUsuarioAppObject {

	private WebDriver driver;

	public NovoUsuarioAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Mapeia o text field tal na tela e retorna o web element 
	 * 
	 * @param
	 * @returns
	 * @throws
	 */
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("email_field"));
	}
	
	public WebElement getUserNameTextField() {
		return this.driver.findElement(By.id("username_field"));
	}
	
	public WebElement getDisplayedNameTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"name_field\"]"));
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"password_field\"]"));
	}
	
	public WebElement getConfirmPassowrdTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"password2_field\"]"));
	}
	
	public WebElement getCompanyNameTextField() {
		return this.driver.findElement(By.id("company_field"));
	}
	
	public WebElement getFirstNameTextField() {
		return this.driver.findElement(By.id("first_name_field"));
	}
	
	public WebElement getLastNameTextField() {
		return this.driver.findElement(By.id("last_name_field"));
	}
	
	public WebElement getAddress1TextField() {
		return this.driver.findElement(By.id("address_1_field"));
	}
	
	public WebElement getPostalCodeTextField() {
		return this.driver.findElement(By.id("zip_field"));
	}
	
	public WebElement getCityTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"city_field\"]"));
	}
	
	public WebElement getSelectCountryfieldTextField() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form[2]/fieldset[2]/table/tbody/tr[10]/td[2]/div/a/span"));
	}
	
	public WebElement getCountryNameTextField() {
		return this.driver.findElement(By.id("virtuemart_country_id_field_chzn_o_1"));
	}
	
	public WebElement getFaxfieldTextField() {
		return this.driver.findElement(By.id("fax_field"));
	}
	
	public WebElement getRegisterTextField() {
		return this.driver.findElement(By.className("button"));
	}
	
}