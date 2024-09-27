package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjademo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		tutorialNinja();

	}

	private static void tutorialNinja() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(27));

		// 2. Select the currency in the left top corner to Euro
		driver.findElement(By.xpath("//span[text()='Currency']")).click();
		List<WebElement> currencyDrop = driver.findElements(By.xpath("//ul/li/button"));

		for (WebElement currency : currencyDrop) {
			String currncy = "€Euro";

			if (currency.getText().equalsIgnoreCase(currncy)) {
				currency.click();
			}

			// 3. Try to order a canon EOS 5 D camera and collect the error message occurred
			// due to a bug in select option by clicking add to cart.

			// WebElement cannonProduct=driver.findElement(By.xpath("//a[text()='Canon EOS 5D']/../../../div[3]/button/span[text()='Add to Cart']"));
			// cannonProduct.click();

			WebElement cannonProd = driver.findElement(By.linkText("Canon EOS 5D"));
			cannonProd.click();

			WebElement cannonSelectOption = driver.findElement(By.id("input-option226"));
			cannonSelectOption.click();

			WebElement cannonAddToCart = driver.findElement(By.id("button-cart"));
			cannonAddToCart.click();

			WebElement errorMsg = driver.findElement(By.xpath("//div[text()='Select required!']"));
			String message = errorMsg.getText();
			System.out.println("Error Message is : " + message);

			// 4. Move to the home screen by clicking home icon, Click on iphone and go to
			// details screen, change the quantity to two then add to cart.
			
					
			WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[1]/a/i"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", homeButton);


			WebElement iphoneProd=driver.findElement(By.linkText("iPhone"));
			iphoneProd.click();
			
			WebElement iphoneQty=driver.findElement(By.name("quantity"));
			iphoneQty.clear();
			iphoneQty.sendKeys("2");
			
			WebElement IphoneAddToCart=driver.findElement(By.xpath("//button[text()='Add to Cart']"));
			IphoneAddToCart.click();
			
			//5. Print the success message in the console
			
			WebElement iPhoneSuccessMsg=driver.findElement(By.xpath("//div[text()='Success: You have added ']"));
			System.out.println("Iphone Success Message : "+iPhoneSuccessMsg.getText());
			
			//6. Click on the cart icon (black color) in the right side top then click view cart
			
			WebElement cart=driver.findElement(By.xpath("//span[@id='cart-total']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", cart);
		Thread.sleep(3000);
			cart.click();
			
			WebElement viewCart=driver.findElement(By.xpath("//strong[text()='View Cart']/.."));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", viewCart);
			Thread.sleep(3000);

			viewCart.click();
			
			    

			//7. Change the quantity of iphone to 3 and click update button
			
			
			
			WebElement updateCart=driver.findElement(By.xpath("//a[text()='HP LP3065']/../../td[4]//button[1]"));
		//	((JavascriptExecutor)driver).executeScript("arguments[0].click();", updateCart);

			updateCart.clear();
			updateCart.sendKeys("3");
			
			WebElement updateButton=driver.findElement(By.xpath("//button[@type='submit']"));
			updateButton.click();
			
			
		}

	}

}
