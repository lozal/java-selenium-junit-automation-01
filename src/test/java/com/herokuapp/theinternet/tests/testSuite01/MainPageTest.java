package com.herokuapp.theinternet.tests.testSuite01;

import com.herokuapp.theinternet.tests.BaseTest;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseTest {

    @Test
    public void mainPageTest() {
        main.goTo();
        main.checkPageIsCorrect();
    }


}
