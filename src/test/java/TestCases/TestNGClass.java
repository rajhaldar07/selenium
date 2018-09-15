package TestCases;

import PageObjects.MercuryToursHomePage;
import com.sun.media.jfxmedia.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClass {

    WebDriver driver;

    @Test(priority = 1)
    public void loginApplication(){

        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("/mercurywelcome.php"));
        Logger.logMsg(1,"\"This is my first login application test\"");
        MercuryToursHomePage mtHome = new MercuryToursHomePage();
        mtHome.userName.sendKeys("tutorial");
        mtHome.password.sendKeys("tutorial");
        mtHome.loginButton.click();
        driver.quit();

    }

}
