package RegistrationFeature;

import LocatorsAndActions.HomePage;
import LocatorsAndActions.RegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {
    WebDriver driver;
    HomePage homePage = new HomePage();
    RegisterationPage registerationPage = new RegisterationPage();
    @Test
    public void registerNewUser() throws InterruptedException {
        homePage.openBrowser(driver);
        homePage.navigateToRegisterPage(driver);
        Thread.sleep(3000);
        registerationPage.performRegister(driver, "Sondos", "Saber", "automate1@test.com",
                "123456", "123456");
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
