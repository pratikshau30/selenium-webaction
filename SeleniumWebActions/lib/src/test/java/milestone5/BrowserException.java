package milestone5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserException {
	
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
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	public static void main(String[] args) {
		// Create the object of BrowserException class
		BrowserException browserException = new BrowserException();

		//Call the method startBrowser
		browserException.startBrowser();
		
		//Call the method openURL
		browserException.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method closeBrowser
		browserException.closeBrowser();	

	}
}
