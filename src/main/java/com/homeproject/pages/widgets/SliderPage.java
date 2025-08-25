package com.homeproject.pages.widgets;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement sliderContainer;

    public SliderPage moveSliderToHorizontalDirection() {
        waitAndScroll(1000, 0, 300);

        actions.dragAndDropBy(sliderContainer, 68, 0).perform();
        return this;
    }

    @FindBy (id = "range")
    WebElement rangeValue;

    public SliderPage verifySliderValue(String value) {
        Assertions.assertEquals(value, rangeValue.getText());
        return this;
    }
}
