package PurchaseFeature;

import LocatorsAndActions.CustomerPage;
import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import LocatorsAndActions.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CheckOutItems {
    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CustomerPage customerPage = new CustomerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void searchForProductTest() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.navigateToLoginPage(driver);
        loginPage.performLogin(driver, "sondossaber2495@gmail.com", "123456");
        Thread.sleep(5000);
        customerPage.searchForProduct(driver, "Nokia");
        customerPage.addItemToCart(driver);
        Thread.sleep(6000);
        customerPage.navigateToShoppingCart(driver);
        shoppingCartPage.markChechbox(driver);
        shoppingCartPage.clickOnCheckoutBtn(driver);
        Thread.sleep(6000);


        //assertions
        //driver.findElement(By.xpath("//a[@class='ico-wishlist']"));
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
