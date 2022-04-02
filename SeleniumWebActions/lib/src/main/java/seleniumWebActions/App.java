package seleniumWebActions;

import java.net.MalformedURLException;

import seleniumWebActions.browserInit.BrowserInit;
import seleniumWebActions.exceptions.BrowserException;
import seleniumWebActions.exceptions.WebDriverException;
import seleniumWebActions.locatorMethods.CountNoOfProducts;
import seleniumWebActions.locatorMethods.FindLocators;
import seleniumWebActions.locatorMethods.FindLocatorsUsingFindElementBy;
import seleniumWebActions.locatorMethods.ProductCountUsingFindElementsBy;
import seleniumWebActions.webActions.WebElementAction;
import seleniumWebActions.webDriverMethods.BrowserActions;
import seleniumWebActions.webDriverMethods.NavigationCommands;

public class App {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        System.out.println("From App.java");

        // TODO1 - Uncomment for Milestone 3 Activity - Add the RemoteWebDriver config
        // BrowserInit browserInit = new BrowserInit();
        // browserInit.main(null);

        // TODO2 - Uncomment for Milestone 4 Activity - Automate BrowserActions
        // BrowserActions browserActions = new BrowserActions();
        // browserActions.main(null);

        // TODO3 - Uncomment for Milestone 6 Activity - Automate NavigationCommands
        // NavigationCommands navigationCommands = new NavigationCommands();
        // navigationCommands.main(null);

        // TODO4 - Uncomment for Milestone 7 Activity - findElement (FindLocators.java)
        // FindLocators findLocators = new FindLocators();
        // findLocators.main(null);

        // TODO5 - Uncomment for Milestone 7 Activity - findElements (CountNoOfProducts.java)
        // CountNoOfProducts countNoOfProducts = new CountNoOfProducts();
        // countNoOfProducts.main(null);

        // TODO6 - Uncomment for Milestone 7 Activity - findElementByXX (FindLocatorsUsingFindElementBy.java)
        // FindLocatorsUsingFindElementBy findLocatorsUsingFindElementBy = new FindLocatorsUsingFindElementBy();
        // findLocatorsUsingFindElementBy.main(null);

        // TODO7 - Uncomment for Milestone 7 Activity - findElementsByXX (ProductCountUsingFindElementsBy.java)
        // ProductCountUsingFindElementsBy productCountUsingFindElementsBy = new ProductCountUsingFindElementsBy();
        // productCountUsingFindElementsBy.main(null);
        
        // TODO8 - Uncomment for Milestone 8 Activity - Web Elements Action
        // WebElementAction webElementAction = new WebElementAction();
        // webElementAction.main(null);

        // TODO9 - Uncomment for Milestone 9 Activity - WebDriverException
        WebDriverException webDriverException = new WebDriverException();
        webDriverException.main(null);

        // TODO10 - Uncomment for Milestone 9 Activity - WebElementException
        // WebElementException webElementException = new WebElementException();
        // webElementException.main(null);
    }
}