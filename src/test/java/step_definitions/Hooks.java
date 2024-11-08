package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Starting the driver.....");
        Driver.getDriver();
    }

    @After
    public void tearDown() {
        //System.out.println("Closing the driver.....");
       // Driver.closeDriver();
    }
}
