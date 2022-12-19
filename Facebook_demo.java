package javapack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_demo {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		
		d.get("https://facebook.com");
		
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		Thread.sleep(3000);
		Select day=new Select(d.findElement(By.xpath("//select[@name='birthday_day']")));
		
		List<WebElement> monthday=day.getOptions();
		
		for (int i = 0; i < monthday.size(); i++) {
			
			monthday.get(i).click();
			
			System.out.println(monthday.get(i).getText());
		}
		
		Thread.sleep(3000);
		Select mon=new Select(d.findElement(By.xpath("//select[@name='birthday_month']")));
		
		
		List<WebElement> option=mon.getOptions();
		
		for (int i = 0; i < option.size(); i++) {
			
			option.get(i).click();
			
			System.out.println(option.get(i).getText());
			
		}
		
	//	d.findElement(By.xpath(""))
		
	}

}
