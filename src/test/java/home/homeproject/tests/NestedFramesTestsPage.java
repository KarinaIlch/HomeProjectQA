package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.NestedFramePage;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFramesTestsPage extends TestBase {

    SidePanel sidePanel;
    NestedFramePage nestedFrame;

    @BeforeEach
    public void precondition() {
        sidePanel = new SidePanel(driver);
        nestedFrame = new NestedFramePage(driver);
    }

    @Test
    public void NumberOfTheFrameTest() {
        sidePanel.selectNestedFrames();
        nestedFrame.returnNumberOfFrames();

    }

    @Test
    public void TheLeftFrameTest() {
        sidePanel.selectNestedFrames();
        new NestedFramePage(driver).returnNumberOfFrames()
                .CheckTheLeftFrame();
    }

    @Test
    public void TheMiddleFrameTest() {
        sidePanel.selectNestedFrames();
        new NestedFramePage(driver).checkTheMiddleFrame();

    }

    @Test
    public void TheRightFrameTest() {
        sidePanel.selectNestedFrames();
        new NestedFramePage(driver).checkTheRightFrame();

    }

    @Test
    public void TheBottomFrameTest() {
        sidePanel.selectNestedFrames();
        new NestedFramePage(driver).checkTheBottomFrame();
    }

}