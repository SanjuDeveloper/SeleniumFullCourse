package seleniumMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Screenshot of Full webPagr
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // get the type of screenshot like type will FILE here.
		//copy file from src to given path
		FileUtils.copyFile(src,new File("D:\\SeleniumScreenshots\\logo.png"));
		
		// Screenshot of specific element
		WebElement element=driver.findElement(By.cssSelector("a.blinkingText"));
		File src1=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("D:\\SeleniumScreenshots\\element.png"));

		

	}

}
