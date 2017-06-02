package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class Filter_Results {
	
	
	public   WebDriver  wd;
	private String baseUrl_1;
	
	@BeforeClass
	public void setup(){
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 @Test (priority =1 , enabled = true)     // How to find multiple elements and return the name of the element
	 
	  public void Filter_Politifact_By () throws InterruptedException {
		 System.out.println("FF is selected");
		    System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
			wd = new FirefoxDriver();        
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			wd.manage().window().maximize(); 

			
			//wd.get("http://stg.politifact.com/personalities/mike-pence/");
			//wd.get("http://dev.politifact.com/personalities/donald-trump/"); 
			  wd.get("http://dev.politifact.com/personalities/barack-obama/");       
			
			Thread.sleep(5000);
			
			while(true) {
				// Here below xpath will select 8 Element
				List<WebElement> links=wd.findElements(By.xpath(".//*[@id='speaker']//*[@class='statement__source']/a"));
	            // print the total number of elements
				System.out.println("Total element is "+links.size());
	
				// Now using Iterator we will iterate all elements
				Iterator<WebElement> i1=links.iterator();
				
				// this will check whether list has some element or not
				while(i1.hasNext()) {
	
					 // Iterate one by one
					WebElement ele1=i1.next();
			
					// get the text
					String name=ele1.getText();
					// compare the element value
					if(name.compareTo("BARACK OBAMA") == 0) {
						System.out.println("Elements is a match: "+ name);
					} else System.out.println("Element does not match:  "+ name);
					
				}
	            // if first element is present click if not click second 
				Boolean validElement = isElementPresent(wd, By.xpath(".//*[@id='speaker']/footer/p/a"));
				Boolean nextArrow = isElementPresent(wd, By.xpath(".//*[@id='speaker']//a[@class='step-links__next']"));
				// Prints what the element is available (boolean)
				System.out.println("nextArrow is "+ nextArrow);
				if(validElement) {
					wd.findElement(By.xpath(".//*[@id='speaker']/footer/p/a")).click();
				} else if(nextArrow) {
					wd.findElement(By.xpath(".//*[@id='speaker']//a[@class='step-links__next']")).click();
				} else break;
				
				Thread.sleep(5000);
			}
	     }
	
	 
	 @Test (priority =2 , enabled = true)     // How to find multiple elements and return the name of the element
	 
	  public void Filter_Politifact_By1 () throws InterruptedException {
		 System.out.println("FF is selected");
		    System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
			wd = new FirefoxDriver();        
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			wd.manage().window().maximize(); 

			
			//wd.get("http://stg.politifact.com/personalities/mike-pence/");
			//wd.get("http://dev.politifact.com/personalities/donald-trump/"); 
			wd.get("http://stg.politifact.com/personalities/chain-email/"); 
			Thread.sleep(5000);
			
			while(true) {
				// Here below xpath will select 8 Element
				List<WebElement> links=wd.findElements(By.xpath(".//*[@id='speaker']//*[@class='statement__source']/a"));
	            // print the total number of elements
				System.out.println("Total element is "+links.size());
	
				// Now using Iterator we will iterate all elements
				Iterator<WebElement> i1=links.iterator();
				
				// this will check whether list has some element or not
				while(i1.hasNext()) {
	
					 // Iterate one by one
					WebElement ele1=i1.next();
			
					// get the text
					String name=ele1.getText();
					// compare the element value
					if(name.compareTo("CHAIN EMAIL") == 0) {
						System.out.println("Elements is a match: "+ name);
					} else System.out.println("Element does not match:  "+ name);
					
				}
	            // if first element is present click if not click second 
				Boolean validElement = isElementPresent(wd, By.xpath(".//*[@id='speaker']/footer/p/a"));
				Boolean nextArrow = isElementPresent(wd, By.xpath(".//*[@id='speaker']//a[@class='step-links__next']"));
				// Prints what the element is available (boolean)
				System.out.println("nextArrow is "+ nextArrow);
				if(validElement) {
					wd.findElement(By.xpath(".//*[@id='speaker']/footer/p/a")).click();
				} else if(nextArrow) {
					wd.findElement(By.xpath(".//*[@id='speaker']//a[@class='step-links__next']")).click();
				} else break;
				
				Thread.sleep(5000);
			}
	     }
	 
	 @Test (priority =3 , enabled = true)     // How to find multiple elements and return the name of the element
	 
	  public void Filter_Politifact_About () throws InterruptedException {
		 System.out.println("FF is selected");
		    System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
			wd = new FirefoxDriver();        
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			wd.manage().window().maximize(); 

			
			//wd.get("http://stg.politifact.com/personalities/mike-pence/");
			//wd.get("http://dev.politifact.com/personalities/donald-trump/"); 
			//wd.get("http://stg.politifact.com/personalities/chain-email/"); 
			wd.get("http://stg.politifact.com/personalities/barack-obama/"); 
			
			
			wd.findElement(By.linkText("Statements about")).click();
			Thread.sleep(5000);
			
			while(true) {
				// Here below xpath will select 8 Element
				List<WebElement> links=wd.findElements(By.xpath(".//*[@id='involving']//*[@class='statement__source']/a"));
	            // print the total number of elements
				System.out.println("Total element is "+links.size());
	
				// Now using Iterator we will iterate all elements
				Iterator<WebElement> i1=links.iterator();
				
				// this will check whether list has some element or not
				while(i1.hasNext()) {
	
					 // Iterate one by one
					WebElement ele1=i1.next();
			
					// get the text
					String name=ele1.getText();
					// compare the element value
					if(name.compareTo("CHAIN EMAIL") == 0) {
						System.out.println("Elements is a match: "+ name);
					} else System.out.println("Element does not match:  "+ name);
					
				}
	            // if first element is present click if not click second 
				Boolean validElement = isElementPresent(wd, By.xpath(".//*[@id='involving']/footer/p/a"));
				Boolean nextArrow = isElementPresent(wd, By.xpath(".//*[@id='involving']//a[@class='step-links__next']"));
				// Prints what the element is available (boolean)
				System.out.println("nextArrow is "+ nextArrow);
				if(validElement) {
					wd.findElement(By.xpath(".//*[@id='involving']/footer/p/a")).click();
				} else if(nextArrow) {
					wd.findElement(By.xpath(".//*[@id='involving']//a[@class='step-links__next']")).click();
				} else break;
				
				Thread.sleep(5000);
			}
	     }
	 	 
	 
	 
	 
	 
	 public void Trending_Now_TBO_ClickLink(WebElement link) {
		 	System.out.println("Article name : "+ link.getText());
			link.click();
}

	 @AfterClass (enabled = true)
		
		public void teardown (){
			 wd.quit();
			
		}	
// Some functions
 public void print (String text){
	   System.out.println(text);
}
 
public void Add_Politifact(WebElement state) throws InterruptedException {
 	
	    state.getAttribute("id"); 
	 	System.out.println("Ad Attribute name is: "+ state.getAttribute("id"));
	 	Thread.sleep(2000);
		
}	

protected boolean isElementPresent(WebDriver wd, By by){
try{
	   wd.findElement(by);
    return true;
    
}
catch(NoSuchElementException e){
    return false;
   }
  }
}
