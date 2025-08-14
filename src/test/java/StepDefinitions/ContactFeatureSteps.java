package StepDefinitions;

import BaseClass.libraryClass;
import io.cucumber.java.en.*;
import pages.EventContactPage;

public class ContactFeatureSteps extends libraryClass {

    EventContactPage contact;

    @Given("User is on Contact Us page")
    public void user_is_on_contact_us_page() {
        launchBrowser();
        driver.get("https://example.com/contact");
        contact = new EventContactPage(driver);
    }

    @When("User enters contact form details {string}, {string}, {string}, and {string}")
    public void user_enters_contact_form_details(String name, String email, String subject, String message) {
        contact.fillContactForm(name, email, subject, message);
    }

    @And("User submits the contact form")
    public void user_submits_contact_form() {
        contact.sendMessage();
    }

    @Then("A confirmation message should be displayed")
    public void confirmation_message_should_be_displayed() {
        // TODO: Add assertion for success message if applicable
        closeBrowser();
    }
}
