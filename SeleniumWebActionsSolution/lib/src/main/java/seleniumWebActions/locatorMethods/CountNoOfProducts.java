package seleniumWebActions.locatorMethods;

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

public class CountNoOfProducts {
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);

		// TODO - Set implicity wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
	 * use this method to locate all the products on page and print the total number
	 * of product listed.
	 */
	public void totalCountOfProducts() {
		int count = 0;
		// TODO: Locate all the links available on web page and print the count
		System.out.println("Locating all the products available on page.");
		List<WebElement> totalProducts = driver
				.findElements(By.xpath("//div[contains(@Class,'MuiGrid-root MuiGrid-item')]//child::img"));
		count = totalProducts.size();
		System.out.println("Total numbers of products available : " + count);
	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public void run() throws MalformedURLException {

		

		// TODO: Call the method startBrowser
		this.startBrowser();

		// TODO: Call the method openURL to open
		// "https://crio-qkart-frontend-qa.vercel.app/"
		this.openURL("https://crio-qkart-frontend-qa.vercel.app/");

		// TODO: Call the method totalCountOfLinks
		this.totalCountOfProducts();

		// TODO: Call the method closeBrowser
		this.closeBrowser();

	}
}
