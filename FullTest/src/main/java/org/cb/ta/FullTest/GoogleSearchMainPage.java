package org.cb.ta.FullTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMainPage {
	
private WebDriver driver;
	
	public GoogleSearchMainPage() {
		System.setProperty("webdriver.chromedriver", "webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	public WebElement getSearchText() {
		return driver.findElement(By.xpath("//input[@name='q']"));
	}


}
