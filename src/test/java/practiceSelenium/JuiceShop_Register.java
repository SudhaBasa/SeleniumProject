package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JuiceShop_Register {
	
	public static WebDriver driver=new ChromeDriver();
	
	String URL="https://juice-shop.herokuapp.com/#/register";
	
	
	By dismissBtn=By.xpath("//span[text()='Dismiss']");
	By emailID=By.id("emailControl");
	By pwd=By.id("passwordControl");
	By confirmPwd= By.id("repeatPasswordControl");
	By secQnBox=By.xpath("//div[@id='mat-select-value-1']/span");
	By secQn=By.xpath("//*[@id=\"mat-option-0\"]");
	By secQnAns=By.id("securityAnswerControl");
	
	@Test
	public void register() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.findElement(dismissBtn).click();
		driver.findElement(emailID).sendKeys("sudhabasa@gmail.com");
		driver.findElement(pwd).sendKeys("abc123");
		driver.findElement(confirmPwd).sendKeys("abc123");
		driver.findElement(secQnBox).click();
		driver.findElement(secQn).click();
		driver.findElement(secQnAns).sendKeys("Madhuri");
		
		
	
	
	
	}

}
