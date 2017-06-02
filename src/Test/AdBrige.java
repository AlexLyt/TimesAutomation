package Test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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


public class AdBrige {

	public   WebDriver  wd;
	
	String url1 = "http://politifact.com/arizona/";
    String url2= "http://politifact.com/colorado/";
    String url3= "http://politifact.com/georgia/";
    String url4= "http://politifact.com/iowa/";
    String url5= "http://politifact.com/nevada/";
    String url6= "http://politifact.com/new-york/";
    String url7= "http://politifact.com/ohio/";
    String url8= "http://politifact.com/rhode-island/";
    String url9= "http://politifact.com/virginia/";
    String url10= "http://politifact.com/california/";
    String url11= "http://politifact.com/florida/";
    String url12= "http://politifact.com/illinois/";
    String url13= "http://politifact.com/missouri/";
    String url14= "http://politifact.com/new-hampshire/";
    String url15= "http://politifact.com/north-carolina/";
    String url16= "http://politifact.com/pennsylvania/";
    String url17= "http://politifact.com/texas/";
    String url18= "http://politifact.com/wisconsin/";
	
  
	@BeforeClass
	
	public void set_up () throws InterruptedException {
		print("FF is selected");
	    System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();        
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();   
	}
	
	 @Test ( enabled = false)    
	  public void URL1 () throws InterruptedException {
		 
		    String[] anArray = new String[3];
		    
		    anArray[0] = "http://qa.politifact.com/arizona/";
	        anArray[1] = "http://qa.politifact.com/colorado/";
	        anArray[2] = "http://qa.politifact.com/georgia/";
	       
	        	        
		
			List<String> adSpots = new ArrayList<String>();
			
			adSpots.add(".//*[@id='ldr']");
			adSpots.add(".//div[@id='medrect']");
			adSpots.add(".//div[@id='medrect2']");
			adSpots.add(".//*[@id='ldr2']");
			adSpots.add(".//*[@id='adhesion']");
			adSpots.add(".//*[@id='pencil']");
			adSpots.add(".//*[@id='interstitial']");
			
			wd.get(url1);
			String currentURL = wd.getCurrentUrl();
			print ("Current URL is :" + currentURL);
			List<String> adSpotsFailures = new ArrayList<String>();
			
			for(String adSpot : adSpots) {
				try {
					Add_Politifact( wd.findElement(By.xpath(adSpot)));
				}
				catch (Exception e) {
						print("Cannot Find Ad: " + adSpot + ". Adding it to the Failed List.\n");
						adSpotsFailures.add("adSpot");
				}	
			}
			print("Rerunning failed tests.\n");
			for(String adSpotFailure : adSpotsFailures) {
				try {
					Add_Politifact( wd.findElement(By.xpath(adSpotFailure)));
				}
				catch (Exception e) {
						print("Cannot Find Ad: " + adSpotFailure + ". This Test has failed twice.");
				}	
			}
	 }		
			@Test ( enabled = false)    
			  public void URL2 () throws InterruptedException {
				 
				    String[] anArray = new String[3];
				    
				    anArray[0] = "http://qa.politifact.com/arizona/";
			        anArray[1] = "http://qa.politifact.com/colorado/";
			        anArray[2] = "http://qa.politifact.com/georgia/";
			       
			        	        
				
					List<String> adSpots = new ArrayList<String>();
					
					adSpots.add(".//*[@id='ldr']");
					adSpots.add(".//div[@id='medrect']");
					adSpots.add(".//div[@id='medrect2']");
					adSpots.add(".//*[@id='ldr2']");
					adSpots.add(".//*[@id='adhesion']");
					adSpots.add(".//*[@id='pencil']");
					adSpots.add(".//*[@id='interstitial']");
					
					wd.get(url1);
					String currentURL = wd.getCurrentUrl();
					print ("Current URL is :" + currentURL);
					List<String> adSpotsFailures = new ArrayList<String>();
					
					for( String adSpot : adSpots) {
						
						try {
							Add_Politifact( wd.findElement(By.xpath(adSpot)));
						}
						catch (Exception e) {
								print("Cannot Find Ad: " + adSpot + ". Adding it to the Failed List.\n");
								adSpotsFailures.add("adSpot");
						}	
					}
					print("Rerunning failed tests.\n");
					for(String adSpotFailure : adSpotsFailures) {
						try {
							Add_Politifact( wd.findElement(By.xpath(adSpotFailure)));
						}
						catch (Exception e) {
								print("Cannot Find Ad: " + adSpotFailure + ". This Test has failed twice.");
						}	
					}
					
			}					
			
