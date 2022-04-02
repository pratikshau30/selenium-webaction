package seleniumWebActions.webActions;

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

public class WebElementAction {
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
	 * use this method to get text
	 * 
	 * @return
	 */
	public String getLoginBtnText() {
		String text = null;

		// TODO : get the text on login button


		return text;
	}

	/**
	 * use this method to perform click on button
	 */
	public void clickOnLoginBtn() {
		// TODO : click on login button

	}

	/**
	 * use this method to enter user name
	 * 
	 * @param userName
	 */
	public void enterUserName(String userName) {
		// TODO : enter username "admin"

	}

	/**
	 * use this method to enter password
	 * 
	 * @param password
	 */
	public void enterPassWord(String password) {
		// TODO : enter password "admin"

	}

	/**
	 * use this method to click on LOGIN TO QKART button
	 */
	public void clickOnLoginToQKart() {
		// TODO : click on "LOGIN TO QKART"

	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public static void main(String[] args) throws MalformedURLException {
		// TODO: Create the object of WebElementAction class

		// TODO: Call the method startBrowser

		// TODO: Call the method openURL

		// TODO: Call the method getLoginBtnText

		// TODO: Call the method clickOnLoginBtn

		// TODO: Call the method enterUserName

		// TODO: Call the method enterPassWord

		// TODO: Call the method clickOnLoginToQKart

		// TODO: Call the method closeBrowser

	}
}
