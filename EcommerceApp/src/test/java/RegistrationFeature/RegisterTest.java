package RegistrationFeature;

import Locators.HomePage;
import Locators.RegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {
    WebDriver driver;
    HomePage homePage = new HomePage();
    RegisterationPage registerationPage = new RegisterationPage();
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void registerNewUser() throws InterruptedException {
        homePage.registerButton(driver).click();
        Thread.sleep(3000);
        registerationPage.userNameField(driver).sendKeys("Sondos");
        registerationPage.lastNameField(driver).sendKeys("Saber");
        registerationPage.emailField(driver).sendKeys("automate1@test.com");
        registerationPage.passwordField(driver).sendKeys("123456");
        registerationPage.confirmPasswordField(driver).sendKeys("123456");
        registerationPage.registerButtonConfirmationBtn(driver).click();
        Thread.sleep(3000);

        String actualResult = driver.findElement(By.xpath("//div[@class='result']")).getText();
        String expectedResult ="Your registration completed";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
