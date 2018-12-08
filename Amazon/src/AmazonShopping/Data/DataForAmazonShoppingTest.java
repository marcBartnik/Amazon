package AmazonShopping.Data;

/**
 * Class stores necessary data for running tests
 */

public class DataForAmazonShoppingTest {

    private static final String AMAZON_HOMEPAGE = "http://www.amazon.com";
    private static final String AMAZON_PAGE_TITLE = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs &amp; more";
    private static final String REQUESTED_ITEMS = "Best sellers in Digital Cameras";

    public static String getAmazonHomepage() { return AMAZON_HOMEPAGE; }

    public static String getAmazonPageTitle() { return AMAZON_PAGE_TITLE; }

    public static String getRequestedItems() { return REQUESTED_ITEMS; }
}