package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement email(WebDriver driver){
        return driver.findElement(By.id("Email"));
    }

    public WebElement password(WebDriver driver){
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']"));
    }
}
