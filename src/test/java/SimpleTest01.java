import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SimpleTest01 {
    String APP_URL = "https://the-internet.herokuapp.com/";
    WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void firstTest(){
        driver.get(APP_URL);

    }

    @Test
    public void secondTest(){
        driver.get(APP_URL);
    }

}
