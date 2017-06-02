

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
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


public class ScreenShots {

	public   WebDriver  wd;
	
	
	@BeforeClass
	public void setup(){
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		         
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();     
	}
	
	 @Test ( enabled = true)    
	  public void ScreenShot_external_file () throws InterruptedException {
		 
		BufferedReader br = null;
		FileReader fr = null;
	
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/alytvynenko/Desktop/RackCDN/RackCDN-URLS.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				
				wd.get(sCurrentLine);
				Thread.sleep(1000);
				
				File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				try {
			
				 int index = sCurrentLine.lastIndexOf('/');
				 int ext = sCurrentLine.lastIndexOf('.');
				 String filename1 = sCurrentLine.substring(index, ext) + "-rackcdn.jpg";
				
				FileUtils.copyFile(src, new File ("C:/Users/alytvynenko/Desktop/RackCDN/assets/" + filename1));
				}
				 
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 
				 }
				
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		try {

			
			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/alytvynenko/Desktop/RackCDN/RackCDN-URLS2.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				
				wd.get(sCurrentLine);
				Thread.sleep(1000);
				
				File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				try {
				
				 int index = sCurrentLine.lastIndexOf('/');
				 int ext = sCurrentLine.lastIndexOf('.');
				 String filename1 = sCurrentLine.substring(index, ext) + "-tbo.jpg";
				
				FileUtils.copyFile(src, new File ("C:/Users/alytvynenko/Desktop/RackCDN/assets/" + filename1));
				}
				 
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 
				 }
				/*
				wd.get("http://www.tbo.com/assets/pdf/TB259412.PDF");
				Thread.sleep(1000);
				
				File src1= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				try {
				 String fileName1 = new SimpleDateFormat("2) yyyy.MM.dd.hh.mm'.txt'").format(new Date()); ;
				
				FileUtils.copyFile(src1, new File ("C://Users//alytvynenko//Desktop//RackCDN//" + fileName1  + ".png"));
				}
				 
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 
				 }
				 */
				//End Alex Code
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		
		 }
	 
		 @AfterClass
		
		public void teardown (){
			 wd.quit();
			
		}
	
	
	}
	


	
	
	

