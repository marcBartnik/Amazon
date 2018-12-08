package AmazonShopping.Tests;

import AmazonShopping.Customers.Customer;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * Class calls all methods from class Customer.
 */
public class DigitalCamerasBuying {

    private static Customer customer = new Customer();

    @Before
    public void setUp() {
        customer.startSession();
    }
    /**
     * Cleaning up.
     */
    @AfterClass
    public static void tearDown() { customer.quitSession(); }

    /**
     * Hereby are all implemented steps from scenario.
     */
    @Test
    public void customerIsBuyingDigitalCameras() {

        customer.goToHomePage();
        customer.checkBestSellerCameras();
        customer.openDetailsForProduct();
        customer.addProductToCart();
        customer.checkProductsInCart();
        customer.checkSubtotalPrice();
    }
}