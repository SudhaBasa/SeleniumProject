package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BstackDemo {

	public static void main(String[] args) throws InterruptedException {

		// ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless"); // executed the program in
		// invisible mode

		// WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new ChromeDriver();

		driver.get("https://bstackdemo.com/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement userName = driver.findElement(By.xpath("//div[text()='Select Username']"));
		userName.click();

		driver.findElement(By.xpath("//div[text()='demouser']")).click();

		WebElement pwd = driver.findElement(By.xpath("//div[text()='Select Password']"));
		pwd.click();

		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();

		WebElement logInBtn = driver.findElement(By.xpath("//button[text()='Log In']"));
		logInBtn.click();

		String products[] = { "iPhone 12 Mini", "iPhone XS" };
		// String prods[] = { "Galaxy S20 Ultra", "Galaxy Note 20" };

		for (String product : products) {
			WebElement addToCart = driver
					.findElement(By.xpath("//p[text()='" + product + "']/../div[text()='Add to cart']"));
			addToCart.click();
		}
		/*
		 * for (String prod : prods) { WebElement addToCart1 = driver
		 * .findElement(By.xpath("//p[text()='" + prod +
		 * "']/../div[text()='Add to cart']")); addToCart1.click(); }
		 */

		WebElement cart = driver.findElement(By.xpath("//span[@class='bag']"));
		cart.click();

		WebElement checkOut = driver.findElement(By.xpath("//div[text()='Checkout']"));
		checkOut.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstNameInput']"));
		firstName.sendKeys("Sudha");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastNameInput']"));
		lastName.sendKeys("Basa");

		WebElement address = driver.findElement(By.xpath("//input[@id='addressLine1Input']"));
		address.sendKeys("Frisco");

		WebElement state = driver.findElement(By.xpath("//input[@id='provinceInput']"));
		state.sendKeys("Texas");

		WebElement zipCode = driver.findElement(By.xpath("//input[@id='postCodeInput']"));
		zipCode.sendKeys("75035");

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();

		WebElement successMsg = driver
				.findElement(By.xpath("//legend[text()='Your Order has been successfully placed.']"));
		System.out.println("Success Message  : " + successMsg.getText());

		WebElement continueShopping = driver.findElement(By.xpath("//button[text()='Continue Shopping »']"));
		continueShopping.click();

		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		logOut.click();

		Thread.sleep(15);

		driver.close();

	}

}
