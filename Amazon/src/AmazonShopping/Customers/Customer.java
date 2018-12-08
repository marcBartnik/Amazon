package AmazonShopping.Customers;

import java.io.File;
import AmazonShopping.Cart.Views.AmazonCartPage;
import AmazonShopping.DigitalCameras.Locators.AmazonBestSellersInDigitalCamerasLocators;
import AmazonShopping.DigitalCameras.Views.AmazonBestSellersInDigitalCameras;
import AmazonShopping.HomePage.Views.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class Customer is an Actor who will be performing actions on Amazon page.
 */

public class Customer {

    private WebDriver driver;
    private final String chromeDriverPath = new File("bin/chromedriver.exe").getAbsolutePath();

    private AmazonHomePage amazonHomePage;
    private AmazonBestSellersInDigitalCamerasLocators amazonBestSellersInDigitalCamerasLocators;
    private AmazonBestSellersInDigitalCameras amazonBestSellersInDigitalCameras;
    private AmazonCartPage amazonCartPage;

    /**
     * Constructor.
     */
    public Customer() {}

    /**
     * Setting up environment for using Chrome driver.
     */
    public void startSession() {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

        amazonHomePage = new AmazonHomePage(driver);
        amazonBestSellersInDigitalCameras = new AmazonBestSellersInDigitalCameras(driver);
        amazonBestSellersInDigitalCamerasLocators = new AmazonBestSellersInDigitalCamerasLocators(driver);
        amazonCartPage = new AmazonCartPage(driver);
    }

    /**
     * Cleaning up environment after tests.
     */
    public void quitSession() {

        driver.close();
        driver.quit();
    }

    /**
     * Opening Amazon home page and validation if it succeeded.
     */
    public void goToHomePage() {

        amazonHomePage.openHomePage();
    }

    /**
     * Looking for specified items.
     */
    public void checkBestSellerCameras() {

        amazonHomePage.clickOnSearchInputField();
        amazonHomePage.setRequestedProduct();
        amazonHomePage.lookForDesiredProduct();
    }

    /**
     * Checking details of particular item.
     */
    public void openDetailsForProduct() {

        amazonBestSellersInDigitalCameras.clickOn5thElement();
//        amazonBestSellersInDigitalCameras.checkDetails();   //Nie ma czegos takie jak details
    }

    /**
     * Adding particular product to cart.
     */
    public void addProductToCart() {

        amazonBestSellersInDigitalCameras.addItemToCart();
    }

    /**
     * Checking that correct products were added.
     */
    public void checkProductsInCart() {

        amazonCartPage.checkProductsInCart(amazonBestSellersInDigitalCamerasLocators);
    }

    /**
     * Checking that summarize price is ok.
     */
    public void checkSubtotalPrice() {

        amazonCartPage.checkSummarizePriceForProducts();
    }
}