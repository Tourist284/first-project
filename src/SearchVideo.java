
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
public class SearchVideo {

    public WebDriver driver;
    public String baseUrl = "https://vk.com/login?act=mobile&hash=8459106e1a579acb/";
//  public String getBaseUrl = "https://vk.com/video";


    @Test
    public void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.findElement(By.id("quick_email")).sendKeys("vchubrin@mail.ru");
        driver.findElement(By.id("quick_email")).click();
        driver.findElement(By.id("quick_pass")).sendKeys("0936441221v");
        driver.findElement(By.id("quick_login_button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("l_pr")).findElement(By.xpath("./a")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("video_search_input")).click();
        driver.findElement(By.id("video_search_input")).clear();
        driver.findElement(By.id("video_search_input")).sendKeys("приудацуло");
        driver.findElement(By.id("video_search_input")).clear();
        driver.findElement(By.cssSelector("button.ui_search_button_search._ui_search_button_search")).click();
        driver.findElement(By.id("video_empty_placeholder_search")).click();
        driver.close();







    }




}
