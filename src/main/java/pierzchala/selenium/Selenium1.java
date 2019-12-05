package pierzchala.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Selenium1 {
    private WebDriver driver;
    WebDriverWait wait;
    private final String url = "http://automationpractice.com/index.php";


// quiit zamyka przeglądarke, close zamyka okno, manage zawiera kolejny pakiet opcji

    @Before
    public void setUp() {
        File file = new File("E:\\geckodriver.exe");
        System.out.println(file.exists());

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


    @Test
    public void test() throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title=\"Log in to your customer account\"]")));
        driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys("bass@bass.pl");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#id_gender1")));
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Adam");
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Kaka");
//        driver.findElement(By.cssSelector("#email")).sendKeys("bass@bass.pl");
        // klikamy i spowdziewamy sie bledu walidacji
        driver.findElement(By.cssSelector("#submitAccount")).click();

        Thread.sleep(5000);
        // czy jest wyswietlony blad
        boolean idAlertDisplayed = driver.findElement(By.className("alert")).isDisplayed();
        Assert.assertTrue(idAlertDisplayed);


    }

    //    @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }



    public void test2() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.navigate().to(url);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#identifierId")));
        WebElement emailField = driver.findElement(By.cssSelector("#identifierId"));
        emailField.clear();
        emailField.sendKeys("emailAddress");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#identifierNext")));
        WebElement nextButton = driver.findElement(By.cssSelector("#identifierNext"));
        nextButton.click();
//        try {
//            wait.until(ExpectedConditions.textToBe(By.cssSelector("#profileIdentifier"), "emailAddress"));
//        } catch (TimeoutException e) {
//            throw new AssertionFailedError("The email address displayed was different than expected. " + e.getMessage());
//        }

        // inaczej
//        wait.Until(d => driver.FindElement(By.CssSelector("#product")).Displayed);

    }

    //do pom xml -> webdriver manager -> java faker, junit
    // page factory
}
