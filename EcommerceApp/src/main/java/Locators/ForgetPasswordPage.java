package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {
    public WebElement emailRecovery(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='Email']"));
    }

    public WebElement recoverBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Recover']"));
    }
}
