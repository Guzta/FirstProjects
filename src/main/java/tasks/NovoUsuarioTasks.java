package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.NovoUsuarioAppObject;
import dataprovider.Usuario;

public class NovoUsuarioTasks {
	

	private NovoUsuarioAppObject novoUsuarioAppObject;
	
	public NovoUsuarioTasks(WebDriver driver) {

		this.novoUsuarioAppObject = new NovoUsuarioAppObject(driver);
	}
	
	public void cadastrar(Usuario usuario) throws InterruptedException {
		Thread.sleep(5000);
		//this.novoUsuarioAppObject.getGetContaTextField().sendKeys(usuario.getNome());
		this.novoUsuarioAppObject.getEmailTextField().sendKeys(usuario.getEmail());
		this.novoUsuarioAppObject.getUserNameTextField().sendKeys(usuario.getNome());
		this.novoUsuarioAppObject.getDisplayedNameTextField().sendKeys(usuario.getApelido());
		this.novoUsuarioAppObject.getPasswordTextField().sendKeys(usuario.getSenha());
		this.novoUsuarioAppObject.getConfirmPassowrdTextField().sendKeys(usuario.getSenha2());
		this.novoUsuarioAppObject.getCompanyNameTextField().sendKeys(usuario.getCompania());
		this.novoUsuarioAppObject.getFirstNameTextField().sendKeys(usuario.getPrimeiroNome());
		this.novoUsuarioAppObject.getLastNameTextField().sendKeys(usuario.getUltimoNome());
		this.novoUsuarioAppObject.getAddress1TextField().sendKeys(usuario.getEndereco());
		this.novoUsuarioAppObject.getPostalCodeTextField().sendKeys(usuario.getCodigoPostal());
		this.novoUsuarioAppObject.getCityTextField().sendKeys(usuario.getCidade());
		this.novoUsuarioAppObject.getSelectCountryfieldTextField().click();
		this.novoUsuarioAppObject.getCountryNameTextField().click();
		this.novoUsuarioAppObject.getFaxfieldTextField().click();
		this.novoUsuarioAppObject.getRegisterTextField().click();
		
	}	
	
}