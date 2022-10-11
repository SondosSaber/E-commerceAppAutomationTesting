import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC9 {
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
        //assert
        //driver.findElement(By.xpath("//p[@class='content' and text()='The product has been added to your ']"))
        Thread.sleep(3000);
        driver.findElement(By.id("small-searchterms")).sendKeys("samsung");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Search']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']")).click();
        //driver.findElement(By.xpath("//p[@class='content' and text()='The product has been added to your ']"))

        driver.quit();
    }
}
