package practiceSelenium;

import java.time.Duration;
import java.util.List;

import javax.annotation.processing.AbstractProcessor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoreFunctions {

	static WebDriver driver;

	public static void main(String[] args) {

		// seleniumFile();
		// uploadFile();
		navigationDemo();

	}

	public static void seleniumFile() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://cosmocode.io/automation-practice/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The No. of Links on the page : " + links.size());

		/*
		 * for(WebElement link:links) {
		 * 
		 * System.out.println(link.getText());
		 * 
		 * }
		 */

		// driver.findElement(By.linkText("About Us")).click();

		// getAttribute funtion

		WebElement ele = driver.findElement(By.id("firstname"));
		String len = ele.getAttribute("maxlength");
		System.out.println("Length of the text box : " + len);

		// to covert string to integer

		if (Integer.parseInt(len) == 30) {
			System.out.println("Length of the text box is validated...");
		}

		// to check whether a particular element is present and enabled
		/*
		 * WebElement element=driver.findElement(By.linkText("Home"));
		 * if(element.isDisplayed() && element.isEnabled()) { element.click();
		 * System.out.println("Home link is clicked"); }
		 */
		
		
		
		// To interact with Dropdown thru Select class
		/*
		 * WebElement ageDrop=driver.findElement(By.name("age")); 
		 * Select ageDropDown=new Select(ageDrop);
		 * 
		 * //ageDropDown.selectByValue("Under 20"); //from value tag
		 * //ageDropDown.selectByIndex(3); // selects according to the index value
		 * ageDropDown.selectByVisibleText("Above 60"); // selects as per the text
		 * visible in dropdown
		 */

		
		
		
		// to interact with dropdown without select class

		List<WebElement> dropList = driver.findElements(By.xpath("//select/option"));
		for (WebElement drop : dropList) {

			String a = "Under 40";
			if (drop.getText().equalsIgnoreCase(a)) {
				drop.click();
			}
		}

		// to interact with checkboxes

		// String boxs="java,python,vbscript";
		// String boxes[]=boxs.split(",");

		String chkboxes[] = { "Java", "C#", "Python" };

		for (String box : chkboxes) {
			if (box.equalsIgnoreCase("java")) {
				driver.findElement(By.name("language_java")).click();
			} else if (box.equalsIgnoreCase("Python")) {
				driver.findElement(By.name("language_python")).click();
			} else if (box.equalsIgnoreCase("C#")) {
				driver.findElement(By.name("language_c#")).click();
			} else if (box.equalsIgnoreCase("c")) {
				driver.findElement(By.name("language_c")).click();
			} else if (box.equalsIgnoreCase("Vbscript")) {
				driver.findElement(By.name("language_vbs")).click();
			}
		}

	}

	// uploading a file thru send keys

	public static void uploadFile() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("photo")).sendKeys("C:/Users/Sudha Basa/Desktop/USA-Map-States-Cities.png");

	}

	public static void navigationDemo() {
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Current title of the page : " + driver.getTitle());
		System.out.println("Current URL of the page : " + driver.getCurrentUrl());

		System.out.println("opening ebay");

		driver.navigate().to("https://selenium.dev");
		System.out.println("opening selenium page");

		driver.navigate().back();
		System.out.println("going back to ebay");

		driver.navigate().forward();
		System.out.println("going forward selenium");

		driver.navigate().refresh();
		System.out.println("refreshing the page");
		System.out.println();
		System.out.println("Current URL page source " + driver.getPageSource());

		/*
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		driver.manage().deleteAllCookies();
		
		driver.close(); //closes the current window
		driver.quit(); //closes all the browser instances
		*/
		
		
		
	}

}
