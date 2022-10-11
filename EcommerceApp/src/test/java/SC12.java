import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("sondossaber2495@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("small-searchterms")).sendKeys("nokia");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Search']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("small-searchterms")).sendKeys("samsung");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Search']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']")).click();

        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[@class='cart-label']")).click();
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        Thread.sleep(6000);
//        driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']//option[text()='United States']")).click();
//        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("123456789");
//        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button' and text()='Continue']")).click();

        //Asset
//        driver.findElement(By.xpath("//div[@class='title']/strong[text()='Your order has been successfully processed!']")).

        //        driver.quit();
    }
}
