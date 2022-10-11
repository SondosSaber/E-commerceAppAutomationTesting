import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC6 {
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
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Computers ')]")).click();

        //assert
        //driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Computers']"))

        driver.quit();
    }
}
