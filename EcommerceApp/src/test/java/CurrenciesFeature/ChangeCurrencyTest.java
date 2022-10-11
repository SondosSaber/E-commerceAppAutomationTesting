package CurrenciesFeature;

import Locators.HomePage;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangeCurrencyTest {
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
    public void invalidLoginTest() throws InterruptedException {
        homePage.currencyDropDownMenu(driver).click();
        Thread.sleep(3000);
        homePage.euroCurrecny(driver).click();
        //assert
        //driver.findElement(By.xpath("//*[contains(text(),'€')]"))
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
