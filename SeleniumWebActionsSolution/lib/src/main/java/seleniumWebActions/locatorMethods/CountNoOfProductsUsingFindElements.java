package Milestone3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CountNoOfProductsUsingFindElements {
	
	RemoteWebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
	 * @param browserName
	 */
	public void startBrowser() {

		System.out.println("Setting GeckoDriver.exe:");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

		System.out.println("Creating the object of FirefoxDriver:");
		driver = new FirefoxDriver();
		
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
	public void totalProducts() {
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
		CountNoOfProductsUsingFindElements productCount = new CountNoOfProductsUsingFindElements();
		
		// Call the method startBrowser
		productCount.startBrowser();
		
		//Call the method openURL
		productCount.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		// Call the method totalCountOfLinks  
		productCount.totalProducts();
		
		// Call the method closeBrowser
		productCount.closeBrowser();

	}
}
