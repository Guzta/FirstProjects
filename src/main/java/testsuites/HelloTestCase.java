package testsuites;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloTestCase {
	
	@Test
	public void testMain() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		
		driver.findElement(By.id("sb_ifc0")).sendKeys("spotify");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("tr.mslg:nth-child(1) > td:nth-child(1) > div:nth-child(1) > span:nth-child(1) > h3:nth-child(1) > a:nth-child(1)")).click();
		
		waitLoadPageGambeiro();
		
		driver.findElement(By.id("signup-spotify")).click();
		
		waitLoadPageGambeiro();
		
		if(!driver.findElement(By.id("register-terms-facebook")).isSelected()) {
			driver.findElement(By.id("register-terms-facebook")).click();
		}
		
		waitLoadPageGambeiro();
		
		if(!driver.findElement(By.id("register-privacy-facebook")).isSelected()) {
			driver.findElement(By.id("register-privacy-facebook")).click();
		}
		
		//driver.findElement(By.className("recaptcha-checkbox-border")).click();
		
		driver.findElement(By.id("register-email")).sendKeys("sol@uol.com");
		driver.findElement(By.id("register-confirm-email")).sendKeys("usol@sol.com");
		driver.findElement(By.id("register-password")).sendKeys("teste123");
		driver.findElement(By.id("register-displayname")).sendKeys("teste321");
		driver.findElement(By.id("register-dob-day")).sendKeys("25");
		driver.findElement(By.id("register-dob-month")).sendKeys("Outubro");
		driver.findElement(By.id("register-dob-year")).sendKeys("1979");
		
		//radio		register-male
		if(!driver.findElement(By.id("register-male")).isSelected()) {
			driver.findElement(By.id("register-male")).click();
			}
		
		if(!driver.findElement(By.id("register-thirdparty")).isSelected()) {
			driver.findElement(By.id("register-thirdparty")).click();
			}
		
		if(!driver.findElement(By.id("register-terms")).isSelected()) {
			driver.findElement(By.id("register-terms")).click();
			}
		
		if(!driver.findElement(By.id("register-privacy")).isSelected()) {
			driver.findElement(By.id("register-privacy")).click();
			}
		
		if(!driver.findElement(By.className("recaptcha-checkbox-checkmark")).isSelected()) {
			driver.findElement(By.className("recaptcha-anchor-label")).click();
			}
		
		//driver.close();
	}	
	
	private void waitLoadPageGambeiro() {
		try { Thread.sleep(5000); } catch (InterruptedException ex) {}
		
		
	}

}
