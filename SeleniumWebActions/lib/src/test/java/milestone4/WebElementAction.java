package milestone4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
	
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
		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to get text 
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
	 * @param userName
	 */
	public void enterUserName(String userName) {
		// TODO : enter username "admin"
	}
	
	/**
	 * use this method to enter password
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
	public static void main(String[] args) {
		// Create the object of WebElementAction class
		WebElementAction browserException = new WebElementAction();

		//Call the method startBrowser
		browserException.startBrowser();
		
		//Call the method openURL
		browserException.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		// TODO : Call the method getLoginBtnText 
	   
		// TODO : call the method clickOnLoginBtn
		
		// TODO : call the method enterUserName
		
		// TODO : call the method enterPassWord
		
		// TODO : call the method clickOnLoginToQKart
		
		//Call the method closeBrowser
		browserException.closeBrowser();

	}
}
