package Page_Object_Classes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FacebookMainPage {
	
	// Page Object Class
	public static final String Page_Titel ="Facebook - Log In or Sign Up";
	public static final String Page_URL ="https://www.facebook.com";
	
	// Elements on the page
	String field_Email = "#email";
	String field_Password="#pass";
	
	// Creating constructor
	
    WebDriver wd;
    
    
    public FacebookMainPage(WebDriver wd){
    	
    	
    	
    this.wd = wd;
    }
    // Actions
    public void setText_EmailLogin(String text){
    	
    	WebElement element = wd.findElement(By.cssSelector("field_Email"));
		element.sendKeys(text);
		Assert.assertEquals(element.getAttribute("value"), text);
    }
    // Actions
   public void setText_Password(String text){
    
		WebElement element = wd.findElement(By.cssSelector("field_Password"));
		element.sendKeys(text);
		Assert.assertEquals(element.getAttribute("value"), text);
    }
}
