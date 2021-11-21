package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArealPage extends Page {
    public SecureArealPage(WebDriver driver) {
        super(driver);
    }
    private static final By MESSAGE = By.id("flash");

    public boolean assertLogin() {
        String message = driver.findElement(MESSAGE).getText();
        return message.contains("logged into a secure area");
    }
}
