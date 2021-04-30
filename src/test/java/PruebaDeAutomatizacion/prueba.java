package PruebaDeAutomatizacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("View my shopping cart");

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("Jorgeyanquen12@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
	//	By registerLinkLocator = By.linkText("cart");
		driver.findElement(registerLinkLocator).click();
	//	driver.findElement(By.linkText("View my shopping cart")).click();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebElement searchbox = driver.findElement(By.name("q"));
		
	}

}
