package javapack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverGc {

	WebDriver d;
	
	@BeforeMethod
	public void  setup() {
		 d = new ChromeDriver();
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	}
	@AfterMethod
	public void  close() {
		d.quit();
		}
}

