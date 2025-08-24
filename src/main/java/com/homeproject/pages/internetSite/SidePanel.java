package com.homeproject.pages.internetSite;

import com.homeproject.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {

    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='JavaScript Alerts']")
    WebElement javaScriptAlerts;

    public SidePanel selectJavaScriptAlerts() {
        click(javaScriptAlerts);
        return this;
    }

    @FindBy(xpath = "//a[@href='/windows' and normalize-space()='Multiple Windows']")
    WebElement MultipleWindowButton;

    public SidePanel clickOnMyltipleWindow() {
        click(MultipleWindowButton);
        return new SidePanel(driver);

    }
    }




