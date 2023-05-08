package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealApr extends NavigationBar {

    private final By CalculatorTab=By.xpath("//Label[text()='Calculator']");
    private final By HomePriceInputField=By.name("HomeValue");
    private final By DownPaymentInputField=By.name("DownPayment");
    private final By DownPaymentInDollar=By.name("DownPaymentSel");
    private final By interestInputFiled=By.name("Interest");
    private final By CalculateButton=By.name("calculate");
    private final By ActualAprRate=By.xpath("//*[text()='3.130%']");

    public static final Logger LOGGER= LogManager.getLogger(RealApr.class);
    public RealApr(WebDriver driver){ super (driver);}


    public RealApr waitForPgwToLoad(){
        LOGGER.debug("waiting for the page to load");
        ActOn.wait(driver,CalculatorTab).waitForElementsToBeVisible();
        return this;
    }
    public RealApr typeHomePrice(String value){
        LOGGER.debug("Typing Home Value:"+ value);
        ActOn.element(driver,HomePriceInputField).setValue(value);
        return this;}

    public RealApr selectDownPaymentInDollar() {
        LOGGER.debug("Clicking on the $ as downpayment");
        ActOn.element(driver, DownPaymentInDollar).click();
        return this;
    }

      public RealApr typeDownPayment(String value) {
          LOGGER.debug("Type Down Payment value");
          ActOn.element(driver, DownPaymentInputField).setValue(value);
          return this;
      }

      public RealApr typeInterestRate(String value) {
          LOGGER.debug("Typing Interest Rate Value:" + value);
          ActOn.element(driver, interestInputFiled).setValue(value);
          return this;
      }

      public RealApr clickOnCalculateButton() {
          LOGGER.debug("Click on the calculate button");
          ActOn.element(driver, CalculateButton).click();
          return this;
      }

      public RealApr validateRealAprRate(String expectedValue){
        LOGGER.debug("validate the Real APR rate is:"+ expectedValue);
        String actualRealAprRate=ActOn.element(driver,ActualAprRate).gettextValue();
          Assert.assertEquals(actualRealAprRate,expectedValue);
          return this;



    }







}
