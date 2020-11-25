package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laptop\\git\\cb_ta\\tamaven2\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement q = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		q.sendKeys("codingbook");
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
