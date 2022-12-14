package LoginFeature;

import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidLoginTest {

    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void validLoginTest() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.navigateToLoginPage(driver);
        loginPage.performLogin(driver, "sondossaber2495@gmail.com", "123456");

        //assert
        driver.findElement(By.xpath("//a[@class='ico-logout']")).isEnabled();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
