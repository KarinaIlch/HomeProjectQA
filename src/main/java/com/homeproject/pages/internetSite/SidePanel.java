package com.homeproject.pages.internetSite;

import com.homeproject.core.BasePage;
import com.homeproject.pages.widgets.SliderPage;
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

    public SidePanel selectMyltipleWindow() {
        click(MultipleWindowButton);
        return this;

    }

    // по тексту
    @FindBy(xpath = "//a[normalize-space()='Nested Frames']")
    WebElement nestedFrames;

    public SidePanel selectNestedFrames() {
        click(nestedFrames);
        return this;
    }

    @FindBy(xpath = "//a[@href='/dropdown']")
    WebElement dropdown;

    public SidePanel clickOnDropDownLink() {
        click(dropdown);
        return this;
    }

    @FindBy(xpath = "//a[normalize-space()='Horizontal Slider']")
    WebElement slider;

    public SliderPage clickOnSlider() {
        click(slider);
        return new SliderPage(driver);
    }
}




