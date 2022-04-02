package seleniumWebActions.exceptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserException {
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
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
	public static void main(String[] args) throws MalformedURLException {
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
