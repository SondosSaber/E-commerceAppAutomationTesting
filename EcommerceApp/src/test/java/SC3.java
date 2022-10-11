import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("automate@test.com");
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        driver.findElement(By.id("//input[@id='Email']")).sendKeys("automate@test.com");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Recover']")).click();

        //assert
        //driver.findElement(By.xpath("p[@class='content' and text()='Email with instructions has been sent to you.']"))

        driver.quit();
    }
}
