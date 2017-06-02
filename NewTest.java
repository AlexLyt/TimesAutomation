import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver wd;
	System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
	wd = new FirefoxDriver();
	
}
	
public static void main(String[] args) {
		

		
		
	
	
	
	
  @Test
  public void f() {
	  
		wd.get("http://dev.politifact.com/truth-o-meter/promises/");
		wd.findElement(By.className(slideshow-facts-item__image-wrapper).getText;
	  
  }
  

  
  
  @AfterTest
  public void afterTest() {
  }

}
