package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.MultipleWindow;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultipleWindowsTest extends TestBase {
    SidePanel sidePanel;
    MultipleWindow multipleWindow;

    @BeforeEach
    public void precondition() {
        sidePanel = new SidePanel(driver);
        multipleWindow = new MultipleWindow(driver);
        sidePanel.selectMyltipleWindow();
    }

    @Test
    public void firstTabTest() {
        multipleWindow.clickOnTheClickHere()
                .tabNewWindow(1)
                .verifyClickHere("New Window");
    }
}