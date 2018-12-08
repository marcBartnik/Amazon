package AmazonShopping.Cart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCartPageLocators {

    private WebDriver driver;				    //driver which allows to navigate on a web page
    private By cartButtonLocator;				//button which bring customer to cart
    private By productPriceLocator;             //field that shows product price
    private By subtotalPriceLocator;		    //field that shows subtotal price
    private By productNameLocator;		        //field which represents requested quantity of product

    /**
     * Web element representatives on a page.
     */
    public AmazonCartPageLocators(WebDriver driver){

        this.driver = driver;
        cartButtonLocator = new By.ByXPath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
        productPriceLocator = new By.ByXPath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[2]/p/span");
        subtotalPriceLocator = new By.ByClassName("//*[@id=\"gutterCartViewForm\"]/div[3]/div/div/div[1]/p/span/span[2]");
        productNameLocator = new By.ByXPath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span/text()");
    }

    /**
     * Finding 5th product on a page
     */
    public WebElement cartButton() { return driver.findElement(cartButtonLocator); }  //Tu sie wywala

    /**
     * Finding quantity button
     */
    public WebElement productPrice() { return driver.findElement(productPriceLocator); }

    /**
     * Finding quantity button
     */
    public WebElement subtotalPrice() { return driver.findElement(subtotalPriceLocator); }

    /**
     * Finding selecting requested quantity button
     */
    public WebElement productName() { return driver.findElement(productNameLocator); }
}