
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.View;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Виталий on 23.03.2017.
 */
public class Editvk {

    public WebDriver driver;
    public String baseUrl = "https://vk.com/login?act=mobile&hash=8459106e1a579acb/";


    @Test
    public void main() throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl + "/https://vk.com/login?act=mobile&hash=8459106e1a579acb");
        driver.findElement(By.id("quick_email")).sendKeys("vchubrin@mail.ru");
        driver.findElement(By.id("quick_email")).clear();
        driver.findElement(By.id("quick_email")).sendKeys("vchubrin@mail.ru");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("0936441221v");
        driver.findElement(By.id("quick_pass")).clear();
        driver.findElement(By.id("quick_pass")).sendKeys("0936441221v");
        driver.findElement(By.id("quick_login_button")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("l_vid")).findElement(By.xpath("./a")).click();

        driver.findElement(By.cssSelector("div.top_profile_name")).click();
        driver.findElement(By.id("top_edit_link")).click();
        driver.findElement(By.id("pedit_first_name")).clear();
        driver.findElement(By.id("pedit_first_name")).sendKeys("wasf");
        driver.findElement(By.id("pedit_first_name")).clear();
        driver.findElement(By.id("pedit_first_name")).sendKeys("wasf");
        driver.close();






    }




}
