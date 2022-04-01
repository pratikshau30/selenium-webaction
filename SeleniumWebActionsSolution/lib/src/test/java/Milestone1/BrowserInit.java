
package Milestone1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserInit {

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
		WebDriver driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		// Create the object of BrowserInit class
		BrowserInit browserInit = new BrowserInit();

		// Call the method startBrowser using object of BrowserInit
		browserInit.startBrowser();

	}
}
