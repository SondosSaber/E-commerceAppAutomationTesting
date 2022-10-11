package CategoriesFeature;

import Locators.HomePage;
import Locators.LoginPage;
import Locators.RegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectCategoryTest {
    WebDriver driver;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void selectCategories() throws InterruptedException {
        homePage.loginButton(driver).click();
        loginPage.email(driver).sendKeys("sondossaber2495@gmail.com");
        loginPage.password(driver).sendKeys("123456");
        loginPage.loginBtn(driver).click();
        Thread.sleep(5000);

        homePage.computerCategory(driver).click();
        homePage.computeSubcategory(driver).click();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
