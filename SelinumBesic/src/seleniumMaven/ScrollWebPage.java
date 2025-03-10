package seleniumMaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); // scroll webPage
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500"); // Scroll table inside WebPage
		
		List<WebElement> tdText = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		for(int i=0; i<tdText.size(); i++) {
			// convert string to integer			
			sum =sum + Integer.parseInt(tdText.get(i).getText());
		}
		
		System.out.println(sum);
		
		// split string in 2 part  and trim
		int givenAmount = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(givenAmount,sum); // check if(givenAmout==sum);
		driver.quit();//Close browser
	}

}
