package milestone4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		System.out.println("Maximizing browser window...");
		driver.manage().window().maximize();
		
		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);
	}
	
	/**
	 * use this method to get text 
	 * @return
	 */
	public String getLoginBtnText() {
		String text = null;
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='css-vb6e92']//child::button[contains(@class,'MuiButton-root MuiButton-text')]"));
		text = loginBtn.getText();
		return text;
	}
	
	/**
	 * use this method to perform click on button
	 */
	public void clickOnLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='css-vb6e92']//child::button[contains(@class,'MuiButton-root MuiButton-text')]"));
		loginBtn.click();
	}
	
	/**
	 * use this method to enter user name
	 * @param userName
	 */
	public void enterUserName(String userName) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(userName);
	}
	
	/**
	 * use this method to enter password
	 * @param password
	 */
	public void enterPassWord(String password) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}
	
	/**
	 * use this method to click on LOGIN TO QKART button
	 */
	public void clickOnLoginToQKart() {
		WebElement loginToQkart = driver.findElement(By.xpath("//button[text()='Login to QKart']"));
		loginToQkart.click();
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
		
		//Call the method getLoginBtnText 
		String text = browserException.getLoginBtnText();
		System.out.println("Title of login button is : " +text);
	   
		//Call the method clickOnLoginBtn
		browserException.clickOnLoginBtn();
		
		//Call the method enterUserName
		browserException.enterUserName("admin");
		
		//Call the method enterPassWord
		browserException.enterPassWord("admin");
		
		// call the method clickOnLoginToQKart
		browserException.clickOnLoginToQKart();
		
		//Call the method closeBrowser
		//browserException.closeBrowser();

	}
}
