import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC4{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("automate@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
        driver.findElement(By.id("small-searchterms")).sendKeys("nokia");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Search']")).click();

        //assert
        //driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']"))

        driver.quit();
    }
}