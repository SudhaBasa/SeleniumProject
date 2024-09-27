package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement user_name = driver.findElement(By.xpath("//input[@name='user-name']"));
		user_name.sendKeys("standard_user");

		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();

		String products[] = { "Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Onesie" };
		for (String product : products) {
			WebElement addToCart = driver.findElement(
					By.xpath("//div[text()='" + product + "']/../../../div[2]/button[text()='Add to cart']"));
			addToCart.click();
		}
		
		WebElement shoppingContainer=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		shoppingContainer.click();
		
		WebElement checkOut=driver.findElement(By.name("checkout"));
		checkOut.click();
		
		WebElement firstName=driver.findElement(By.id("first-name"));
		firstName.sendKeys("Sudha");
		
		WebElement lastName=driver.findElement(By.id("last-name"));
		lastName.sendKeys("Basa");
		
		WebElement postCode=driver.findElement(By.id("postal-code"));
		postCode.sendKeys("75035");
		
		WebElement continuee=driver.findElement(By.xpath("//input[@value='Continue']"));
		continuee.click();
		
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		
		WebElement successMsg=driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		System.out.println("Successfully placed your ordered : "+ successMsg.getText());
		
		WebElement backToHome=driver.findElement(By.id("back-to-products"));
		backToHome.click();
			
		WebElement openMenu=driver.findElement(By.xpath("//button[text()='Open Menu']"));
		openMenu.click();
		
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Logout']"));
		logOut.click();
		
		//driver.close();

	}

}
