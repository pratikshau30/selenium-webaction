package seleniumWebActions.milestone3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindLocatorsUsingFindElementBy {
	
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

		System.out.println("Maximizing window...");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateWebElements() {
		//TODO : Locate the username text box on page
		//TODO : Print the locator
		
		//TODO : Locate the password text box on page
		//TODO : Print the locator
		
		//TODO : Locate the login button on page
		//TODO : Print the locator
	}

	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		// TODO: Close the browser window.
	}
	
	public static void main(String[] args) {
		// TODO : Create the object of FindLocators class

		// TODO : Call the method startBrowser
		
		// TODO : Call the method openURL
		
		// TODO : Call the method locateLoginBtn  
		
		// TODO : Call the method closeBrowser
	}
}
