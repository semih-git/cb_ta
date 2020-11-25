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
		q.submit();
		Thread.sleep(2000);
		
		WebElement cbLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
		cbLink.click();
		Thread.sleep(2000);
		
		WebElement courses = driver.findElement(By.xpath("//li[@id=\"menu-item-6539\"]/a"));
		courses.click();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
