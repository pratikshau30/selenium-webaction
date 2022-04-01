package Milestone3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfProducts {
	
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
	 * @param browserName
	 */
	public void startBrowser() {

		// Telling the system where to find the GeckoDriver.exe
		System.out.println("Setting ChromeDriver.exe:");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		// Creating the object of FirefoxDriver
		System.out.println("Creating the object of ChromeDriver : ");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {
		System.out.println("");
		driver.manage().window().maximize();
		
		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);
	}
	
	/**
	 * use this method to locate all the links on page
	 * and print the total number of links available.
	 * 
	 */
	public void totalCountOfLinks() {
		int count = 0;
		System.out.println("Locating all the products available on page.");
		List<WebElement> totalProducts = driver.findElements(By.xpath("//div[contains(@Class,'MuiGrid-root MuiGrid-item')]//child::img"));
		count = totalProducts.size();
		System.out.println("Total numbers of products available : " +count);
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		// Create the object of LinkCount class
		CountNoOfProducts productCount = new CountNoOfProducts();
		
		// Call the method startBrowser
		productCount.startBrowser();
		
		//Call the method openURL
		productCount.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		// Call the method totalCountOfLinks  
		productCount.totalCountOfLinks();
		
		// Call the method closeBrowser
		productCount.closeBrowser();

	}
}
