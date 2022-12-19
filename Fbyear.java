package javapack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbyear {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebDriver d = new ChromeDriver();
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		Thread.sleep(3000);
		
		Select year = new Select(d.findElement(By.xpath("//select[@name='birthday_year']")));
		
			List<WebElement> monyear = year.getOptions();
			
			for (int i = 0; i < monyear.size(); i++) {
				monyear.get(i).click();
				System.out.println(monyear.get(i).getText());
				
			}
			

	}

}
