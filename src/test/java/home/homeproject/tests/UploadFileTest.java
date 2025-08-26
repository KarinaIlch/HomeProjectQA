package home.homeproject.tests;

import com.homeproject.pages.alertsFrameWindows.UploadFilePage;
import com.homeproject.pages.internetSite.SidePanel;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UploadFileTest extends TestBase {

    SidePanel sidePanel;
    UploadFilePage uploadFile;

    @BeforeEach
    public void precondition() {
        sidePanel = new SidePanel(driver);
        uploadFile = new UploadFilePage(driver);

    }

    @Test
    public void uploadFileTest() {
        sidePanel.selectUploadFile();
        uploadFile.uploadFileToTheSite("/Users/karinailchenko/Tools/9193_1.jpg");
        uploadFile.clickOnTheUploadBtn()
                .verifyUpload("File Uploaded!");

    }
}
