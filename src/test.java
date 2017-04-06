
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Виталий on 23.03.2017.
 */
public class test {

    public WebDriver driver;
    public String baseUrl = "https://vk.com/login?act=mobile&hash=8459106e1a579acb/";


    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl + "/https://vk.com/login?act=mobile&hash=8459106e1a579acb");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("");
        driver.findElement(By.id("quick_email")).clear();
        driver.findElement(By.id("quick_email")).sendKeys("vchubrin@mail.ru");
        driver.findElement(By.id("quick_email")).clear();
        driver.findElement(By.id("quick_email")).sendKeys("vchubrin@mail.ru");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("0936441221v");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("0936441221v");
        driver.findElement(By.id("quick_login_button")).click();
        driver.findElement(By.id("quick_login_button")).click();
        driver.close();
    }

}