    @Test ( enabled = true)    
    public void URL4 () throws InterruptedException {

   
    
    String[] listURL = new String[20];
    
    listURL[0] = "http://politifact.com/arizona/";
    listURL[1] = "http://politifact.com/colorado/";
    listURL[2] ="http://politifact.com/georgia/";
    listURL[3] = "http://politifact.com/iowa/";
    listURL[4] = "http://politifact.com/nevada/";
    listURL[5] = "http://politifact.com/new-york/";
    listURL[6] = "http://politifact.com/ohio/";
    listURL[7] = "http://politifact.com/rhode-island/";
    listURL[8] = "http://politifact.com/virginia/";
    listURL[9] = "http://politifact.com/california/";
    listURL[10] = "http://politifact.com/florida/";
    listURL[11] = "http://politifact.com/illinois/";
    listURL[12] = "http://politifact.com/missouri/";
    listURL[13] = "http://politifact.com/new-hampshire/";
    listURL[14] = "http://politifact.com/north-carolina/";
    listURL[15] = "http://politifact.com/pennsylvania/";
    listURL[16] = "http://politifact.com/texas/";
    listURL[17]= "http://politifact.com/iowa/";
    listURL[18]= "http://politifact.com/truth-o-meter/";
    listURL[19]= "http://politifact.com/truth-o-meter/promises/trumpometer/";
    
    String[] adSlots = new String[7];
    
    adSlots[0] = ".//*[@id='ldr']";
    adSlots[1] = ".//div[@id='medrect']";
    adSlots[2] =".//*[@id='ldr2']";
    adSlots[3] = ".//*[@id='adhesion']";
    adSlots[4] = ".//*[@id='pencil']";
    adSlots[5] = ".//*[@id='interstitial']";
    adSlots[6] = ".//div[@id='medrect2']";
    
    // for (String url : listURL)
    {
    for (int i = 0; i < listURL.length; i++){

	print ("Current URL is :" + listURL[i]);
    Thread.sleep(5000);
    wd.get(listURL[i]);
    
    	for(int j = 0; j < adSlots.length; j++) {
    		try {
        		WebElement ad = wd.findElement(By.xpath(adSlots[j]));
        		Add_Politifact(ad);
    		} catch (NoSuchElementException e) {
    			System.out.println(e);
    		}
    	}

    //Add_Politifact(wd.findElement(By.xpath(".//*[@id='ldr']")));
    //Add_Politifact(wd.findElement(By.xpath(".//div[@id='medrect']")));
    //Add_Politifact(wd.findElement(By.xpath(".//*[@id='ldr2']")));
    //Add_Politifact(wd.findElement(By.xpath(".//*[@id='adhesion']")));
    //Add_Politifact(wd.findElement(By.xpath(".//*[@id='pencil']")));
    //Add_Politifact(wd.findElement(By.xpath(".//*[@id='interstitial']")));
    
   
   	
  
    /*
    if_else (wd.findElement(By.xpath(".//*[@id='mc_embed_signup_scroll']/div/h3")));
    
    if_else (wd.findElement(By.xpath(".//div[@id='medrect']")));
    if_else (wd.findElement(By.xpath(".//div[@id='medrect2']")));
    if_else (wd.findElement(By.xpath(".//*[@id='ldr2']")));
    if_else (wd.findElement(By.xpath(".//*[@id='ldr']")));
    
    if_else (wd.findElement(By.xpath(".//*[@id='adhesion']")));
    if_else (wd.findElement(By.xpath(".//*[@id='pencil']")));
    if_else (wd.findElement(By.xpath(".//*[@id='interstitial']")));*/
    
    
             }
    
    
         }
   
    
    }
			

	 
		 @AfterClass
		
		public void teardown (){
			 wd.quit();
			
		}
	// Functions
		 public void Add_Politifact(WebElement state) throws InterruptedException {
		    	
			    state.getAttribute("id"); 
			 	System.out.println("Ad Attribute name is: "+ state.getAttribute("id"));
			 	Thread.sleep(2000);
		 
		 }
		 public void print (String text){
			   System.out.println(text); 
	}
	


	 
	 public void if_else(WebElement ad) {
		 if (ad.isDisplayed())
		    	print(ad.getText() + " Is present ? : Yes");
		    else
		    {
		    	
		    print(ad.getText() + "Is present ? : NO");
} 
		 
}

}	
	
	


