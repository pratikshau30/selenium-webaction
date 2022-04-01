package Milestone2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserActions {

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
	 * use this method to print the current 
	 * url of web page.
	 */
	public String getCurrentUrl() {
		String currentUrl = null;
		currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	/**
	 * use this method to get the title of a page.
	 * 
	 * @return
	 */
	public String getPageTitle() {
		String title = null;
		title = driver.getTitle();
		return title;
	}

	/**
	 * use this method to get page source of current web page 
	 * @return
	 */
	
	public void getPageSource() {
		String pageSource = null;
		pageSource = driver.getPageSource();
		boolean isPresent = pageSource.contains("You need to enable JavaScript to run this app.");
		System.out.println("Text is present in page source : "+isPresent);
	}
	
	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public static void main(String[] args) {
		// Create the object of BrowserActions class
		BrowserActions browserActions = new BrowserActions();
		
		//Call the methods startBrowser
		browserActions.startBrowser();
		
		//Call the methods openURL
		browserActions.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method getCurrentUrl and print the current url
		String CurrentPageUrl = browserActions.getCurrentUrl();
		System.out.println("Current url : "+CurrentPageUrl);
		
		//call the method getPageSource 
		 browserActions.getPageSource();
		
		//Call the methods getPageTitle and print the title
		String title = browserActions.getPageTitle();
		System.out.println("Title of the page is : " +title);
		
		// Call the methods closeBrowser
		browserActions.closeBrowser();
	}
}
