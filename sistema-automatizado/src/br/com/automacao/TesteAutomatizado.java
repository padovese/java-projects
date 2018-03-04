package br.com.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\java-projects\\sistema-automatizado\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com.br");
				
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		
		campoDeTexto.sendKeys("teste");
		
		campoDeTexto.submit();

		driver.get("http://www.uol.com.br");  
		
		WebElement campoUOL = driver.findElement(By.name("q"));
		campoUOL.sendKeys("abc");
		campoUOL.submit();
		
		WebElement linkByPartialText = driver.findElement(By.partialLinkText("Gmail"));
				linkByPartialText.click();
		
		//driver.close();
	}
}
