package LoginFeature;

import Locators.ForgetPasswordPage;
import Locators.HomePage;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidLoginTest {

    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void invalidLoginTest() throws InterruptedException {
        homePage.loginButton(driver).click();
        loginPage.email(driver).sendKeys("automate@test.com");
        loginPage.forgotPasswordBtn(driver).click();

        Thread.sleep(3000);

        forgetPasswordPage.emailRecovery(driver).sendKeys("automate@test.com");
        forgetPasswordPage.recoverBtn(driver).click();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
