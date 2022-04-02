package Milestone3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		System.out.println("Maximize browser window");
		driver.manage().window().maximize();
		
		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);
	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateWebElements() {
		System.out.println("Locating username text box...");
		WebElement txtUserName = driver.findElementById("username");
		System.out.println("Username text box locator value : "+txtUserName.toString());
		
		System.out.println("Locating password text box...");
		WebElement txtPassWord = driver.findElementById("password");
		System.out.println("Password text box locator value : "+txtPassWord.toString());
		
		System.out.println("Locating login button on page...");
		WebElement btnLogin = driver.findElementByXPath("//button[contains(text(),'Login')]");
		System.out.println("Login button locator value : "+btnLogin.toString());

		driver.findElementsById("");
	}

	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	
	public static void main(String[] args) {
		// Create the object of FindLocators class
		FindLocatorsUsingFindElementBy findLocators = new FindLocatorsUsingFindElementBy();

		//Call the method startBrowser
		findLocators.startBrowser();
		
		//Call the method openURL
		findLocators.openURL("https://crio-qkart-frontend-qa.vercel.app/login");
		
		//Call the method locateWebElements 
		findLocators.locateWebElements();
		
		//Call the method closeBrowser
		findLocators.closeBrowser();

	}
}
