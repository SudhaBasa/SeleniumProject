package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
		
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.numpyninja.com/contact");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input_comp-l1c0ktzj1")).sendKeys("Sudha");
		driver.findElement(By.id("input_comp-l1c0ku01")).sendKeys("Basa");
		driver.findElement(By.name("email")).sendKeys("sudha@gmail.com");
		driver.findElement(By.id("input_comp-l1c0ku05")).sendKeys("9876543210");
		driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("Would like to know about the SDET course");
		driver.findElement(By.id("comp-l1c0ku0e3")).click();
		
		
		driver.findElement(By.id(null));
		
		driver.findElement(By.name(null));
		
		driver.findElement(By.xpath("//input[@value='Female']"));
		
		driver.findElement(By.cssSelector(null));
		
		driver.findElement(By.linkText("Click here to reload this page"));
		
		driver.findElement(By.partialLinkText("random-text-xyz-i"));
		
		driver.findElement(By.tagName(null));
		
		driver.findElement(By.className(null));
		
	}
	
	

}
