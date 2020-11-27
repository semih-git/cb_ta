import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov1 {
	
	public static void main(String[] args) {
//		XPath in WebDriver: Complete Tutorial
//		https://www.guru99.com/xpath-selenium.html#16
		
	
//				TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\eclipse-java-2020-09-R-win32-x86_64\\eclipse\\webDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.guru99.com/xpath-selenium.html");
			
//			WebElement textElement = driver.findElement(By.xpath("//input[@id='submitEU']"));
//			textElement.click();
//			textElement.sendKeys("Coding Book");
			
//			WebElement courseElement = driver.findElement(By.xpath("//course[@id=\"eu_ta\"]"));
//			WebElement textElement = courseElement.findElement(By.xpath("//input[@type='text']"));
//			textElement.click();
//			textElement.sendKeys("...");
			
			WebElement courseElement = driver.findElement(By.xpath("//course[@id=\"eu_ta\"]"));
			WebElement textElement = courseElement.findElement(By.xpath("//label[starts-with(@id,'message')]"));
			textElement.click();
			textElement.sendKeys("...");
			
			
//			List<WebElement> courseElements = driver.findElements(By.xpath("//course"));
//			for(WebElement courseElement : courseElements) {
//				System.out.println(courseElement.getText());
//			}
			
//			WebElement cloudCourseElement = courseElements.get(1);
//			System.out.println(cloudCourseElement.getText());
			
//			//course[@price < '151' and @date='before']
//			//course[@id='cc']/following::course
//			//course[@id='cc']/following-sibling::course
//			//course[@id='cc']/ancestor::*
//			//course[@id='cc']/parent::*
//			//course[@id='cc']/child::*
//			//course[@id='cc']/descendant::*
//			//course[@id='cc']/preceding::*
//			//course[@id='cc']/preceding::course
//			//course[@id='cc']/name/child::text()
//			//name[contains(text(),'Cloud')]
			
//			//input[@type='submit' and @name='btnLogin']		---> and	
			//*[@type='submit' or @name='btnReset']				---> or	
			//label[starts-with(@id,'message')]					---> Starts-with is a function used for finding the web element 
//									whose attribute value gets changed on refresh or by other dynamic operations on the webpage.
			 
//			td[text()='UserID']			---> The XPath text() : This function is a built-in function of selenium webdriver which is used 
//											to locate elements based on text of a web element.
//			XPath axes methods: These XPath axes methods are used to find the complex or dynamic elements. 
//								Below we will see some of these methods.
			
			//*[@type='text']//following::input[1]  			---> following
			
			//*[text()='Enterprise Testing']//ancestor::div[1]	---> ancestor
			//*[@id='java_technologies']/child::li[1]			---> child
			//*[@type='submit']//preceding::input[1]			---> preceding
			//*[@type='submit']//following-sibling::input		---> following-sibling
			//*[@id='rt-feature']//parent::div[1]				---> parent
			//*[@type='password']//self::input					---> self : One node matching by using "self " axis. 
//																	It always finds only one node as it represents self-element.
			
			//*[@id='rt-feature']//descendant::a[1]				---> descendant : 
					
}

}
