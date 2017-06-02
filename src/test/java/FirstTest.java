import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		

		WebDriver wd;
		System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		
	
		wd.get("https://www.facebook.com");
		
		WebElement textbox = wd.findElement(By.cssSelector("#email"));
		WebElement passwordbox = wd.findElement(By.cssSelector("#pass"));
		
		textbox.sendKeys("smosqueda@tampabay.com");
		passwordbox.sendKeys("CharJ4mie!");
		
	
		//wd.findElement(By.cssSelector("label#loginbutton.uiButton.uiButtonConfirm")).click();
		//wd.findElement(By.id("loginbutton")).click();
		
		
		
		String title = wd.getTitle();
		System.out.println(title);
		
		String url = wd.getCurrentUrl();
		System.out.println(url);
		
		// Returns text for few elements
		List<WebElement> navButtons  = wd.findElements(By.cssSelector(".mlm._6q._6t._mf"));
		
		for(WebElement button : navButtons) {
			
		System.out.println(button.getText());	
		}
		
		
	
		
		wd.quit();
	}

}
