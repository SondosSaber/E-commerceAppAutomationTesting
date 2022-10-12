package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {

    //locators
    public WebElement userNameField(WebDriver driver){
        return driver.findElement(By.id("FirstName"));
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

    //actions

    public void performRegister (WebDriver driver, String firstName, String lastName, String email, String password,
                                 String confirmedPassword){
        userNameField(driver).sendKeys(firstName);
        lastNameField(driver).sendKeys(lastName);
        emailField(driver).sendKeys(email);
        passwordField(driver).sendKeys(password);
        confirmPasswordField(driver).sendKeys(confirmedPassword);
        registerButtonConfirmationBtn(driver).click();
    }


}
