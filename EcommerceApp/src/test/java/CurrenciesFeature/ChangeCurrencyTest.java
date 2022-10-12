package CurrenciesFeature;

import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangeCurrencyTest {
    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void invalidLoginTest() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.changeCurrency(driver);
        Thread.sleep(3000);
        //assert
        //driver.findElement(By.xpath("//*[contains(text(),'€')]"))
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
