package webdriverMavenGIT;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;


	@BeforeSuite
	public void setUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@Test
	public void doLoginIn() {

		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.findElement(By.id("username")).sendKeys("angular");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("signin")).click();
		


	}


	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
