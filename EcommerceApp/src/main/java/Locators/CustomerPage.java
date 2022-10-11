package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {
    public WebElement searchBox (WebDriver driver){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBtn (WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Search']"));
    }
}
