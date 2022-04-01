package Milestone1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	
	
	
	/**
	 * use this method to initialize the browser.
	 * 
	 * @param browserName
	 */
	public void startBrowser() {

		//set system.setProperty("firefox driver key","path to FirefoxDriver.exe")
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
		
		// Creating the object of fireFoxDriver
		WebDriver driver = new FirefoxDriver();

	}

	public static void main(String[] args) {
		//Create the object of BrowserInit class
		LaunchFireFoxBrowser launchFireFoxBrowser = new LaunchFireFoxBrowser();
		
		//Call the method startBrowser using object of BrowserInit
		launchFireFoxBrowser.startBrowser();
	}
}
