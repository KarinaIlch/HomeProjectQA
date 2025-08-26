package com.homeproject.pages.alertsFrameWindows;

import com.homeproject.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "hot-spot")
    WebElement hotspot;

    @FindBy(css = "h1.heading")
    WebElement heading;

    public ContextMenuPage firstRightClickAndGoHome() {
        // Прокручуємо до елемента, щоб він був у полі зору
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hotspot);

        // Правий клік по елементу
        new Actions(driver).contextClick(hotspot).perform();

        // Чекаємо появи alert і закриваємо його
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        // Повертаємося на головну
        driver.navigate().to("https://the-internet.herokuapp.com/");

        // Перевіряємо, що головна сторінка відображена
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(heading));
        Assertions.assertEquals("Welcome to the-internet", heading.getText());

        return this;
    }
}

//  firstRightClickOnTheElement() - метод

////   @FindBy(id = "hot-spot")
////   WebElement hotspot;

////   public ContextMenuPage firstRightClickOnTheElement() {
////       actions.contextClick(hotspot).perform();
////
////       new WebDriverWait(driver, Duration.ofSeconds(5))
////               .until(ExpectedConditions.alertIsPresent());
////       driver.switchTo().alert().accept();
////
////       actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
////       return this;

//  verifyBackToTheMainPage - метод

////  @FindBy(css = "h1.heading")
////  WebElement heading;
////
////  public ContextMenuPage verifyBackToTheMainPage(String expected) {
////      new WebDriverWait(driver, Duration.ofSeconds(5))
////              .until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/"));
////      new WebDriverWait(driver, Duration.ofSeconds(5))
////              .until(ExpectedConditions.visibilityOf(heading));
////      Assertions.assertEquals(expected, heading.getText());
////      return this;

