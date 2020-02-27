package kalk;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class kalku {
    WebDriver driver;

    @Before
    public  void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kwiks\\IdeaProjects\\Selenium1\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
}
