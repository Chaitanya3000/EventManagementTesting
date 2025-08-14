package StepDefinitions;

import BaseClass.libraryClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends libraryClass {

    @Before
    public void setup() {
        // Can be used if needed globally
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
