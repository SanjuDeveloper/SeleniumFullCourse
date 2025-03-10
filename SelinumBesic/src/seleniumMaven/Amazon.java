package seleniumMaven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		// Click on every link on amazon footer and get link of each page
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement footer=driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']"));
		int count=footer.findElements(By.tagName("a")).size();
		//System.out.println(count);
		for(int i=1;i<count;i++)
		{
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
		
	}

}
