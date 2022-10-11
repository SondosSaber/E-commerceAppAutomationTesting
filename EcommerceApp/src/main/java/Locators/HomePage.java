package Locators;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomePage {
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
}
