package milestone2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {
	
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
		// TODO: Open Web site “https://crio-qkart-frontend-qa.vercel.app/”
		// TODO: Maximize the browser window.
	}
	
	/**
	 * use this method to print the current 
	 * url of web page.
	 */
	public String getCurrentUrl() {
		String currentUrl = null;
		//TODO : get the current page url
		return currentUrl;
	}
	
	/**
	 * use this method to get the title of a web site 
	 * @return
	 */
	public String getPageTitle() {
		String title = null;
		// TODO: get the title of web site.
		return title;
	}
	/**
	 * use this method to get page source of current web page 
	 * @return
	 */
	public void getPageSource() {
		String pageSource = null;
		// TODO : get the page source of current web page.
		// TODO : Check "You need to enable JavaScript to run this app." present in page source.
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		// TODO: Close the browser window.
	}

	public static void main(String[] args) {
		// TODO : Create the object of BrowserActions class

		// TODO : Call the method startBrowser
		
		// TODO : Call the method openURL
		
		// TODO : Call the method getCurrentUrl and print the current url
		
		// TODO : call the method getPageSource.
		
		// TODO : Call the method getPageTitle and print the title  
		
		// TODO : Call the methods closeBrowser

	}
}
