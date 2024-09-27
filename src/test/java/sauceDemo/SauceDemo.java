package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	
	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	WebElement userName=driver.findElement(By.id("user-name"));
	userName.sendKeys("visual_user");
	
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys("secret_sauce");
	
	WebElement loginBtn=driver.findElement(By.id("login-button"));
	loginBtn.click();
	
	WebElement bag=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/../../..//button[text()='Add to cart']"));
	bag.click();
	
	
	
	
	
	driver.close();
	}
}
