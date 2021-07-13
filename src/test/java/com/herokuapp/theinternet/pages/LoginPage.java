package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
    String PAGE_URL = "https://the-internet.herokuapp.com/login";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(PAGE_URL);
    }


    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//h2[contains(text(),'Login Page')]"));
    }

    public void fillInLogin(String username, String password) {
        // Login page elements operating
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[name=password]"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Sending username and password: tomsmith / SuperSecretPassword!
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Clicking Login button
        loginButton.click();

        // 5 sec waiting
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Verifications
        WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
        assert (logOutButton.isDisplayed());

        String pageSource = driver.getPageSource();
        assert (pageSource.contains("You logged into a secure area!"));


    }


}