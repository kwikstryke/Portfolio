import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @Before
    public  void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kwiks\\IdeaProjects\\Selenium1\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();



    }
    @Test
public  void  UserRegistrationWithValidData() throws InterruptedException {
        driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("email_create")).sendKeys("TestowrerMail@testowy.com");
        Thread.sleep(2000);
        WebElement EmailClick = driver.findElement(By.id("SubmitCreate"));
        EmailClick.click();
        Thread.sleep(2000);
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(500);
        driver.findElement(By.id("customer_firstname")).sendKeys("fggfdg");
        Thread.sleep(500);
        driver.findElement(By.id("customer_lastname")).sendKeys("fgfdhdfh");
        Thread.sleep(500);
        driver.findElement(By.id("passwd")).sendKeys("12345");
        Thread.sleep(500);
        driver.findElement(By.id("months")).sendKeys("9");
        Thread.sleep(500);
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(500);
        Boolean IsAlertDisplayed = driver.findElement(By.className("alert")).isDisplayed();
        Assert.assertTrue(IsAlertDisplayed);
        Thread.sleep(500);





    };
    @After
    public void TearDown (){
        driver.quit();
    }
}
