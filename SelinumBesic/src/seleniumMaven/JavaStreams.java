package seleniumMaven;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column   // <th> m click kr k short kiya table ko phle
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list  [sare ,<td> ko get kr liya  // jo sort krne k bad aaye h
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webelements into new(original) list  // ab get kiye gye <td> ka text get kr liya .
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list of step 3 -> sorted list   // ab us text ko  mne sort() function ka use kr short kr liya
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list  // check kiya ki <th>se short krne k bad or short() function se short krne k bad data same h ya ni 
		Assert.assertTrue(originalList.equals(sortedList));

		List<Object> price;

		// scan the name column with getText ->Beans->print the price of the Rice
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice"))
					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		} while (price.size() < 1);
	}

	private static Object getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
