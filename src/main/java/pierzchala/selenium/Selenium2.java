package pierzchala.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pierzchala.selenium.pages.WebDriverProvider;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium2 {

    private WebDriver driver;
    private final String url = "http://automationpractice.com/index.php";
    WebDriverWait wait;

    @Test
    public void setUp() throws InterruptedException {
        driver = WebDriverProvider.getInstance();

//        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
//        driver = new FirefoxDriver();

        driver.get("https://www.google.pl/");
        // czekamy aż strona się załaduje, uzywamy raz globalnie
        // Od tej pory każde wywołanie metody findElement(By by), będzie miało zaszyty timeout, ale tylko findElement !!!
        // dziala ogólnie na elementy
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);

    }
}
