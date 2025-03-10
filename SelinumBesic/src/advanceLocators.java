import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Sibling Locators    // PARENT TO CHIELD
		//<div><button class=class">Home</button><button class="class">Practice</button><button class="class">Login</button></div>
		

		java.lang.String  Text = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(Text); // OUTPUT = Login

		// CHIELD TO PARENT
		java.lang.String  Text1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(Text1); // OUTPUT = Login
		
	}

}
