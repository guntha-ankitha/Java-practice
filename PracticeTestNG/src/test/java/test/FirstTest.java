package test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class FirstTest {
    @Test
    public void testGoogle() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eventhub.rahulshettyacademy.com/login");
        String expectedTitle = "EventHub — Discover & Book Events";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        driver.quit();
    }

    @Test
    public void testFacebook() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("gunthaankitha24@gmail.com", Keys.ENTER);
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(4000);
        driver.quit();

    }
}

