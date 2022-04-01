package Milestone2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		System.out.println("Maximizing window...");
		driver.manage().window().maximize();
		
		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);

	}
	
	/**
	 * use this method to open new url
	 * @param url
	 */
	public void navigateToUrl(String url) {
		System.out.println("Open Url : "+url);
		driver.navigate().to(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url : "+currentUrl);
	}
	
	/**
	 * use this method to click on back 
	 * button on browser
	 */
	public void backToPreviousUrl() {
		driver.navigate().back();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url : "+currentUrl);
	}
	
	/**
	 * use this method to click on forward 
	 * button on browser
	 */
	public void goToNextUrl() {
		driver.navigate().forward();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url : "+currentUrl);
	}
	
	/**
	 * use this method to click on refresh button
	 * on browser
	 */
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) {
		// Create the object of NavigationCommands class
		NavigationCommands navigationCommands = new NavigationCommands();
		
		// Call the method startBrowser
		navigationCommands.startBrowser();
		
		//Call the method openURL
		navigationCommands.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method navigateToUrl 
		navigationCommands.navigateToUrl("https://crio-qkart-frontend-qa.vercel.app/login");
		
		//call the method backToPreviousUrl 
		navigationCommands.backToPreviousUrl();
		
		// Call the method goToNextUrl 
		navigationCommands.goToNextUrl();
		
		// Call the methods closeBrowser
		navigationCommands.closeBrowser();
	}
}
