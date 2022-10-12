package SearchFeature;

import LocatorsAndActions.CustomerPage;
import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchForProductTest {
    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CustomerPage customerPage = new CustomerPage();

    @Test
    public void searchForProductTest() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.navigateToLoginPage(driver);
        loginPage.performLogin(driver, "sondossaber2495@gmail.com", "123456");
        Thread.sleep(5000);
        customerPage.searchForProduct(driver, "Nokia");
        //assert
        //driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']"))
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
