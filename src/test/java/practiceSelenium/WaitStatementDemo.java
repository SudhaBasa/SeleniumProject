package practiceSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementDemo {

	public static void main(String[] args) throws InterruptedException {

		// WaitStatementDemo doc=new WaitStatementDemo();
		// doc.waits();
		waits();

	}

	private static void waits() throws InterruptedException {

		// private void waits() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium" + Keys.ENTER);
		// driver.findElement(By.xpath("//input[@value='Google Search']")).click();

		// Explicit Wait
		WebElement imageLink = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		System.out.println(imageLink.getText());
		imageLink.click();

		// Fluent wait

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100)).ignoring(ElementClickInterceptedException.class)
				.ignoring(NoSuchElementException.class);

		WebElement demo = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Selenium (software) - Wikiversity']")));
		demo.click();

		System.out.println(demo.getText());

		// Java wait
		Thread.sleep(5000);

		// driver.close();
		driver.quit();

	}

}
