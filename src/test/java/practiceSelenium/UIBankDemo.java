package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIBankDemo {

	public static void main(String[] args) throws InterruptedException {
		loginAccount();
		// loanCenter();
	}

	private static void loginAccount() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/welcome/");
		// driver.get("https://uibank.uipath.com/accounts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("sudhab");

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Bank@123");

		WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		signInBtn.click();

		driver.findElement(By.xpath("//button[text()='I agree to the Privacy Policy ']")).click();

		driver.findElement(By.xpath("//strong[text()='sudha']")).click();

		WebElement transferAccount1 = driver.findElement(By.id("transferMoney"));
		transferAccount1.click();

		// first element
		WebElement clickTranferDrop1 = driver.findElement(By.id("fromAccount"));

		Select transferDropDown1 = new Select(clickTranferDrop1);
		transferDropDown1.selectByValue("0: Object");

		// Second element
		WebElement clickTranferDrop2 = driver.findElement(By.id("toAccount"));

		Select clickTransferDrop2 = new Select(clickTranferDrop2);
		clickTransferDrop2.selectByIndex(1);

		// Third element
		WebElement amountField = driver.findElement(By.id("amountTransferred"));
		amountField.sendKeys("10");

		// review button element
		WebElement reviewButton = driver.findElement(By.xpath("//button[text()='Review']"));
		reviewButton.click();

		// Confirm transfer button
		WebElement confirmTransferBtn = driver.findElement(By.xpath("//button[text()='Confirm Transfer ']"));
		confirmTransferBtn.click();

		// or cancel button
		// WebElement cancelBtn=driver.findElement(By.xpath("//button[text()='Cancel']"));
		// cancelBtn.click();

		WebElement successMsg = driver.findElement(By.xpath("//h1[text()='Your transfer was successful!']"));
		System.out.println("The success msg : " + successMsg.getText());

	}

	private static void loanCenter() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/loans");
		// driver.get("https://uibank.uipath.com/accounts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement applyForLoanBtn = driver.findElement(By.xpath("//button[text()='Apply For A Loan']"));
		applyForLoanBtn.click();

		WebElement LoanAppForm = driver.findElement(By.xpath("//h1[text()='Loan application']"));
		System.out.println("We are in Loan Application Form : " + LoanAppForm.getText());

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("sudhabasa8@gmail.com");

		WebElement loanAmtField = driver.findElement(By.name("amount"));
		loanAmtField.sendKeys("1000");

		WebElement loanTermField = driver.findElement(By.id("term"));
		Select termDropDown = new Select(loanTermField);
		termDropDown.selectByValue("5");

		WebElement yearlyIncomeField = driver.findElement(By.name("income"));
		yearlyIncomeField.sendKeys("10000");

		WebElement ageField = driver.findElement(By.name("age"));
		ageField.sendKeys("40");

		try {
			Thread.sleep(9500);
		} catch (Exception e) {
		}
		WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit Loan Application']"));
		submitBtn.click();

	}

}
