import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static void main(String[] args) {
        //set driver path


        //new object of webdriver
        WebDriver driver = new ChromeDriver();

        //actions
        driver.navigate().to("https://www.saucedemo.com/");
    }
}
