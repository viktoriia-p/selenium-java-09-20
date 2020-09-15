package selenium.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SecondTest {

    WebDriver drv;


    @BeforeEach
    void setUp() {
        WebDriverManager.firefoxdriver().setup();
        drv = new FirefoxDriver();
    }


    @AfterEach
    void tearDown() {
        drv.quit();
    }

    @Test
    void myTest1() {
        drv.get("http://google.com");
        drv.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }







}
