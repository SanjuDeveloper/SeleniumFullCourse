import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumInteroduction {

	public static void main(String[] args) {
		
		// Invoke Browser  CHROME BROWSER //
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());   // Get title of the current browser
		System.out.println(driver.getCurrentUrl());   // Get current browser url
		//driver.close();  // close only current tab 
		driver.quit(); // close all the tabs opened by selenium
		
		
		// Invoke Browser  CHROME BROWSER //
		
		System.setProperty("webdriver.gecko.driver", "C:\\firefox-exe\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
	}
	
}
