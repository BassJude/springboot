package pierzchala.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Selenium1 {
    private WebDriver driver;
    String url="";
    String user;
    String password;


    @Before
    public void setUp() {
        File file = new File("E:\\geckodriver.exe");
        System.out.println(file.exists());

        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");

        driver = new FirefoxDriver();
        url = "http://www.ameliaweb.pl/gifts/registration";
        user = "adam";
        password = "123456";
    }

//    @After
//    public void applicationDown(){
//        driver.close();
//        driver.quit();
//    }

    @Test
    public void login() {

        driver.get(url);
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys(user);

//        driver.findElement(By.xpath("//button.btn")).click();
        WebElement submit = driver.findElement(By.cssSelector("button.btn"));
        submit.click();

    }
}
