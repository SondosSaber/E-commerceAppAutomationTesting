import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Register']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("FirstName")).sendKeys("Sondos");
        driver.findElement(By.id("LastName")).sendKeys("Saber");
        driver.findElement(By.id("Email")).sendKeys("automate@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();

        //assert
        //driver.findElement(By.xpath("//div[@class='result' and text()='Your registration completed']"))



        driver.quit();
    }
}
