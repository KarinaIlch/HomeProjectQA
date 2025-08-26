package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage extends BasePage {

    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement uploadFile;

    public UploadFilePage uploadFileToTheSite(String path) {
        uploadFile.sendKeys(path);
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement checkTitle;

    public UploadFilePage verifyUpload(String title) {
        Assertions.assertTrue(containsText(title, checkTitle));
        return this;
    }

    @FindBy(id= "file-submit")
    WebElement uploadBtn;

    public UploadFilePage clickOnTheUploadBtn() {
        click(uploadBtn);
        return this;
    }
}

