package AmazonShopping.TestRunners;

import AmazonShopping.Tests.DigitalCamerasBuying;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Class which run all tests from scenario.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DigitalCamerasBuying.class,
})

public class AmazonShoppingTest {}