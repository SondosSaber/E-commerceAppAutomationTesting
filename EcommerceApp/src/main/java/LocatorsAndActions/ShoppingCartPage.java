package LocatorsAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

    //elements
    public WebElement checkbox(WebDriver driver){
        return  driver.findElement(By.xpath("//input[@id='termsofservice']"));
    }

    public WebElement checkoutItesms(WebDriver driver){
        return driver.findElement(By.xpath("//button[@id='checkout']"));
    }
    public WebElement continueNameBtn(WebDriver driver){
        return driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='butt0on-1 new-address-next-step-button' and text()='Continue']"));
    }
    public WebElement continueShippingBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
    public WebElement continueMethodBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
    }
    public WebElement continuePaymentBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    }
    public WebElement continueConfirmationBtn(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
    }

    //actions
    public void markChechbox(WebDriver driver){
        checkbox(driver).click();
    }

    public void clickOnCheckoutBtn(WebDriver driver){
        checkoutItesms(driver).click();
    }

    public void completePurchaseFloe(WebDriver driver) throws InterruptedException {
        continueNameBtn(driver).click();
        Thread.sleep(3000);
        continueShippingBtn(driver).click();
        Thread.sleep(3000);
        continueMethodBtn(driver).click();
        Thread.sleep(3000);
        continuePaymentBtn(driver).click();
        Thread.sleep(3000);
        continueConfirmationBtn(driver).click();
    }
}
