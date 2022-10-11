package RegistrationFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {
    WebDriver driver;

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
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("FirstName")).sendKeys("Sondos");
        driver.findElement(By.id("LastName")).sendKeys("Saber");
        driver.findElement(By.id("Email")).sendKeys("automate1@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();
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
