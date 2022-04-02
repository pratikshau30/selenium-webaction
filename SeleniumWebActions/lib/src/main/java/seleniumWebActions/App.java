package seleniumWebActions;

import java.net.MalformedURLException;
import seleniumWebActions.browserInit.BrowserInit;
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

        // TODO2 - Uncomment for Milestone 6 Activity - Automate NavigationCommands
        // NavigationCommands navigationCommands = new NavigationCommands();
        // navigationCommands.main(null);
    }
}