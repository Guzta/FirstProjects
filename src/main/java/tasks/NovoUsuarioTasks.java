package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.NovoUsuarioAppObject;
import dataProvider.Usuario;

public class NovoUsuarioTasks {
	
	private WebDriver driver;
	private NovoUsuarioAppObject novoUsuarioAppObject;
	
	public NovoUsuarioTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.novoUsuarioAppObject = new NovoUsuarioAppObject(driver);
	}
	
	public void cadastra(Usuario usuario) throws InterruptedException {
		Thread.sleep(5000);
		//this.novoUsuarioAppObject.getGetContaTextField().sendKeys(usuario.getNome());
		this.novoUsuarioAppObject.getEmailTextField().sendKeys(usuario.getEmail());
		
	}	
}