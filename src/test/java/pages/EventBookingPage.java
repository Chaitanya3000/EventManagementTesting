package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ReusableFunctions;

public class EventBookingPage {

    WebDriver driver;

    public EventBookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Form Fields
    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "phoneNo")
    WebElement phoneNumber;

    @FindBy(name = "emaiId")
    WebElement email;

    @FindBy(name = "eventType")
    WebElement eventTypeDropdown;

    @FindBy(name = "eventDate")
    WebElement eventDate;

    @FindBy(name = "eventTime")
    WebElement eventTime;

    @FindBy(name = "guestCount")
    WebElement guestCount;

    @FindBy(xpath = "//*[@id=\"vegFood\"]")
    WebElement cateringVeg;

    @FindBy(xpath = "//*[@id=\"nonVegFood\"]")
    WebElement cateringNonVeg;

    @FindBy(name = "address")
    WebElement address;

    @FindBy(name = "city")
    WebElement cityDropdown;

    @FindBy(name = "pincode")
    WebElement pincode;

    @FindBy(name = "eventDetail")
    WebElement eventDetails;

    @FindBy(id = "book-now")
    WebElement bookNowButton;

    @FindBy(id = "reset-now")
    WebElement resetButton;

    // Actions
    public void fillBookingForm(String fname, String lname, String phone, String emailId, String eventType,
                                String date, String time, String guests, String catering,
                                String addr, String city, String pin, String details) {
        ReusableFunctions.enterText(firstName, fname);
        ReusableFunctions.enterText(lastName, lname);
        ReusableFunctions.enterText(phoneNumber, phone);
        ReusableFunctions.enterText(email, emailId);
        ReusableFunctions.enterText(eventDate, date);
        ReusableFunctions.enterText(eventTime, time);
        ReusableFunctions.enterText(guestCount, guests);
        ReusableFunctions.enterText(address, addr);
        ReusableFunctions.enterText(pincode, pin);
        ReusableFunctions.enterText(eventDetails, details);

        ReusableFunctions.selectByVisibleText(eventTypeDropdown, eventType);
        ReusableFunctions.selectByVisibleText(cityDropdown, city);

        if (catering.equalsIgnoreCase("Veg")) {
            cateringVeg.click();
        } else {
            cateringNonVeg.click();
        }
    }

    public void submitForm() {
        bookNowButton.click();
    }

    public void resetForm() {
        resetButton.click();
    }
}
