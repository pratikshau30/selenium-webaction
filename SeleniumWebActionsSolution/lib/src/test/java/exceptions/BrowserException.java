package milestone5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserException {
	
	WebDriver driver = null;
	
	/**
	 * use this method to initialize the browser.
	 * 
	 * @param browserName
	 */
	public void startBrowser() {
		//Setup webDriverManager
		WebDriverManager manager = WebDriverManager.chromedriver();
		manager.setup();
		driver = new ChromeDriver();
	}
	
	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {
		System.out.println("");
		driver.manage().window().maximize();
		
		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);
	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateLoginBtn() {
			System.out.println("Locating login button on page");
			WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
			System.out.println("Locator value : "+loginButton.toString());
			loginButton.click();
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
		
		//Call the method locateLoginBtn 
		browserException.locateLoginBtn();

		//Call the method closeBrowser
		browserException.closeBrowser();
	}
}
