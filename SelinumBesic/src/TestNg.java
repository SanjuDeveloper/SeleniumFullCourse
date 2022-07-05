import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize(); //Mazimize current window
		Thread.sleep(2000);    //Delay execution for 5 seconds to view the maximize operation	
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		// Using testNG check expected and actual result
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		// <button classs="demo">Log Out</button>
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		// driver.findElement(By.xpath("//button[text()='Log out']")).click();
		driver.close();
		
		
		


	}

}



