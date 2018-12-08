package AmazonShopping.HomePage.Views;

import AmazonShopping.Data.DataForAmazonShoppingTest;
import AmazonShopping.HomePage.Locators.AmazonHomePageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

/**
 * Class provides methods for Customer to moving on a page.
 */

public class AmazonHomePage {

    private WebDriver driver;															                //driver which allows navigation on web page
    private AmazonHomePageLocators amazonHomePageLocators;											    //here are stored all needed element for performing action on home page
    private String amazonHomepage = DataForAmazonShoppingTest.getAmazonHomepage(); 		                //access to getter where Amazon page url is stored
    private String amazonPageTitle = DataForAmazonShoppingTest.getAmazonPageTitle();		            //access to getter where Amazon page title is stored

    /**
     * Constructor
     */
    public AmazonHomePage(WebDriver driver) {

        this.driver = driver;
        amazonHomePageLocators = new AmazonHomePageLocators(driver);
    }

    /**
     * Opening Amazon home page and verification if it succeeded.
     */
    public void openHomePage() {

        driver.get(amazonHomepage);
        if (driver.getTitle().equals(amazonPageTitle))
            throw new TimeoutException("There is no response from Amazon! Url address is unreachable.");
    }

    /**
     * Clicking onto search field.
     */
    public void clickOnSearchInputField() { amazonHomePageLocators.searchInputField().click(); }

    /**
     * Typing requested products.
     */
    public void setRequestedProduct() { amazonHomePageLocators.searchInputField().sendKeys(DataForAmazonShoppingTest.getRequestedItems()); }

    /**
     * Clicking search button.
     */
    public void lookForDesiredProduct() { amazonHomePageLocators.searchInputField().sendKeys(Keys.RETURN); }
}