package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //locators
    public WebElement email(WebDriver driver){
        return driver.findElement(By.id("Email"));
    }

    public WebElement password(WebDriver driver){
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']"));
    }

    public WebElement forgotPasswordBtn(WebDriver driver){
        return driver.findElement(By.xpath("//a[text()='Forgot password?']"));
    }

    //actions
    public void performLogin(WebDriver driver, String userName, String password){
        email(driver).clear();
        email(driver).sendKeys(userName);
        password(driver).clear();
        password(driver).sendKeys(password);
        loginBtn(driver).click();
    }
}

