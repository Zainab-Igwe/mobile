package AccionTests;

import ObjectRepository.DashboardObjects;
import ObjectRepository.PaymentObjects;
import ObjectRepository.TransferObjects;
import ObjectRepository.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PaymentTest {
    public Logger logger;
    private DashboardObjects dashboardObjects;
    private TransferObjects transferObjects;
    private PaymentObjects paymentObjects;


    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
        transferObjects = new TransferObjects(Util.driver);
        paymentObjects = new PaymentObjects(Util.driver);

    }

    @Test
    public void aSendAirtimeAddBcySuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.AirtimeTab, 15);
            paymentObjects.MTN.click();
            Utility.waitForElement(Util.driver, paymentObjects.MTNProductName, 15);
            paymentObjects.MTNProductName.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.scrollToAmount.click();
            paymentObjects.Amount.sendKeys("10.00");
            paymentObjects.scrollToPhoneNo.click();
            paymentObjects.PhoneNo.sendKeys("07065729929");
            paymentObjects.scrollToConfirm.click();
//            paymentObjects.confirmButton.click();
            paymentObjects.ToggleON.click();
            Utility.waitForElement(Util.driver, paymentObjects.BCYName, 15);
            paymentObjects.BCYName.sendKeys("Test");
            paymentObjects.scrollToConfirm.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForAlertClickElement(Util.driver, paymentObjects.AirtimeSuccessMsg, paymentObjects.closeButton);
            //confirm BCY was added
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.AirtimeTab, 15);
            paymentObjects.MTN.click();
            Utility.waitForElement(Util.driver, paymentObjects.MTNProductName, 15);
            paymentObjects.MTNProductName.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.ChooseBeneficiary.click();
            Utility.waitForElement(Util.driver, paymentObjects.selectBCY, 15);
            Utility.waitForElement(Util.driver, paymentObjects.addedBCYName, 15);
            Utility.waitForElement(Util.driver, paymentObjects.BCYPhoneNo, 15);
            //using TapWithCoord to tap close button
            Utility.tapUsingCoordinates(Util.driver, 1400, 440);
            logger.info("Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void bDeleteBcySuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.AirtimeTab, 15);
            paymentObjects.MTN.click();
            Utility.waitForElement(Util.driver, paymentObjects.MTNProductName, 15);
            paymentObjects.MTNProductName.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.ChooseBeneficiary.click();
            Utility.waitForElement(Util.driver, paymentObjects.selectBCY, 15);
            Utility.waitForElement(Util.driver, paymentObjects.addedBCYName, 15);
            Utility.tapUsingCoordinates(Util.driver, 1400, 1250); //tapUsingcoordforDeleButt
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForElement(Util.driver, paymentObjects.selectBCY, 15);
            Utility.tapUsingCoordinates(Util.driver, 1400, 440);
            logger.info("Testcase passed");

        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }

    @Test
    public void cSendAirtimeOnly() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.AirtimeTab, 15);
            paymentObjects.MTN.click();
            Utility.waitForElement(Util.driver, paymentObjects.MTNProductName, 15);
            paymentObjects.MTNProductName.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.scrollToAmount.click();
            paymentObjects.Amount.sendKeys("10.00");
            paymentObjects.scrollToPhoneNo.click();
            paymentObjects.PhoneNo.sendKeys("08030583962");
            paymentObjects.scrollToConfirm.click();
            Utility.waitForElement(Util.driver, paymentObjects.ToggleON, 10);
            paymentObjects.scrollToConfirm.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForAlertClickElement(Util.driver, paymentObjects.AirtimeSuccessMsg, paymentObjects.closeButton);

            logger.info("Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void dAddBCY_BillPayment() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.BillPaymentTab, 15);
            paymentObjects.CableTV.click();
            Utility.waitForElement(Util.driver, paymentObjects.DSTV, 15);
            paymentObjects.DSTV.click();
            Utility.waitForElement(Util.driver, paymentObjects.SelectProduct, 15);
            Utility.waitForElement(Util.driver, paymentObjects.Access, 15);
            paymentObjects.Access.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.scrollToAmount.click();
            paymentObjects.Amount.sendKeys("2000.00");
            paymentObjects.scrollToSmartCardNo.click();
            paymentObjects.scrollToSmartCardNo.sendKeys("0000000001");
            paymentObjects.scrollToConfirm.click();
            Utility.waitForElement(Util.driver, paymentObjects.confirmButton, 60);
            paymentObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            //work on this and confirm BCY added
            Utility.waitForAlertClickElement(Util.driver, paymentObjects.AirtimeSuccessMsg, paymentObjects.closeButton);

            logger.info("Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void dDoBillPaymentSuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.paymentMenu, 120);
            dashboardObjects.paymentMenu.click();
            paymentObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, paymentObjects.Category, 15);
            Utility.waitForElement(Util.driver, paymentObjects.BillPaymentTab, 15);
            paymentObjects.CableTV.click();
            Utility.waitForElement(Util.driver, paymentObjects.DSTV, 15);
            paymentObjects.DSTV.click();
            Utility.waitForElement(Util.driver, paymentObjects.SelectProduct, 15);
            Utility.waitForElement(Util.driver, paymentObjects.Access, 15);
            paymentObjects.Access.click();
            Utility.waitForElement(Util.driver, paymentObjects.ChooseBeneficiary, 15);
            paymentObjects.scrollToAmount.click();
            paymentObjects.Amount.sendKeys("2000.00");
            paymentObjects.scrollToSmartCardNo.click();
            paymentObjects.scrollToSmartCardNo.sendKeys("0000000001");
            paymentObjects.scrollToConfirm.click();
            Utility.waitForElement(Util.driver, paymentObjects.confirmButton, 60);
            paymentObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            //work on this
            Utility.waitForAlertClickElement(Util.driver, paymentObjects.AirtimeSuccessMsg, paymentObjects.closeButton);

            logger.info("Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}


