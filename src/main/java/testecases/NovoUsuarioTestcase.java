package testecases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataprovider.Usuario;
import tasks.NovoUsuarioTasks;

public class NovoUsuarioTestCase {
	private static WebDriver driver;
	private NovoUsuarioTasks novoUsuarioTasks;
			
	@Before
    public void inicializa() {  
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
    NovoUsuarioTestCase.driver = new FirefoxDriver(); 
    this.novoUsuarioTasks = new NovoUsuarioTasks(driver);
    driver.manage().deleteAllCookies();
    driver.get("http://demo.virtuemart.net/account");
    }
	
	@Test
	public void deveAdicionarUmUsuario() throws InterruptedException {	
		
		Usuario usuario1 = new Usuario("uol@sol", "Cyntrovisk", "Sim_Tra", "teste123", "teste123", "CBServer", 
										"MaMeus", "NaoLee", "Rua", "zeroumdois", "poa");
		this.novoUsuarioTasks.cadastrar(usuario1);
	}	
	
	@After
	public void finaliza() {
	driver.close();
	}
}
