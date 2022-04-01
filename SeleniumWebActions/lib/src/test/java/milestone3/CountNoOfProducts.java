package milestone3;

import org.openqa.selenium.WebDriver;
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
	 * use this method to locate all the products 
	 * on page and print the total number of product listed.
	 */
	public void totalCountOfProducts() {
		int count = 0;
		//TODO: Locate all the links available on web page.
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
		
		// TODO : Call the method LinkCount  
		
		// TODO : Call the method closeBrowser

	}
}
