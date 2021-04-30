package PruebaDeAutomatizacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aas {
	
	  private WebDriver driver;
	    private static final By carro  = By.linkText("View my shopping cart");

	@Before
	public void setUp()  {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--lang=co");
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("http://automationpractice.com/");

	        WebElement texto_usuario = driver.findElement(carro);
	}

	@After
	public void  logout(){
      //  driver.close();
	}

	@Test
	public void capacitacion() throws  Exception{
        WebElement texto_usuario = driver.findElement(carro);
        texto_usuario.click();

        Thread.sleep(2000);
	}

}
