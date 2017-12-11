package testsuites;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EMartCadastro {
	
	private WebDriver driver;
	

    @Before
    public void inicializa() {  
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
       this.driver = new FirefoxDriver();  
    }
	
	
	@Test
	public void deveAdicionarUmUsuario() {			
		
		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("uol@sol", "aaa");
		
		assertTrue(usuarios.existeNaListagem("uol@sol", "aaa"));
		
//========================================================================================
//		//3 Displayed Name *
//		WebElement displayedname = driver.findElement(By.id("name_field"));
//		displayedname.sendKeys("bbb");
//		
//		
//		//4 Password *
//		WebElement password = driver.findElement(By.id("password_field"));
//		password.sendKeys("teste123");
//		
//		
//		//5 Confirm Password *
//		WebElement confirmpassowrd = driver.findElement(By.id("password2_field"));
//		confirmpassowrd.sendKeys("teste123");
//		
//		
//		//6 Company Name
//		WebElement companyname = driver.findElement(By.id("company_field"));
//		companyname.sendKeys("ccc");
//		
//		
//		
//		//7 First Name 		
//		WebElement firstname = driver.findElement(By.id("first_name_field"));
//		firstname.sendKeys("ddd");
//		
//		
//		//8 Last Name *
//		WebElement lastname = driver.findElement(By.id("last_name_field"));
//		lastname.sendKeys("eee");
//		
//		
//		//9 Address 1 *
//		WebElement address1 = driver.findElement(By.id("address_1_field"));
//		address1.sendKeys("fff");
//		
//		
//		//10 Zip / Postal Code *
//		WebElement postalcode = driver.findElement(By.id("zip_field"));
//		postalcode.sendKeys("909090");
//		
//		
//		//11 City *
//		WebElement city = driver.findElement(By.id("city_field"));
//		city.sendKeys("city");
//		
//		
//		//12.1 Country *
//		WebElement selectcountryfield = driver.findElement(By.xpath("//*[@id=\"virtuemart_country_id_field_chzn\"]/a"));
//		selectcountryfield.click();
//		
//		//12.2 Country Name
//		WebElement countryname = driver.findElement(By.id("virtuemart_country_id_field_chzn_o_1"));
//		countryname.click();
//		
//		/*
//		//- VERIFÍCA SE FOR TRUE - NÃO ESTÁ FUNCIONANDO, PROVAVEL QUE SEJA O GET PAGE SOURCE O PROBLEMA - 
//		assertTrue(driver.getPageSource().contains("<h3>Paid extensions demo</h3>"));
//		assertTrue("aaa".equals(driver.findElement(By.id("username_field")).getText()));
//		*/
//						
//		//click fora - clicando fora ele consegue clicar no registrar - se remover esse campo ele não clica no registrar
//		WebElement faxfield = driver.findElement(By.id("fax_field"));
//		faxfield.click();
	
		/*
		sleep(5000);
		//1 Register 
		WebElement register = driver.findElement(By.className("button"));
		register.click();
		*/
	}
	

	/*
	@After
		public void finaliza() {
		driver.close();
	}
	*/
}	
