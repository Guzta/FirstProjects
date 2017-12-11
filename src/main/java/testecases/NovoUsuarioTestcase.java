package testecases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.Usuario;
import tasks.NovoUsuarioTasks;

public class NovoUsuarioTestcase {
	
	private static WebDriver driver;
	private NovoUsuarioTasks novoUsuarioTasks;
			
	@Before
    public void inicializa() {  
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
       this.driver = new FirefoxDriver(); 
       this.novoUsuarioTasks = new NovoUsuarioTasks(driver);
       driver.manage().deleteAllCookies();
       driver.get("http://demo.virtuemart.net/account");
    }
	
	@Test
	public void deveAdicionarUmUsuario() throws InterruptedException {	
		
		Usuario usuario1 = new Usuario("Cyntrovisk");
		this.novoUsuarioTasks.cadastra(usuario1);
	}
	
	@After
	public void finaliza() {
	driver.close();
}
}
