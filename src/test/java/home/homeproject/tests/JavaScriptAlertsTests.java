package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.AlertsPage;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JavaScriptAlertsTests extends TestBase {

    SidePanel sidePanel;
    AlertsPage alertsPage;


    @BeforeEach
    public void precondition() {
        sidePanel = new SidePanel(driver);
        alertsPage = new AlertsPage(driver);
        new SidePanel(driver).selectJavaScriptAlerts();

        }

        @Test
    public void clickOnAlertTest() {
        alertsPage.clickForJsAlert()
                .acceptAlert("Close")
            .verifyResult("You successfully clicked an alert");
        }

        @Test
    public void clickOnForJsConfirm() {
        alertsPage.clickForJsConfirm()
                .selectOKConfirmation("OK")
                    .verifyOKConfirmation("You clicked: Ok");
        }

        @Test
    public void clickOnForJsPrompt() {
        alertsPage.clickForJsPrompt()
                .sendMessageToAlert("Hi!")
                .verifyMessage("Hi!");
        }

    }

