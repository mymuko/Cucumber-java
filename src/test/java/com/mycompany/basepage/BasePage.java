
package com.mycompany.basepage;

import com.mycompany.infrastructure.Setup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
    protected static final String LOGIN_PAGE_URL = "https://facebook.com";

    protected WebDriver driver;

    private final static int TIME_OUT = 5;

    public BasePage() {
        this.driver = Setup.driver;
    }

    public void fillFormInput(String selector, String inputValue) {

        WebElement webElement = this.driver.findElement(By.xpath(selector));
        webElement.click();
        webElement.clear();
        webElement.sendKeys(inputValue);
    }

    public void pressButton(String selector) {

        WebElement webElement = this.driver.findElement(By.xpath(selector));
        webElement.click();

    }
    public void checkTitle(String title) {
        String displayedTitle = driver.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                title.equals(displayedTitle));
    }
    
}
