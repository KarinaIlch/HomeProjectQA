package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.ContextMenuPage;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase {

    SidePanel sidePanel;
    ContextMenuPage contextMenu;


    @BeforeEach
    public void precondition(){
        sidePanel = new SidePanel(driver);
        contextMenu = new ContextMenuPage(driver);
    }

    @Test
    public void ContextMenuTest(){
        sidePanel.selectContextMenu();
        contextMenu.firstRightClickAndGoHome();
//        contextMenu.returnToTheMainManu()
//                .verifyBackToTheMainPage("Welcome to the-internet");
    }
}
