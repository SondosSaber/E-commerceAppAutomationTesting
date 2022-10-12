package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    //locators
    public WebElement registerButton(WebDriver driver){
        By register = By.xpath("//a[text()='Register']");
        WebElement registerButton = driver.findElement(register);
        return registerButton;
    }

    public WebElement loginButton(WebDriver driver){
        return driver.findElement(By.xpath("//a[text()='Log in']"));
    }

    public WebElement currencyDropDownMenu(WebDriver driver){
        return driver.findElement(By.id("customerCurrency"));
    }

    public WebElement euroCurrecny(WebDriver driver){
        return driver.findElement(By.xpath("//option[contains(text(),'Euro')"));
    }

    public WebElement computerCategory(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']"));
    }

    public WebElement computeSubcategory(WebDriver driver){
        return driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Computers ')]"));
    }


    //actions
    public void openBrowser(WebDriver driver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    public void navigateToRegisterPage(WebDriver driver){
        registerButton(driver).click();
    }
    public void navigateToLoginPage(WebDriver driver){
        loginButton(driver).click();
    }
    public void changeCurrency (WebDriver driver) throws InterruptedException {
        currencyDropDownMenu(driver).click();
        Thread.sleep(3000);
        euroCurrecny(driver).click();
    }

    public void navigateToComputerCategory(WebDriver driver){
        computerCategory(driver).click();
        computeSubcategory(driver).click();
    }
}
