package br.com.automacao;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {
   public static void main(String[] args) {
   
      WebDriver driver = new FirefoxDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Click on Math Calculators
      driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
      
      // Click on Percent Calculators
      driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
      
      driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
      
      driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
      
      driver.navigate().to("www.google.com.br");
      
      WebElement campoDeTexto = driver.findElement(By.name("q"));
		
		campoDeTexto.sendKeys("teste");
		
		campoDeTexto.submit();
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result =
         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}