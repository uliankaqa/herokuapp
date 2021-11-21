package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HoversPage;

public class TestBase {
    public ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
