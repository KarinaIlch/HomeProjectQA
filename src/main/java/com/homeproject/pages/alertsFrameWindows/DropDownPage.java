package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropDownPage selectSecondOption(String option2) {
        new Select(dropdown).selectByVisibleText(option2);
        return this;
    }

    public DropDownPage verifyAnOption() {
        String secondSelectedOption = new Select(dropdown).getFirstSelectedOption().getText();
        Assertions.assertTrue(shouldHaveText(dropdown, secondSelectedOption, 5));
        return this;
    }
}
