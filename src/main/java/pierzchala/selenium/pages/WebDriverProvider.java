package pierzchala.selenium.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {

    public static WebDriver getInstance() {

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
