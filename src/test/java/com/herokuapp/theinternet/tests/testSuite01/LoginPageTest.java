package com.herokuapp.theinternet.tests.testSuite01;

import com.herokuapp.theinternet.tests.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTest(){
        loginPage.goTo();
        loginPage.checkPageIsCorrect();
        loginPage.fillInLogin("tomsmith", "SuperSecretPassword!");
    }


}