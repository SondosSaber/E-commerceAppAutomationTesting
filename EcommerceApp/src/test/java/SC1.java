import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.id("email_create")).sendKeys("automate@test.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("customer_firstname")).sendKeys("Sondos");
        driver.findElement(By.id("customer_lastname")).sendKeys("Saber");
        driver.findElement(By.id("passwd")).sendKeys("12345");
        driver.findElement(By.id("firstname")).sendKeys("Sondos");
        driver.findElement(By.id("lastname")).sendKeys("Saber");
        driver.findElement(By.id("address1")).sendKeys("Street");
        driver.findElement(By.id("city")).sendKeys("Cairo");
        driver.findElement(By.id("uniform-id_state")).click();
        driver.findElement(By.xpath("//select[@id='id_state']//option[text()='Arizona']")).click();
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("01283919677");
        driver.findElement(By.id("submitAccount")).click();

        driver.quit();
    }
}
