package com.herokuapp.theinternet.tests.testSuite01;

import com.herokuapp.theinternet.tests.BaseTest;
import org.junit.jupiter.api.Test;

public class DynamicallyLoadedPage2Test extends BaseTest {

    @Test
    public void dynamicallyLoadedPage2Test() {
        dynamicallyLoadedPage2.goTo();
        dynamicallyLoadedPage2.clickButton();
    }


}
