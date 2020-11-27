import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2020-09-R-win32-x86_64\\eclipse\\webDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
		System.out.println("Hello TA");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2020-09-R-win32-x86_64\\eclipse\\webDriver\\geckodriver.exe");
		WebDriver driverr = new FirefoxDriver();
		driverr.get("http://google.com");
		
		WebElement searchText = driver.findElement(By.xpath("//input[@name='q']"));
		searchText.sendKeys("Coding Book");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
		searchButton.click();
	}

}
