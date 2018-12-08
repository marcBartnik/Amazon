package AmazonShopping.DigitalCameras.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests
 */
public class AmazonBestSellersInDigitalCamerasLocators {

    private WebDriver driver;				    //driver which allows to navigate on a web page
    private By fifthElement;					//5th elemnt in search results
    private By productNameLocator;              //Name of selected product
    private By selectQuantityLocator;		//field which represents requested quantity of product
    private By addToCartButtonLocator;			//button which allows adding products to cart

    /**
     * Web element representatives on a page.
     */
    public AmazonBestSellersInDigitalCamerasLocators(WebDriver driver){

        this.driver = driver;
        fifthElement = new By.ByCssSelector("#result_5 > div > div.a-fixed-left-grid > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div.a-row.a-spacing-none.scx-truncate-medium.sx-line-clamp-2 > a");
        productNameLocator = new By.ById("result_3");
        selectQuantityLocator = new By.ByXPath("//*[@id=\"quantity\"]/option[8]");
        addToCartButtonLocator = new By.ByXPath("//*[@id=\"add-to-cart-button\"]");
    }

    /**
     * Finding 5th product on a page
     */
    public WebElement fifthElement() { return driver.findElement(fifthElement); }

    /**
     * Finding 5th product on a page
     */
    public WebElement productName() { return driver.findElement(productNameLocator); }

    /**
     * Finding selecting requested quantity button
     */
    public WebElement selectQuantity() { return driver.findElement(selectQuantityLocator); }

    /**
     * Finding "Add to cart" button
     */
    public WebElement addToCartButton() { return driver.findElement(addToCartButtonLocator); }
}