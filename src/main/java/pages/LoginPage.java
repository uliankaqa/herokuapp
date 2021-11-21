package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    private static final String LOGIN_URL = BASE_URL + "/login";
    private static final By USER_NAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BTN = By.cssSelector(".fa");
    private static final By ERROR_MESSAGE = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public SecureArealPage clickOnLoginBtn() {
        driver.findElement(LOGIN_BTN).click();
        return new SecureArealPage(driver);
    }

    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    public void fillInCredentials(String username, String password) {
        driver.findElement(USER_NAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public boolean assertLoginError() {
        String errorMessage = driver.findElement(ERROR_MESSAGE).getText();
        return errorMessage.contains("username is invalid!");
    }
}
