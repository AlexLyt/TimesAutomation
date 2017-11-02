package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object_Classes.FacebookMainPage;

import com.testNGdata.DataFile;

public class Login_Test {

	public WebDriver  wd;
	FacebookMainPage fbMainPage;
	
	@BeforeClass
	public void setup(){
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		fbMainPage = new FacebookMainPage(wd);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterClass
	
	public void teardown (){
		// wd.quit();
		
	}
	
	 @Test(enabled = true, dataProvider = "pages", dataProviderClass = DataFile.class)
	public void loadPage(String url, String title) {
		
		wd.get(url);
		Assert.assertEquals(wd.getTitle(), title);
			
		
	}
	
	@Test // (dependsOnMethods="loadPage")
	
	public void filloutEmailFild() throws InterruptedException{
		
		wd.get(FacebookMainPage.Page_URL);
		
				
		WebElement loginButton = (new WebDriverWait(wd, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton")));
		
		WebElement textbox = wd.findElement(By.cssSelector("#email"));
		WebElement passwordbox = wd.findElement(By.cssSelector("#pass"));
		
		textbox.sendKeys("smosqueda@tampabay.com");
		passwordbox.sendKeys("CharJ4mie!");
		
		Assert.assertEquals(textbox.getAttribute("value"), "smosqueda@tampabay.com");
		
		//wd.findElement(By.id("loginbutton")).click();
		loginButton.click();
		// wd.findElement(By.id("navItem_4748854339")).click();
		wd.findElement(By.className("_5afe")).click();
		
	}
	

}
	
	
	

