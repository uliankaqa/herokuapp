package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HoversPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoversTest extends TestBase {

    HoversPage hoversPage;

    @BeforeEach
    public void initPageObjects() {
        hoversPage = new HoversPage(driver);
    }

    @Test
    public void testHoversOnImages() {
        //open Hovers Page
        hoversPage.goToHoversPage();

        for (int i = 1; i < 4; i++) {
            // hover over each profile picture
            hoversPage.hoverOverProfilePics(i);
            // assertion
            assertTrue(hoversPage.isUsernamePresent("user" + i, i - 1),
                    "username user" + i + " is not displayed!");
        }
    }
}
