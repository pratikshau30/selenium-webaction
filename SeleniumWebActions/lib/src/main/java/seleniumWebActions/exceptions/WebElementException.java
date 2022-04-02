package seleniumWebActions.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementException {

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

		System.out.println("Maximize browser window");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateLoginBtn() {
		System.out.println("Locating login button on page");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		
		driver.navigate().refresh();
		loginButton.click();
		
		System.out.println("Locator value : "+loginButton.toString());
	}

	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	
	public static void main(String[] args) {
		// Create the object of WebElementException class
		WebElementException webElementException = new WebElementException();

		//Call the method startBrowser
		webElementException.startBrowser();
		
		//Call the method openURL
		webElementException.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method locateLoginBtn 
		webElementException.locateLoginBtn();
		
		//Call the method closeBrowser
		webElementException.closeBrowser();

	}
}
