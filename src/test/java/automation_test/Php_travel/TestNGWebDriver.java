package automation_test.Php_travel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ScreenCapture;

public class TestNGWebDriver {
WebDriver driver;

@BeforeMethod
   public void browserInitializing(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options=new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(options);
    driver.get("https://phptravels.com/demo/");
     }

    @Test
     public void verifyHomePageTitle(){
    String expectedTitle="Book Your Free Demo Now - Phptravels";
    String actualTitle=driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);
     ScreenCapture.getScreenShot(driver);




    }
    @AfterMethod
    public void browserCleanup(){
    driver.quit();
    }

   }
























