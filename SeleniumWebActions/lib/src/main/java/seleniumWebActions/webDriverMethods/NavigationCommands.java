package seleniumWebActions.webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationCommands {
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

		//TODO - print the current url

	}
	
	/**
	 * use this method to click on forward 
	 * button on browser
	 */
	public void goToNextUrl() {
		// TODO - go to next/forward url

		// TODO - print the current url

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
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO: Create the object of NavigationCommands class
		
		// TODO: Call the method startBrowser
		
		// TODO: Call the method openURL to open
		// https://crio-qkart-frontend-qa.vercel.app/

		// TODO: Call the method navigateToUrl to navigate to
		// https://crio-qkart-frontend-qa.vercel.app/login
		
		// TODO: Call the method backToPreviousUrl 
		
		// TODO: Call the method goToNextUrl 

		// TODO: Call the method refreshPage
		
		// TODO: Call the methods closeBrowser

	}
}
