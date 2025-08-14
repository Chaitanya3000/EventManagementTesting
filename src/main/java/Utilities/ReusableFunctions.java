package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableFunctions {

    public static void enterText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void clickButton(WebElement element) {
        element.click();
    }

    public static void selectByVisibleText(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }
}
