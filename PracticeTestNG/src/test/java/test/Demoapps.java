package test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demoapps {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void Testfield() {
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    }

    @Test(priority = 2)
    public void LoginDetails() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name"))
        );

        name.sendKeys("Ankitha");

        driver.findElement(By.id("email")).sendKeys("Ankitha@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Ankitha@123");
        driver.findElement(By.xpath("//button[text()='Register']")).click();
    }
    @Test(priority =3)
    public void ButtonLink(){
        driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
    }
    @Test(priority = 4)
     public void Check() throws InterruptedException {
         driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
         Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Yes']")).click();
    }
    @AfterMethod
 public void tearDown() {
        driver.quit();

    }

}
