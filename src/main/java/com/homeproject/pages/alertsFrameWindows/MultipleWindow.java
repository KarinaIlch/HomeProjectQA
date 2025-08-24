package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindow extends BasePage {

    public MultipleWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='example']//a[text()='Click Here']")
    WebElement clickHereButton;

    public MultipleWindow clickOnTheClickHere() {
        click(clickHereButton);
        return this;
    }
    public MultipleWindow tabNewWindow(int index) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//h3[normalize-space()='New Window']")
    WebElement newWindow;

    public MultipleWindow verifyClickHere(String title ) {
        Assertions.assertTrue(containsText(title,newWindow));
        return this;
    }

}
