package com.demo.nopcommerce.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
    WebDriver driver;

    public Utility(WebDriver driver){
        this.driver = driver;

    }

    public WebElement getElement(By locator){
        WebElement element = driver.findElement(locator);
        return element;
    }
    public void doClick(By locator){
        getElement(locator).click();
    }
    public void doSendKey(By locator, String value){
        getElement(locator).sendKeys(value);
    }
    public String waitForTitlePresent(int timeOut, String titleValue){
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.titleIs(titleValue));
        return driver.getTitle();
    }
}
