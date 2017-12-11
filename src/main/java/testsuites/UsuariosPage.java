package testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuariosPage {
	
	private WebDriver driver;
	
	public UsuariosPage(WebDriver driver) {
		this.driver = driver;
	}
	public void visita (){
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		driver.manage().deleteAllCookies();
		driver.get("http://demo.virtuemart.net/");
		
	}
	
	public NovoUsuarioPage novo() {
		driver.findElement(By.linkText("Account")).click();
		return new NovoUsuarioPage (driver);
	}
	
	public boolean existeNaListagem(String email, String nome) {
		return driver.getPageSource().contains(email) && 
			   driver.getPageSource().contains(nome);	
	}
}
//