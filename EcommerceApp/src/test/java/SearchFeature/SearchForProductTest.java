package SearchFeature;

import Locators.CustomerPage;
import Locators.HomePage;
import Locators.LoginPage;
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
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void searchForProductTest() throws InterruptedException {
        homePage.loginButton(driver).click();
        loginPage.email(driver).sendKeys("sondossaber2495@gmail.com");
        loginPage.password(driver).sendKeys("123456");
        loginPage.loginBtn(driver).click();
        Thread.sleep(5000);
        customerPage.searchBox(driver).sendKeys("nokia");
        customerPage.searchBtn(driver).click();

        //assert
        //driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']"))
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
