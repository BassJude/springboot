package pierzchala.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePages {

    @FindBy(id = "cos_tam")
    private String name;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
