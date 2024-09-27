package practiceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
	
	
	public static void switchWindow() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println("First Window Handle is : "+firstWindowHandle);
		
		WebElement secondLink=driver.findElement(By.linkText("Click Me to open New Window"));
		secondLink.click(); //will open second link
		
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println("Handles set 1 : "+windows);
		
		String secondWindowHandle=null;
		
		for(String win:windows) {
			
			String title=driver.getTitle();
			
			if(title.contains("2nd window")) {
				System.out.println("I switched to 2nd window");
				System.out.println("The 2nd window handle is : "+win);
				secondWindowHandle=win;
				break;
				
				
			}
			else {
				System.out.println("You are not in the correct window");
				System.out.println("This window handle is : "+win);
				continue;
			}
			
		}
		
		
		driver.switchTo().window(firstWindowHandle);
		driver.close();
		
		
	}

	public static void main(String[] args) {

		
		switchWindow();
		
		
		
	}

}
