package TestCases;

import BaseClass.libraryClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventContactPage;

public class ContactUsTestCases extends libraryClass {
    EventContactPage contact;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        driver.get("https://example.com/contact");
        contact = new EventContactPage(driver);
    }

    @Test
    public void TC_CT_01_validContact() {
        contact.fillContactForm("Alice", "alice@example.com", "Booking Help", "Need assistance with event booking.");
        contact.sendMessage();
    }

    @Test
    public void TC_CT_02_missingName() {
        contact.fillContactForm("", "alice@example.com", "Booking Help", "Message body");
        contact.sendMessage();
    }

    @Test
    public void TC_CT_03_invalidEmail() {
        contact.fillContactForm("Alice", "alice@", "Booking Help", "Message body");
        contact.sendMessage();
    }

    @Test
    public void TC_CT_04_emptyMessage() {
        contact.fillContactForm("Alice", "alice@example.com", "Booking Help", "");
        contact.sendMessage();
    }

    @Test
    public void TC_CT_05_longSubject() {
        String longSubject = "A".repeat(300);
        contact.fillContactForm("Alice", "alice@example.com", longSubject, "Message body");
        contact.sendMessage();
    }

    @Test
    public void TC_CT_06_specialCharsInName() {
        contact.fillContactForm("@John$", "john@example.com", "Support", "Test message");
        contact.sendMessage();
    }
}
