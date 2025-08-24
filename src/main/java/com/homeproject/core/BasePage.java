package com.homeproject.core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void scrollWithJS(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void  clickWithJS(WebElement element, int x, int y) {
        scrollWithJS(x,y);
        click(element);
    }

    public void click(WebElement element) {
        element.click();
    }
    public boolean containsText(String text, WebElement element) {
        return element.getText().contains(text);
    }

    public void type(WebElement element, String text) {
        if(text !=null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }

    }

    }

