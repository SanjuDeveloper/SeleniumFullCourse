package seleniumMaven;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("USD");		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		/*
		dropdown.deselectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		/*dropdown.deselectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.deselectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		
	}

}
