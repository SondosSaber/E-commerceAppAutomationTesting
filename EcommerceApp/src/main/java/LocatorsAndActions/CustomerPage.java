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
    public WebElement addToCartBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']"));
    }
    public WebElement addToWhiteList(WebDriver driver){
        return driver.findElement(By.xpath("//button[@title='Add to wishlist']"));
    }
    public WebElement addToCompareList(WebDriver driver){
        return driver.findElement(By.xpath("//button[@title='Add to compare list']"));
    }

    //actions
    public void searchForProduct(WebDriver driver, String serachedItem){
        searchBox(driver).sendKeys(serachedItem);
        searchBtn(driver).click();
    }

    public void addItemToCart(WebDriver driver){
        addToCartBtn(driver).click();
    }

    public void addItemToWhiteList(WebDriver driver){
        addToWhiteList(driver).click();
    }

    public void addItemToCompareList(WebDriver driver){
        addToCompareList(driver).click();
    }
}
