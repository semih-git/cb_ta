package org.cb.ta.FullTest;



import org.junit.Test;
import org.openqa.selenium.WebElement;


public class GoogleSearchTest {
    
    @Test
    public void gotoGoogleAndEnterSearchText() throws InterruptedException {
    	
        GoogleSearchMainPage googleSearchMainPage = new GoogleSearchMainPage();
      
        WebElement searchTextField = googleSearchMainPage.getSearchText();
        searchTextField.sendKeys("codingbook");
        Thread.sleep(2000);
        searchTextField.submit();
        
        System.out.println("***" );
    }
}
