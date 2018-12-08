package AmazonShopping.HomePage.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests.
 */

public class AmazonHomePageLocators {

    private WebDriver driver;					//driver which allows navigation on web page
    private By searchInputFieldLocator;			//field where customer can type requested item
    private By searchButtonLocator;				//button which runs searching for particular item

    /**
     * Web element representatives on a page.
     * @param driver enable performing actions ona page
     */
    public AmazonHomePageLocators(WebDriver driver) {

        this.driver = driver;
        searchInputFieldLocator = new By.ById("twotabsearchtextbox");
        searchButtonLocator = new By.ByCssSelector("nav-search-submit nav-sprite");
    }

    /**
     * Reaching search field.
     */
    public WebElement searchInputField() { return  driver.findElement(searchInputFieldLocator); }

    /**
     * Reaching search button.
     */
    public WebElement searchButton() { return driver.findElement(searchButtonLocator); }
}

