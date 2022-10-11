package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebElement registerButton(WebDriver driver){
        By register = By.xpath("//a[text()='Register']");
        WebElement registerButton = driver.findElement(register);
        return registerButton;
    }

}
