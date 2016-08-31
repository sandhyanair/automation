package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver = new  FirefoxDriver();
	     
	     driver.get("https://www.amazon.com/");
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
	     driver.findElement(By.xpath("//input[@value='Go']")).click();

	}

	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
