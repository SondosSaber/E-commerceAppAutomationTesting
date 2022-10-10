import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static void main(String[] args) throws InterruptedException {
        //set driver path - set property
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //new object of webdriver
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
