package AmazonShopping.DigitalCameras.Views;

import AmazonShopping.DigitalCameras.Locators.AmazonBestSellersInDigitalCamerasLocators;
import org.openqa.selenium.WebDriver;

/**
 * Class provides methods for Customer to moving on a page with game searching results.
 */

public class AmazonBestSellersInDigitalCameras {

    private AmazonBestSellersInDigitalCamerasLocators amazonBestSellersInDigitalCamerasLocators;                    //here are stored all needed element for performing actions on page

    /**
     * Default constructor.
     * @param driver enable performing actions on a page
     */
    public AmazonBestSellersInDigitalCameras(WebDriver driver) { amazonBestSellersInDigitalCamerasLocators = new AmazonBestSellersInDigitalCamerasLocators(driver); }

     /**
     * Clicking on 5th element.
     */
    public void clickOn5thElement() {
        amazonBestSellersInDigitalCamerasLocators.fifthElement().click(); }

    /**
     * Clicking on product details.
     */
    public void checkDetails() {

        /*TODO: Check properties. Currently there is nothing like that on product page.*/
    }

    /**
     * Adding items to cart.
     */
    public void addItemToCart() {

//        amazonBestSellersInDigitalCamerasLocators.quantityButton().click();
        amazonBestSellersInDigitalCamerasLocators.selectQuantity().click();
        amazonBestSellersInDigitalCamerasLocators.addToCartButton().click();
    }
}