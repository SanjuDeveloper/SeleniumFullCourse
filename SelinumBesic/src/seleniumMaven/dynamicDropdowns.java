package seleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");	
		driver.manage().window().maximize(); //Mazimize current window
		Thread.sleep(2000); 
		driver.manage().window().maximize(); //Mazimize current window
		Thread.sleep(2000); 
		//driver.switchTo().alert().accept();  // for dismis alert
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='GOP'])[2]")).click();
		
		// PARENT-CHILD XPATH
		
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR'] //a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='GOP']")).click();
		
	}

}
