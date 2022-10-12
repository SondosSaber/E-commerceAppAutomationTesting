package PurchaseFeature;

import LocatorsAndActions.CustomerPage;
import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CheckOutItems {
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
        customerPage.addToCartBtn(driver);
        Thread.sleep(6000);
        customerPage.navigateToShoppingCart(driver);



        //assertions
        //driver.findElement(By.xpath("//a[@class='ico-wishlist']"));
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
