package LoginFeature;

import LocatorsAndActions.ForgetPasswordPage;
import LocatorsAndActions.HomePage;
import LocatorsAndActions.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RestPasswordTest {

    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

    @Test
    public void restPasswordTest() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.navigateToLoginPage(driver);
        loginPage.performLogin(driver, "sondossaber2495@gmail.com", "123456");
        Thread.sleep(3000);
        forgetPasswordPage.resetPassword(driver, "automate@test.com");
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
