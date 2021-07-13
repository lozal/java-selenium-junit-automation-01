package com.herokuapp.theinternet.tests;

import com.herokuapp.theinternet.pages.DynamicallyLoadedPage2;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public Main main;
    public LoginPage loginPage;
    public DynamicallyLoadedPage2 dynamicallyLoadedPage2;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dynamicallyLoadedPage2 = PageFactory.initElements(driver, DynamicallyLoadedPage2.class);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
