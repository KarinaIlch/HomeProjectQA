package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramePage extends BasePage {

    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@src='/frame_top']")
    List<WebElement> frames;

    @FindBy(xpath = "//*[@src='/frame_top']")
    WebElement frameTop;

    public NestedFramePage returnNumberOfFrames() {
        System.out.println("The total number of iframes are " + frames.size());
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-left']")
    WebElement frameLeft;

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramePage CheckTheLeftFrame() {
        driver.switchTo().frame(frameTop); // спочатку у frame_top
        driver.switchTo().frame(frameLeft); // потім у frame-left
        Assertions.assertTrue(containsText("LEFT", body));
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-middle']")
    WebElement frameMiddle;

    public NestedFramePage checkTheMiddleFrame() {
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameMiddle);
        Assertions.assertTrue(containsText("MIDDLE", body));
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-right']")
    WebElement frameRight;

    public NestedFramePage checkTheRightFrame() {
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameRight);
        Assertions.assertTrue(containsText("RIGHT", body));
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(css = "frame[name='frame-bottom']")
    WebElement frameBottom;

    public NestedFramePage checkTheBottomFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frameBottom);
        Assertions.assertTrue(containsText("BOTTOM", body));
        driver.switchTo().defaultContent();
        return this;
    }

}




