package automation_test.mortgage_calculator;

import command_providers.ActOn;
import command_providers.AssertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.DateUtils;
import utilities.ScreenCapture;

public class CalculateMortgageRate {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");

    }


    @Test
    public void calculateMortgageRate(){
        String[] date=DateUtils.returnNextMonth();
       new Home(driver)
               .typeHomePrice("300000")
               .typeDownPayment("60000")
               .typeLoanAmount("240000")
               .typeInterestRate("3")
               .typeLoanTermYears("30")
               .selectMonth(date[0])
               .typeYear(date[1])
               .typePropertyTax("5000")
               .typePMI("0.5")
               .typeHomeOwnerInsurance("1000")
               .typeMonthlyHOA("100")
               .selectLoanType("FHA")
               .selectBuyOrRefinance("Buy")
               .clickOnCalculateButton()
               .validateTotalMonthlyPayment("1,611.85");



    }


    @AfterMethod
    public void closeBrowser(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus())
            ScreenCapture.getScreenShot(driver);

        ActOn.browser(driver).closeBrowser();
    }
}