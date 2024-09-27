package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JuiceShop_Register_PageFactory {
	
	public static WebDriver driver=new ChromeDriver();
	
	String URL="https://juice-shop.herokuapp.com/#/register";
	
	@FindBy(xpath="//span[text()='Dismiss']") WebElement dismissBtn;
	@FindBy(id="emailControl") WebElement emailID;
	@FindBy(id="passwordControl" ) WebElement pwd;
	@FindBy(id="repeatPasswordControl") WebElement confirmPwd;
	@FindBy(xpath = "//div[@id='mat-select-value-1']/span") WebElement secQnBox;
	@FindBy(xpath = "//*[@id=\"mat-option-0\"]") WebElement secQn;
	@FindBy(id="securityAnswerControl") WebElement secQnAns;
	
	
	@Test
	public void register() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		
		dismissBtn.click();
		emailID.sendKeys("sudhabasa@gmail.com");
		pwd.sendKeys("abc123");
		confirmPwd.sendKeys("abc123");
		secQnBox.click();
		secQn.click();
		secQnAns.sendKeys("Madhuri");
		
		
		
	
	
	
	}

}
