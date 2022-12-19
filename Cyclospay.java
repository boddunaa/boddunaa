package javapack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclospay extends DriverGc {

	@Test
	public void Step1 () throws Exception {
		
		d.get("https://demo.cyclos.org/ui/home");
		d.findElement(By.xpath("//a[@id= 'login-link']")).click();
		d.findElement(By.xpath("//input[@type= 'text']")).sendKeys("Demo");
		d.findElement(By.xpath("//input[@type= 'password']")).sendKeys("1234");
		d.findElement(By.xpath("//span[text()='Submit']")).click();
		d.findElement(By.xpath("//div[text()=' Receive QR-code payment ']")).click();
		FileInputStream fis = new FileInputStream("C://JAVA//selenium-server//KFIN//screenshots//payment sheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheet("Sheet1");
	
		for (int i = 0; i < s.getLastRowNum(); i++) {
			
		
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
		
		String amo = d.findElement(By.xpath("//input[@type='tel']")).getAttribute("value");		
		
		if(amo.equals(641)) {
			
		d.findElement(By.xpath("//span[text() ='Next']")).click();	
			
			}
	
		}
	}
}