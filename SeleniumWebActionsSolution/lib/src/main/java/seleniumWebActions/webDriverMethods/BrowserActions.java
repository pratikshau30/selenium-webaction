package seleniumWebActions.webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserActions {

	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
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
		// TODO: Maximize the browser window
		System.out.println("Maximizing window...");
		driver.manage().window().maximize();

		// TODO: Open Web site denoted by "browserUrl"
		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);
	}

	/**
	 * use this method to print the current url of web page.
	 */
	public String getCurrentUrl() {
		String currentUrl = null;

		// TODO : get the current page url
		currentUrl = driver.getCurrentUrl();

		return currentUrl;
	}

	/**
	 * use this method to get the title of a web site
	 * 
	 * @return
	 */
	public String getPageTitle() {
		String title = null;

		// TODO: get the title of web site
		title = driver.getTitle();

		return title;
	}

	/**
	 * use this method to get page source of current web page
	 * 
	 * @return
	 */
	public void getPageSource() {
		String pageSource = null;

		// TODO : get the page source of current web page
		pageSource = driver.getPageSource();

		// TODO : Check "You need to enable JavaScript to run this app." present in page
		// source and print status
		String stringToMatch = "You need to enable JavaScript to run this app.";
		boolean isPresent = pageSource.contains(stringToMatch);

		System.out.println("Text is present in page source : "+ isPresent);
	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		// TODO: Close the browser window
		System.out.println("Closing the browser window");
		driver.close();
	}

	public void run() throws MalformedURLException {
		

		// TODO : Call the method startBrowser
		this.startBrowser();

		// TODO : Call the method openURL to open https://crio-qkart-frontend-qa.vercel.app/
		this.openURL("https://crio-qkart-frontend-qa.vercel.app/");

		// TODO : Call the method getCurrentUrl and print the current url
		String currentPageUrl = this.getCurrentUrl();
		System.out.println("Current url : " + currentPageUrl);

		// TODO : call the method getPageSource
		this.getPageSource();

		// TODO : Call the method getPageTitle and print the title
		String title = this.getPageTitle();
		System.out.println("Title of the page is : " + title);

		// TODO : Call the methods closeBrowser
		this.closeBrowser();

	}
}
