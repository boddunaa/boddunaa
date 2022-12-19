package javapack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclospayment {

	WebDriver d;
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	@BeforeMethod
	
	public void St1 () {
		
		 d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demo.cyclos.org/ui/home");
		d.findElement(By.linkText("Apply for SB/ Current Account "));
		
	}	
		
	
		

		@Test
		
		public void St2 () throws Exception {
				
		d.findElement(By.xpath("//a[@id='login-link']")).click();
		
		}
		}
		
		
		d.findElement(By.xpath("//input[@type= 'text']")).sendKeys("demo");
		d.findElement(By.xpath("//input[@type= 'password']")).sendKeys("1234");
		d.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()= 'Banking']")).click();
		d.findElement(By.xpath("//div[text()='Payment requests']")).click();
		d.findElement(By.xpath("//button[@class='form-control text-left custom-select w-100']")).click();
		d.findElement(By.xpath("//a[text()=' Canceled ']")).click();
		d.findElement(By.xpath("//a[text()= '›']")).click();
		
		}
		//List<WebElement>  e =  d.findElements(By.xpath("//button[@class='form-control text-left custom-select w-100']"));
		
		//for (int i = 0; i<e.size(); i++) {


			//e.get(i).click();
			//System.out.println(e);
		
				

	//}

		@ AfterMethod
		public void St3 () {

			d.quit();
		}
			
		
		
	}
	
	

