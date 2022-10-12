package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {

    //locators
    public WebElement searchBox (WebDriver driver){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBtn (WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit' and text()='Search']"));
    }

    //actions
    public void searchForProduct(WebDriver driver, String serachedItem){
        searchBox(driver).sendKeys(serachedItem);
        searchBtn(driver).click();
    }
}
