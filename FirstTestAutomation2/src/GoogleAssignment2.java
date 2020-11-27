import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2020-09-R-win32-x86_64\\eclipse\\webDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		element.sendKeys("CodingBook"); 
		element.submit();
		
		driver.findElement(By.xpath("//cite[text()='codingbook.org']")).click();
		
		driver.findElement(By.linkText("Test Automation")).click();
		
		driver.findElement(By.xpath(" "));
		

	}

}
