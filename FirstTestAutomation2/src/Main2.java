import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2020-09-R-win32-x86_64\\eclipse\\webDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index3.html");
		
//		WebElement courseElement = driver.findElement(By.xpath("//course[@id='eu_ta']"));
//		
//		WebElement textElement = courseElement.findElement(By.xpath("//input[@type='text']"));
//		
//		textElement.click();
//		textElement.sendKeys("Coding B");
		
		List<WebElement> courseElements = driver.findElements(By.xpath("//course"));
		for(WebElement courseElement : courseElements){
		System.out.println(courseElement.getText());
		}
	}

}
