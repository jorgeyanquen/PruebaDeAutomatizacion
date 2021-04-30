package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeAgregarAlCarrito {

	static By registerLinkLocator = By.linkText("View my shopping cart");
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		
	//	driver.findElement(By.className("login")).click();
	//	driver.findElement(By.id("email")).sendKeys("Jorgeyanquen12@gmail.com");
	//	driver.findElement(By.id("passwd")).sendKeys("12345");
	//	driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(registerLinkLocator).click();
		driver.findElement(By.linkText("T-shirts")).click();
	}
}
