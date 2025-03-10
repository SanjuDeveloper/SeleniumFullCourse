package seleniumMaven;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:list)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				
			}
		}

	}

}
