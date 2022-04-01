package milestone2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {
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

		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("Maximizing window...");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to open new url
	 * @param url
	 */
	public void navigateToUrl(String url) {
		// TODO - open the url in browser using to()
		// TODO - print the cureent url
	}
	
	/**
	 * use this method to click on back 
	 * button on browser
	 */
	public void backToPreviousUrl() {
		
		//TODO - go back to previous url
		//TODO - print the current url.
	}
	
	/**
	 * use this method to click on forward 
	 * button on browser
	 */
	public void goToNextUrl() {
		// TODO - go to next/forward url
		// TODO - print the current url.
	}
	
	/**
	 * use this method to click on refresh button
	 * on browser
	 */
	public void refreshPage() {
		//TODO - refresh the web page
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) {
		// TODO : Create the object of NavigationCommands class

		// TODO : Call the method startBrowser
		
		// TODO : Call the method openURL
		
		// TODO : Call the method navigateToUrl 
		
		// TODO : call the method backToPreviousUrl 
		
		// TODO : Call the method goToNextUrl 
		
		// TODO : Call the methods closeBrowser

	}
}
