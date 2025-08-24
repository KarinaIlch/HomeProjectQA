package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement alertClick;

    public AlertsPage clickForJsAlert() {
        click(alertClick);
        return this;
    }

    public AlertsPage acceptAlert(String result) {
        if (result != null && result.equals("Close")) {
            driver.switchTo().alert().accept();
    }
        return this;
}

    @FindBy(xpath = "//div[@id='content']/div[@class='example']/p[@id='result']")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assertions.assertTrue(containsText(text,result));
        return this;
    }

    @FindBy(xpath = "//div[@id='content']/div[@class='example']/ul/li[2]/button")
    WebElement confirmButton;

    public AlertsPage clickForJsConfirm() {
        click(confirmButton);
        return this;
    }

    public AlertsPage selectOKConfirmation(String confirmation) {
        if (confirmation != null && confirmation.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirmation != null && confirmation.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//div[@id='content']/div[@class='example']/p[@id='result']")
    WebElement confirmOKResult;


    public AlertsPage verifyOKConfirmation(String text) {
            Assertions.assertTrue(containsText(text, confirmOKResult));
            return this;
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement promtButton;

    public AlertsPage clickForJsPrompt() {
        click(promtButton);
        return this;
    }

    public AlertsPage sendMessageToAlert(String message) {
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//div[@id='content']/div[@class='example']/p[@id='result']")
    WebElement promptResult;

    public AlertsPage verifyMessage(String message) {
        Assertions.assertTrue(containsText(message,promptResult));
        return this;
    }
}

