package javapack;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclosscreenshot {
	
	WebDriver d ;
	DateFormat Sdf;
	Date dt ;
	
	@Test(priority = 1)
	public void Set1 () {
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demo.cyclos.org/ui/home");
		d.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void Set2 () throws Exception {
		d.findElement(By.xpath("//a[@id='login-link']")).click();
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		//d.findElement(By.xpath("//input[@type='password']")).sendKeys("12321");
		d.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		GetSrn();
		
		
	
	}
	public void GetSrn() throws Exception {
		
		Sdf = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		dt = new Date();
		File Scn1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Scn1, new File("C:\\JAVA\\selenium-server\\KFIN\\screenshots\\screenshot "+Sdf.format(dt)+".png"));
		
	}

	@Test(priority = 3)
	public void Set3 () {
		d.quit();
	}
	}
