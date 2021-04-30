package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MenuMujeresVestidosCamisetas {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\facebook.com");
		
	//	driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("Jorgeyanquen12@gmail.com");
	//	driver.findElement(By.id("passwd")).sendKeys("12345");
	//	driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.id("_6ltj")).click();
	}

}
