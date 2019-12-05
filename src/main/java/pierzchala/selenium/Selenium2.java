package pierzchala.selenium;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pierzchala.selenium.pages.WebDriverSingleton;

import java.util.concurrent.TimeUnit;

public class Selenium2 {

    private WebDriver driver;
    private final String url = "http://automationpractice.com/index.php";
    WebDriverWait wait;

    @Before
    public void setUp() {
        driver = WebDriverSingleton.getInstance();

        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get(url);
        // czekamy aż strona się załaduje, uzywamy raz globalnie
        // Od tej pory każde wywołanie metody findElement(By by), będzie miało zaszyty timeout, ale tylko findElement !!!
        // dziala ogólnie na elementy
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);

    }
}
