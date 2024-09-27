package helloWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\Users\Sudha Basa\Desktop\Numpy Ninja\SeleniumProject\src\test\resources\drivers\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.numpyninja.com/contact");
		
		WebElement firstname=driver.findElement(By.name("first-name"));
		firstname.sendKeys("Sudha");
		
		WebElement lastName=driver.findElement(By.id("input_comp-l1c0ku01"));
		lastName.sendKeys("Basa");
		
		WebElement emailId=driver.findElement(By.id("input_comp-l1c0ku03"));
		emailId.sendKeys("sudha@gmail.com");
		
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9999999999");
		
		WebElement enquiry=driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquiry.sendKeys("when is the sdet course going to start");
		
		WebElement sendButton=driver.findElement(By.id("comp-l1c0ku0e3"));
		sendButton.click();
		
		
		
		//driver.close();
		
	}
	
	

}
