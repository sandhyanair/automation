package seleniumproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AmazonHPTest {
	
	WebDriver driver;
	
	 @Test

	 
	 public void openBrowser(){
		 
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			
			
			 AmazonTest hp = new AmazonTest();
			
			
			 String actual = hp.getPageTitle();
			 
			 Assert.assertTrue(actual.contains("Amazon.com"));
			 
			
        }
}