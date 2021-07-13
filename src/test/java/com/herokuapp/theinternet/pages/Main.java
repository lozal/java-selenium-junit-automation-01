package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String APP_URL = "https://the-internet.herokuapp.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(APP_URL);
    }


    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//h1[contains(text(),'Welcome to the-internet')]"));
    }

}
