package milestone3;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProductCountUsingFindElementsBy {
	
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
		//TODO: Locate all the products available on web page.
		//TODO: Print the count.
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		// TODO: Close the browser window.
	}
	
	public static void main(String[] args) {
		
		// TODO : Create the object of LinkCount class

		// TODO : Call the method startBrowser
		
		// TODO : Call the method openURL
		
		// TODO : Call the method totalProducts  
		
		// TODO : Call the method closeBrowser

	}
}
