package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ReusableFunctions;

public class EventContactPage {

    WebDriver driver;

    public EventContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "contact_name")
    WebElement nameField;

    @FindBy(name = "contact_email")
    WebElement emailField;

    @FindBy(name = "contact_subject")
    WebElement subjectField;

    @FindBy(name = "contact_message")
    WebElement messageField;

    @FindBy(name = "message")
    WebElement sendMessageButton;

    

    // Submit the contact form
    public void sendMessage() {
        sendMessageButton.click();
    }

	public void fillContactForm(String name, String email, String subject, String message) {
		ReusableFunctions.enterText(nameField, name);
        ReusableFunctions.enterText(emailField, email);
        ReusableFunctions.enterText(subjectField, subject);
        ReusableFunctions.enterText(messageField, message);
		
	}
}
