package milestone5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverException {

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
		System.out.println("Maximize browser window");
		driver.manage().window().maximize();
		
		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);

	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateLoginBtn() {
		try {
			System.out.println("Locating login button on page");
			WebElement loginButton = driver.findElement(By.xpath("//button[text()='Logi']"));
			System.out.println("Locator value : "+loginButton.toString());
		}catch (NoSuchElementException ex) {
			System.out.println("Element not located on web page.");
		}
	}

	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	
	public static void main(String[] args) {
		// Create the object of WebDriverException class
		WebDriverException webDriverException = new WebDriverException();

		//Call the method startBrowser
		webDriverException.startBrowser();
		
		//Call the method openURL
		webDriverException.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method locateLoginBtn 
		webDriverException.locateLoginBtn();
		
		//Call the method closeBrowser
		webDriverException.closeBrowser();

	}
}
