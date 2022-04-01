package Milestone3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProductCountUsingFindElementsBy {
	
	RemoteWebDriver driver = null;

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
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {

		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to locate all the products on page
	 * and print the total number of products available.
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
		ProductCountUsingFindElementsBy productCount = new ProductCountUsingFindElementsBy();
		
		// Call the method startBrowser
		productCount.startBrowser();
		
		//Call the method openURL
		productCount.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		// Call the method totalProducts 
		productCount.totalProducts();
		
		// Call the method closeBrowser
		productCount.closeBrowser();

	}
}
