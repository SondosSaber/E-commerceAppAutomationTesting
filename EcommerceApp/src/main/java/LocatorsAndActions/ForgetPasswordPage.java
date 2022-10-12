package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {

    //locators
    public WebElement emailRecovery(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='Email']"));
    }

    public WebElement recoverBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Recover']"));
    }

    //actions
    public void resetPassword(WebDriver driver, String email){
        emailRecovery(driver).clear();
        emailRecovery(driver).sendKeys(email);
        emailRecovery(driver).click();
    }
}
