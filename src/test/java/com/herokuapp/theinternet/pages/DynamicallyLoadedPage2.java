package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DynamicallyLoadedPage2 extends BasePage {
    String PAGE_URL = "https://the-internet.herokuapp.com/dynamic_loading/2";

    public DynamicallyLoadedPage2(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(PAGE_URL);
    }


    public void clickButton() {

        // Clicking start button
        WebElement startButton = driver.findElement(By.xpath("//button"));
        startButton.click();

        // Waiting for Hello World! text
        waitVisibility(By.id("finish"));

        // Verifying Hello World text
        WebElement finishText = driver.findElement(By.id("finish"));
        String text = finishText.getText();
        assert (text.equals("Hello World!"));

    }


}
