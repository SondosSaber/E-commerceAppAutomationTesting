import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC12 {
    public static void main(String[] args) throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']")).click();

        //Asset
//        driver.findElement(By.xpath("//div[@class='title']/strong[text()='Your order has been successfully processed!']")).

        //        driver.quit();
    }
}
