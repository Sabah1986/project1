package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.ScreenCapture;

public class CalculateRealAprRate{

    private final By RatesLink=By.linkText("Rates");
    private final By RealAprLink= By.linkText("Real APR");
    private final By CalculatorTab=By.xpath("//Label[text()='Calculator']");
    private final By HomePriceInputField=By.name("HomeValue");
    private final By DownPaymentInputField=By.name("DownPayment");
    private final By DownPaymentInDollar=By.name("DownPaymentSel");
    private final By interestInputFiled=By.name("Interest");
    private final By CalculateButton=By.name("calculate");
    private final By ActualAprRate=By.xpath("//*[text()='3.130%']");

WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }


        @Test
       public void calculateRealApr(){
        new Home (driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPgwToLoad()
                .typeHomePrice("200000")
                .selectDownPaymentInDollar()
                .typeDownPayment("15000")
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");

        }

     @AfterMethod
    public void closeBrowser(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            ScreenCapture.getScreenShot((driver));
        }
        ActOn.browser(driver).closeBrowser();
     }
}