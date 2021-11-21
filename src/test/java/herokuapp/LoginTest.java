package herokuapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureArealPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends TestBase{
    private LoginPage loginPage;
    private SecureArealPage secureArealPage;
    @BeforeEach
    public void ensurePrecondition(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void positiveLoginTest(){
        //open login page
        loginPage.goToLoginPage();
        loginPage.fillInCredentials("tomsmith", "SuperSecretPassword!");
        secureArealPage = loginPage.clickOnLoginBtn();
        assertTrue(secureArealPage.assertLogin());

    }

    @Test
    public void negativeLoginUserNameTest(){
        //open login page
        loginPage.goToLoginPage();
        loginPage.fillInCredentials("tomith", "SuperSecretPassword!");
        loginPage.clickOnLoginBtn();
        assertTrue(loginPage.assertLoginError());

    }
}
