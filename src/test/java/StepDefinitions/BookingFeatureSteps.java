package StepDefinitions;

import BaseClass.libraryClass;
import io.cucumber.java.en.*;
import pages.EventBookingPage;

public class BookingFeatureSteps extends libraryClass {
    EventBookingPage booking;

    @Given("User is on Booking page")
    public void user_is_on_booking_page() {
        launchBrowser();
        driver.get("https://example.com/booking");
        booking = new EventBookingPage(driver);
    }

    @When("User enters booking details {string} and {string}")
    public void user_enters_booking_details(String name, String email) {
        booking.fillBookingForm(name, email);
    }

    @And("User submits the booking form")
    public void user_submits_booking_form() {
        booking.submitForm();
    }

    @Then("Booking should be successful")
    public void booking_should_be_successful() {
        // Add assertion or validation logic here
        closeBrowser();
    }
}
