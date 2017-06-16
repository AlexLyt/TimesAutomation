package Test;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class NewTest {

	public WebDriver wd;
	private String baseUrl_1;

	@BeforeClass
	public void setup() {

		// System.setProperty("webdriver.gecko.driver",
		// "C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		// wd = new FirefoxDriver();

		// wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// wd.manage().window().maximize();
	}

	@Test(enabled = false)
	// NDN videos have been replaced with Fun Facts
	public void Fun_Facts_Mugshots_FF() throws InterruptedException {

		print("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wd.manage().window().maximize();

		wd.get("http://webdev.tampabay.com/mugshots/");

		if (!wd.findElements(By.cssSelector(".slideshow-facts-item__image.unselectDrag")).isEmpty())
				
				 {
			// THEN CLICK ON THE SUBMIT BUTTON
			for (int i = 0; i < 10; i++) {

				WebElement button = wd.findElement(By.xpath("//div[@class='cbola-slideshow-facts__btn cbola-slideshow-facts__next-btn']"));
						
								
				button.click();
				Thread.sleep(2000);
			}
		} else {
			// DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE

			print("There was an error finding the element.");
		}

	}

	@Test(enabled = false)
	// NDN videos have been replaced with Fun Facts
	public void Fun_Facts_Mugshots_Chrome() throws InterruptedException {

		System.out.println("Chrome is selected");
		System.setProperty(
				"webdriver.chrome.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		wd.get("http://www.tampabay.com/mugshots/");

		if (!wd.findElements(
				By.cssSelector(".slideshow-facts-item__image.unselectDrag"))
				.isEmpty()) {
			// THEN CLICK ON THE SUBMIT BUTTON
			for (int i = 0; i < 10; i++) {

				WebElement button = wd
						.findElement(By
								.cssSelector(".cbola-slideshow-facts__btn.cbola-slideshow-facts__next-btn"));
				button.click();
			}
		} else {
			// DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE

			System.out.println("There was an error finding the element.");
		}

	}

	@Test(priority = 1, enabled = false)
	// Politifact membership tracking Google
	public void Membership_Tracking_FF() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		// Loop
		for (int i = 0; i < 100; i++) {
			wd.get("http://membership.politifact.com/");
			Thread.sleep(2000);

		}

	}

	@Test(priority = 2, enabled = false)
	// Politifact membership tracking
	public void Membership_Tracking_Chrome() throws InterruptedException {
		System.out.println("Chrome is selected");
		System.setProperty(
				"webdriver.chrome.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		// Loop
		for (int i = 0; i < 100; i++) {
			wd.get("http://membership.politifact.com/");
			Thread.sleep(2000);

		}

	}

	@Test(priority = 3, enabled = false)
	// Politifact membership tracking GA
	public void Membership_Tracking_IE() throws InterruptedException {
		System.out.println("Internet Explorer is selected");
		System.setProperty(
				"webdriver.ie.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//SeleniumDrivers//IEDriverServer_x64_3.3.0//IEDriverServer.exe");
		wd = new InternetExplorerDriver();
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		// Loop
		for (int i = 0; i < 100; i++) {
			wd.get("http://membership.politifact.com/");
			Thread.sleep(2000);

		}

	}

	@Test(priority = 1, enabled = false)
	// Things-To-Do search
	public void Things_To_Do_search_FF() throws InterruptedException {

		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		for (int i = 0; i < 10; i++) {

			wd.get("http://tampabay.com/things-to-do/");

			WebElement searchbox = wd.findElement(By.id("ttdSearchKeyword"));
			searchbox.sendKeys("News");
			searchbox.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			String text = wd.findElement(By.cssSelector(".mark")).getText();

			System.out.println("Search returned :'" + text + "'.");

			Thread.sleep(2000);

		}
	}

	@Test(priority = 1, enabled = false)
	// Things-To-Do search
	public void Things_To_Do_search_FF_Array() throws InterruptedException {

		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		{
			// declares an array of integers
			String[] anArray = new String[5];
			String[] searchCategories = new String[5];
			// allocates memory for 5 integers
			anArray = new String[5];

			// initialize the elements
			anArray[0] = "Attractions_QATest";
			anArray[1] = "news_QATest";
			anArray[2] = "Tampa_QATest";
			anArray[3] = "Movies_QATest";
			anArray[4] = "Events_QATest";

			searchCategories[0] = "allEvents";
			searchCategories[1] = "movies";
			searchCategories[2] = "attractions";
			searchCategories[3] = "restaurants";
			searchCategories[4] = "bars";

			Random rand = new Random();

			for (int i = 0; i < 150; i++) {

				int randomType = rand.nextInt(5);
				int randomCategory = rand.nextInt(5);

				wd.get("http://tampabay.com/things-to-do/search/?contentType="
						+ searchCategories[randomCategory] + "&q="
						+ anArray[randomType]);

				// WebElement searchbox =
				// wd.findElement(By.id("ttdSearchKeyword"));
				// searchbox.sendKeys(anArray[randomType]);
				// searchbox.sendKeys(Keys.RETURN);
				Thread.sleep(3000);
				String text = wd.findElement(By.cssSelector(".mark")).getText();

				System.out.println("Search for returned :'"
						+ searchCategories[randomCategory] + " " + text + "'.");

				Thread.sleep(2000);

			}
		}
	}

	@Test(priority = 1, enabled = false)
	// Things-To-Do search
	public void Things_To_Do_search_FF_events_daterange()
			throws InterruptedException {

		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		{
			// declares an array of integers
			String[] anArray = new String[5];
			String[] dateRanges = new String[5];
			// allocates memory for 5 integers
			anArray = new String[5];

			// initialize the elements
			anArray[0] = "AttractionsQATest";
			anArray[1] = "news";
			anArray[2] = "Tampa";
			anArray[3] = "Movies";
			anArray[4] = "Events";

			dateRanges[0] = "startDate=2017-05-12&endDate=2017-05-12"; // today
			dateRanges[1] = "startDate=2017-05-13&endDate=2017-05-13"; // tomorrow

			Random rand = new Random();

			for (int i = 0; i < 20; i++) {

				int randomType = rand.nextInt(5);
				int randomDate = rand.nextInt(2);

				wd.get("http://www.tampabay.com/things-to-do/search/?contentType=events&q="
						+ anArray[randomType] + "&" + dateRanges[randomDate]);

				// WebElement searchbox =
				// wd.findElement(By.id("ttdSearchKeyword"));
				// searchbox.sendKeys(anArray[randomType]);
				// searchbox.sendKeys(Keys.RETURN);
				Thread.sleep(3000);
				String text = wd.findElement(By.cssSelector(".mark")).getText();
				String selectedDate = wd.findElement(
						By.cssSelector("ul.editorial > li.active > a"))
						.getAttribute("id");
				System.out.println("Search for returned : '" + text + " "
						+ selectedDate + "'.");
				// System.out.println("Searched date: " + selectedDate);

				Thread.sleep(2000);

			}
		}
	}

	@Test(priority = 2, enabled = false)
	// Things-To-Do search
	public void Things_To_Do_search_FF_events_Base()
			throws InterruptedException {

		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		{
			// declares an array of integers
			String[] anArray = new String[5];
			String[] dateRanges = new String[2];

			// allocates memory for 5 integers
			anArray = new String[5];

			// initialize the elements
			anArray[0] = "AttractionsQATest";
			anArray[1] = "news";
			anArray[2] = "Tampa";
			anArray[3] = "Movies";
			anArray[4] = "Events";

			dateRanges[0] = "startDate=2017-05-01&endDate=2017-05-01"; // today
			dateRanges[1] = "startDate=2017-05-02&endDate=2017-05-02"; // tomorrow

			Random rand = new Random();

			for (int i = 0; i < 20; i++) {

				int randomType = rand.nextInt(5);
				int randomDate = rand.nextInt(2);

				wd.get("http://livesite-qa-2.tampabay.com/things-to-do/search/?contentType=events&q="
						+ anArray[randomType] + "&" + dateRanges[randomDate]); // creating
																				// the
																				// string
																				// for
																				// query

				WebElement searchbox = wd
						.findElement(By.id("ttdSearchKeyword"));
				// searchbox.sendKeys(anArray[randomType]);
				searchbox.sendKeys(Keys.RETURN);
				Thread.sleep(3000);
				String text = wd.findElement(By.cssSelector(".mark")).getText();
				System.out.println("Search for returned : '" + text + "'.");

				Thread.sleep(2000);

			}
		}
	}

	@Test(priority = 1, enabled = false)
	// TBO Trending_Now tracking Google (right rail)
	public void Trending_Now_TBO_Tracking_FF() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		baseUrl_1 = "http://ttt-tbdev.newscyclecloud.com/";

		// Loop
		for (int i = 0; i < 10; i++) {

			wd.get(baseUrl_1);

			Trending_Now_TBO_ClickLink(wd
					.findElement(By
							.xpath("//div[@id='tbo-rightrailcontainer']//div[starts-with(@class,'right-rail-text')][1]/a")));
			Thread.sleep(2000);
			wd.get(baseUrl_1);
			Trending_Now_TBO_ClickLink(wd
					.findElement(By
							.xpath("//div[@id='tbo-rightrailcontainer']//div[starts-with(@class,'right-rail-text')][2]/a")));
			Thread.sleep(2000);
			wd.get(baseUrl_1);
			Trending_Now_TBO_ClickLink(wd
					.findElement(By
							.xpath("//div[@id='tbo-rightrailcontainer']//div[starts-with(@class,'right-rail-text')][3]/a")));
			Thread.sleep(2000);
			wd.get(baseUrl_1);
			Trending_Now_TBO_ClickLink(wd
					.findElement(By
							.xpath("//div[@id='tbo-rightrailcontainer']//div[starts-with(@class,'right-rail-text')][4]/a")));
			Thread.sleep(2000);
			wd.get(baseUrl_1);
			Trending_Now_TBO_ClickLink(wd
					.findElement(By
							.xpath("//div[@id='tbo-rightrailcontainer']//div[starts-with(@class,'right-rail-text')][5]/a")));
			Thread.sleep(2000);
		}

	}

	@Test(priority = 1, enabled = false)
	// TBO Trending_Now tracking Google footer
	public void Trending_Now_TBO_footer_Tracking_FF()
			throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		String url = "http://ttt-tbdev.newscyclecloud.com/news/weather/forecast-heat-humidity-start-to-spike-across-tampa-bay-with-little-chance/2321765";
		String url1 = "http://ttt-tbdev.newscyclecloud.com/blogs/lightning/nikita-kucherov-with-harsh-words-for-lightning/2321702";
		String url2 = "http://ttt-tbdev.newscyclecloud.com/opinion/columns/lemieux-crumbling-venezuela-needs-help/2321841";
		String url3 = "http://ttt-tbdev.newscyclecloud.com/sports/rays-off-thursday-up-next--at-blue-jays--friday-20170427/";
		String url4 = "http://ttt-tbdev.newscyclecloud.com/events-tampa-bay/events-sarah-gerard-to-discuss-sign-sunshine-state-essays-20170427/";

		for (int i = 0; i < 1; i++) {
			wd.get(url);
			WebElement line1 = wd
					.findElement(By
							.xpath("//*[@id='tbo-mostread-container']/div[2]/div[1]/a"));
			String string1 = line1.getText();
			line1.click();
			System.out.println("Article name : " + string1);

			Thread.sleep(2000);

			wd.get(url1);
			WebElement line2 = wd
					.findElement(By
							.xpath("//*[@id='tbo-mostread-container']/div[2]/div[2]/a"));
			String string2 = line2.getText();
			line2.click();
			System.out.println("Article name : " + string2);

			Thread.sleep(2000);

			wd.get(url2);
			WebElement line3 = wd
					.findElement(By
							.xpath("//*[@id='tbo-mostread-container']/div[2]/div[3]/a"));
			String string3 = line3.getText();
			line3.click();
			System.out.println("Article name : " + string3);

			Thread.sleep(2000);

			wd.get(url3);
			WebElement line4 = wd
					.findElement(By
							.xpath("//*[@id='tbo-mostread-container']/div[2]/div[4]/a"));
			String string4 = line4.getText();
			line4.click();
			System.out.println("Article name : " + string4);

			Thread.sleep(2000);

			wd.get(url4);
			WebElement line5 = wd
					.findElement(By
							.xpath("//*[@id='tbo-mostread-container']/div[2]/div[5]/a"));
			String string5 = line5.getText();
			line5.click();
			System.out.println("Article name : " + string5);

			Thread.sleep(2000);

		}

	}

	@Test(priority = 1, enabled = false)
	// Most_shared_Times tracking Google Analytics
	public void Most_Shaed_Tracking_FF() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		String url = "http://livesite-qa-2.tampabay.com/";

		for (int i = 0; i < 22; i++) {
			wd.get(url);
			WebElement line1 = wd.findElement(By
					.xpath(".//div[@class='articleList mostEmailed']//h3/a"));
			String string1 = line1.getText();
			line1.click();
			System.out.println("Article name : " + string1);

			Thread.sleep(2000);

		}

	}

	@Test(priority = 1, enabled = false)
	// Weather_Times tracking Google Analytics
	public void Weather_Tracking_FF() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		String url = "http://ttt-tbdev.newscyclecloud.com/weather/";

		for (int i = 0; i < 10; i++) {

			wd.get(url);
			// WebElement line1 =
			// wd.findElement(By.xpath("//*[@id='tabWeatherHolder']/div/button[1]"));

			WebElement line1 = wd.findElement(By
					.xpath("//*[@id='tabWeatherHolder']/div[1]/button[2]"));
			String string1 = line1.getText();
			line1.click();
			System.out.println("Tab name is : " + string1);

			WebElement line2 = wd.findElement(By
					.xpath(".//*[@id='tabWeatherHolder']/div[1]/button[1]"));

			String string2 = line2.getText();
			line1.click();
			System.out.println("Tab name is : " + string2);

			Thread.sleep(2000);

		}

	}

	@Test(priority = 1, enabled = false)
	// Politifact load time QA
	public void Politifact_loadTime_QA() throws InterruptedException {
		System.out.println("Chrome is selected");
		System.setProperty(
				"webdriver.chrome.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		long start = System.currentTimeMillis();

		wd.get("http://qa.politifact.com/truth-o-meter/");

		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load QA :- " + totalTime
				+ "mls");

	}

	@Test(enabled = false)
	// Test data. Could be changed
	public void Fun_Facts2() throws InterruptedException {

		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd.get("http://webdev.tampabay.com/mugshots/");

		while (true) {
			WebElement button = null;
			try {
				button = wd
						.findElement(By
								.cssSelector(".slideshow-facts-item__image.unselectDrag"));
			} catch (NoSuchElementException e) {
				System.out.println("button is missing, exit the loop");
				break; // button is missing, exit the loop
			}
			if (button.isDisplayed() == false) {
				System.out.println("button is hidden, exit the loop");
				break; // button is hidden, exit the loop
			}

		}
	}

	@Test(priority = 1, enabled = true)
	// Politifact load time QA Is not ready. Could be changed
	public void WordPress_Login() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		wd.get("https://www.google.com/");
		// Open new tab
		wd.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		wd.get("https://en-gb.facebook.com/login/");

		boolean elementExists = isElementPresent(wd,
				By.xpath(".//*[@id='loginbutto']"));

		for (int i = 0; i < 3; i++) {

			if (elementExists) {
				System.out.println(" yes");
				break;

			} else

				System.out.println(" no");

			/*
			 * wd.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
			 * wd.get("http://10.140.3.136/politifact-login/");
			 * 
			 * wd.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("QA_Test"
			 * ); Thread.sleep(2000);
			 * wd.findElement(By.xpath(".//*[@id='user_pass']"
			 * )).sendKeys("QA_Test_12345"); Thread.sleep(2000);
			 * wd.findElement(By.xpath(".//*[@id='wp-submit']")).click();
			 */
			Thread.sleep(5000);

		}

	}

	@Test(priority = 1, enabled = false)
	// Politifact load time QA Is not ready. Could be changed
	public void Login() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		wd.get("https://www.google.com/");
		// Open new tab
		wd.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		wd.get("https://en-gb.facebook.com/login/");

		for (int i = 0; i < 3; i++) {

			if (!wd.findElements(By.xpath(".//*[@id='loginbutto']")).isEmpty()) {

				print("No problem to  find the element.");

			} else {

				print("There was an error finding the element.");

			}

		}
	}

	@Test(priority = 1, enabled = false)
	// How to find multiple elements and return the name of the element
	public void Filter_Politifact() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty(
				"webdriver.gecko.driver",
				"C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		wd.get("http://stg.politifact.com/personalities/mike-pence/");
		// wd.get("http://dev.politifact.com/personalities/donald-trump/");
		Thread.sleep(5000);

		while (true) {
			// Here below xpath will select 8 Element
			List<WebElement> links = wd
					.findElements(By
							.xpath(".//*[@id='speaker']//*[@class='statement__source']/a"));
			// print the total number of elements
			System.out.println("Total element is " + links.size());

			// Now using Iterator we will iterate all elements
			Iterator<WebElement> i1 = links.iterator();

			// this will check whether list has some element or not
			while (i1.hasNext()) {

				// Iterate one by one
				WebElement ele1 = i1.next();

				// get the text
				String name = ele1.getText();
				// compare the element value
				if (name.compareTo("DONALD TRUMP") == 0) {
					System.out.println("Elements is a match: " + name);
				} else
					System.out.println("Element does not match:  " + name);

			}
			// if first element is present click if not click second
			Boolean validElement = isElementPresent(wd,
					By.xpath(".//*[@id='speaker']/footer/p/a"));
			Boolean nextArrow = isElementPresent(
					wd,
					By.xpath(".//*[@id='speaker']//a[@class='step-links__next']"));
			// Prints what the element is available (boolean)
			System.out.println("nextArrow is " + nextArrow);
			if (validElement) {
				wd.findElement(By.xpath(".//*[@id='speaker']/footer/p/a"))
						.click();
			} else if (nextArrow) {
				wd.findElement(
						By.xpath(".//*[@id='speaker']//a[@class='step-links__next']"))
						.click();
			} else
				break;

			Thread.sleep(5000);
		}
	}

	@Test(priority = 1, enabled = true)
	// TBO Mugshots GA
	public void TBO_Mugshots() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty("webdriver.gecko.driver","C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");	
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		// Print out loop value from outside of the Loop
		int i;
		for (i = 0; i < 2; i++) {
			wd.get("http://webdev.tampabay.com/mugshots/");
			Thread.sleep(2000);
			
		}
		print( i + " Loops Have been executed "); 
	}
	
	
	@Test(priority = 1, enabled = true)
	// TBO Mugshots GA
	// TODO
	public void Loop_Test() throws InterruptedException {
		System.out.println("FF is selected");
		System.setProperty("webdriver.gecko.driver","C://Users//alytvynenko//Desktop//QA//Selenium//Settings//geckodriver-v0.13.0-win64//geckodriver.exe");	
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		// Print out loop value from outside of the Loop
		wd.get("http://webdev.tampabay.com/mugshots/");
		
		WebElement line1 = wd.findElement(By.cssSelector("#qwefewf"));
				
		
		int i;
		for (i = 0; i < 3; i++) {
			if (line1 != null){
				try {
				line1.click();
				System.out.println("Cliked");
				break;
				} catch (NoSuchElementException e){
					System.out.println("No element found");
				}
			}	
			else{
			}
			
		}
		print( i + " Loops Have been executed "); 
	}

	@Test(priority = 1, enabled = false)
	// Study test
	public void loadPage() {

		wd.get("https://www.facebook.com");

		// Create the object
		String actual = wd.getTitle();
		// Print the title
		System.out.println(actual);

		// Create the object

		String expected = "Facebook - Log In or Sign Up";
		// Compare two objects

		if (actual.equals(expected)) {

			System.out.println("Test pass");

		} else {

			System.out.println("Test failed");
		}

	}

	@Test(enabled = false)
	public void navigationBackExample() {

		String URL = "http://www.facebook.com";
		wd.navigate().to(URL);
		wd.findElement(By.linkText("Forgot account?")).click();
		wd.get("https://www.google.com/maps");
		wd.navigate().back();

	}

	@AfterClass(enabled = true)
	public void teardown() {
		wd.quit();

	}

	// Some Functions

	public void Trending_Now_TBO_ClickLink(WebElement link) {
		System.out.println("Article name : " + link.getText());
		link.click();
	}

	public void print(String text) {
		System.out.println(text);
	}

	public void Add_Politifact(WebElement state) throws InterruptedException {

		state.getAttribute("id");
		System.out.println("Ad Attribute name is: " + state.getAttribute("id"));
		Thread.sleep(2000);

	}

	protected boolean isElementPresent(WebDriver wd, By by) {
		try {
			wd.findElement(by);
			return true;

		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
