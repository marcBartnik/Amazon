package AmazonShopping.Cart.Views;

import AmazonShopping.Cart.Locators.AmazonCartPageLocators;
import AmazonShopping.DigitalCameras.Locators.AmazonBestSellersInDigitalCamerasLocators;
import org.openqa.selenium.WebDriver;

public class AmazonCartPage {

    private AmazonCartPageLocators amazonCartPageLocators;      //here are stored all needed elements for performing actions on page

    public AmazonCartPage(WebDriver driver) {  amazonCartPageLocators = new AmazonCartPageLocators(driver); }

    /**
     * Checking that correct product was added.
     */
    public void checkProductsInCart(AmazonBestSellersInDigitalCamerasLocators amazonBestSellersInDigitalCamerasLocators) {

        // TODO: Check that correct product was added.
        amazonCartPageLocators.cartButton().click();
        amazonCartPageLocators.productName().getText().equals(amazonBestSellersInDigitalCamerasLocators.productName());  //przy wyszukiwaniu product name jest crash, reszta to na razie prototyp
    }

    /**
     * Checking that correct product was added.
     */
    public void checkSummarizePriceForProducts() {

        // TODO: Check that subtotal price for product is ok.
        amazonCartPageLocators.subtotalPrice().getText().equals(amazonCartPageLocators.productPrice());   //to tez an razie prototyp
    }
}
