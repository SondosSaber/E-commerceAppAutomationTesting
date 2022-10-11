package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {
    public WebElement userNameField(WebDriver driver){
        WebElement firstNameEle = driver.findElement(By.id("FirstName"));
        return firstNameEle;
    }

    public WebElement lastNameField(WebDriver driver){
        WebElement lastNameEle = driver.findElement(By.id("LastName"));
        return lastNameEle;
    }

    public WebElement emailField(WebDriver driver){
        WebElement emailEle = driver.findElement(By.id("Email"));
        return emailEle;
    }

    public WebElement passwordField(WebDriver driver){
        WebElement passwordEle = driver.findElement(By.id("Password"));
        return passwordEle;
    }

    public WebElement confirmPasswordField(WebDriver driver){
        WebElement confirmPasswordEle = driver.findElement(By.id("ConfirmPassword"));
        return confirmPasswordEle;
    }

    public WebElement registerButtonConfirmationBtn(WebDriver driver){
        WebElement registerButtonConfirmationEle = driver.findElement(By.id("register-button"));
        return registerButtonConfirmationEle;
    }
}
