package TestCases;

import BaseClass.libraryClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventBookingPage;

public class BookingTestCases extends libraryClass {
    EventBookingPage booking;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        driver.get("https://example.com/booking");
        booking = new EventBookingPage(driver);
    }

    @Test
    public void TC_BK_01_validBooking() {
        booking.fillBookingForm("John", "Doe", "9876543210", "john@example.com", "Wedding", "2025-08-01", "17:00", "100", "Veg", "123 Street", "Hyderabad", "500001", "Evening Wedding Function");
        booking.submitForm();
    }

    @Test
    public void TC_BK_02_missingFirstName() {
        booking.fillBookingForm("", "Doe", "9876543210", "john@example.com", "Wedding", "2025-08-01", "17:00", "100", "Veg", "123 Street", "Hyderabad", "500001", "Details...");
        booking.submitForm();
    }

    @Test
    public void TC_BK_03_invalidEmailFormat() {
        booking.fillBookingForm("John", "Doe", "9876543210", "abc@", "Wedding", "2025-08-01", "17:00", "100", "Veg", "123 Street", "Hyderabad", "500001", "Details...");
        booking.submitForm();
    }

    @Test
    public void TC_BK_04_invalidGuestCount() {
        booking.fillBookingForm("John", "Doe", "9876543210", "john@example.com", "Wedding", "2025-08-01", "17:00", "ten", "Veg", "123 Street", "Hyderabad", "500001", "Details...");
        booking.submitForm();
    }

    @Test
    public void TC_BK_05_bookingWithNonVeg() {
        booking.fillBookingForm("John", "Doe", "9876543210", "john@example.com", "Birthday", "2025-08-01", "17:00", "50", "NonVeg", "456 Street", "Chennai", "600001", "Birthday celebration");
        booking.submitForm();
    }

    @Test
    public void TC_BK_06_emptyEventDetails() {
        booking.fillBookingForm("John", "Doe", "9876543210", "john@example.com", "Meeting", "2025-08-01", "17:00", "25", "Veg", "789 Street", "Delhi", "110001", "");
        booking.submitForm();
    }
}