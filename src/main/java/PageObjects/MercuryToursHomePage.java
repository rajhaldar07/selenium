package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursHomePage {


    @FindBy(xpath = "//a[text()='Home']")
    public WebElement home;


}
