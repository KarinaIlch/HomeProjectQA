package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.DropDownPage;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DropDownTest extends TestBase {
    SidePanel sidePanel;
    DropDownPage dropDown;

    @BeforeEach
    public void precondition() {
        sidePanel = new SidePanel(driver);
        dropDown = new DropDownPage(driver);
    }

    @Test
    public void dropDownTest() {
        sidePanel.clickOnDropDownLink();
        new DropDownPage(driver).
                selectSecondOption("Option 2")
                .verifyAnOption();

    }
}