package org.cb.ta;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class googleSearchAssigment 
{
    public static void main( String[] args ) throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\laptop\\git\\cb_ta\\tamaven2\\webdrivers\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.google.com");
    	
    	// 1sn = 1000 ms
    	Thread.sleep(1000);
    	
    	WebElement q = driver.findElement(By.xpath("//input[@name='q']"));
    	//WebElement q = driver.findElement(By.cssSelector("input[name='q']"));
    	q.sendKeys("codingbook");
    	Thread.sleep(100);
    	q.submit();  //<input type="button"
    	//q.click(); //<button type="button"
    	
    	Thread.sleep(100);
    	WebElement cbLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
    	cbLink.click();
    	
    	Thread.sleep(5000);
    	
    	//CodingBook.org sitesine ulaştık
    	ArrayList<String> locators = new ArrayList<String>();
    	locators.add("//li[@id='menu-item-6539']/a"); //Course
    	locators.add("//li[@id='menu-item-6538']/a"); //Test Automation
    	locators.add("//div[@id='learn-press-course-tabs']/ul/li[2]/a"); //Curriculum
    	locators.add("//span[contains(text(), 'Basic Test Automation – Assignments')]"); //Basic Test Automation – Assignments
    	locators.add("//a[contains(text(), 'youtube')]"); //Youtube
    	
    	for(String locator : locators) {
    		WebElement elm = driver.findElement(By.xpath(locator));
    		elm.click();
    		Thread.sleep(2000);
    	}
    	
//    	locators.forEach((locator)-> {
//    		WebElement elm = driver.findElement(By.xpath(locator));
//    		elm.click();
//    		try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    	});
    }
}
