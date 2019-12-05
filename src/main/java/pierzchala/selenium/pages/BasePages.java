package pierzchala.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// ta klase beda dziedziczyć wszystkie klasy stron, extends
public class BasePages {

    public void basePage() {
        PageFactory.initElements(WebDriverSingleton.getInstance(),this);

        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

    }
}
