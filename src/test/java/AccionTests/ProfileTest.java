package AccionTests;

import ObjectRepository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProfileTest {
    public Logger logger;
    private LandingPageObjects landingPageObjects;
    private DashboardObjects dashboardObjects;
    private RegisterPageObjects registerPageObjects;
    private ProfileObjects profileObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        dashboardObjects = new DashboardObjects(Util.driver);
        profileObjects = new ProfileObjects(Util.driver);
    }

    @Test
    public void aViewProfile() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            profileObjects.ProfileName.isDisplayed();
            Utility.waitForElement(Util.driver, profileObjects.PhoneNo, 5);
            profileObjects.PhoneNo.isDisplayed();
            logger.info("aViewProfile() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void bViewDeviceInfo() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            Utility.waitForElement(Util.driver, profileObjects.DeviceInfo, 5);
            profileObjects.DeviceInfo.click();
            Utility.waitForElement(Util.driver, profileObjects.Model, 15);
            Utility.waitForElement(Util.driver, profileObjects.DeviceId, 10);
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            profileObjects.ProfileName.isDisplayed();
            logger.info("bViewDeviceInfo() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cNewPINMismatch() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            Utility.waitForElement(Util.driver, profileObjects.ChangePINMenu, 5);
            profileObjects.ChangePINMenu.click();
            profileObjects.OldPIN.click();
            profileObjects.OldPIN.sendKeys("1234");
            profileObjects.NewPIN.click();
            profileObjects.NewPIN.sendKeys("4321");
            profileObjects.ConfirmPIN.click();
            profileObjects.ConfirmPIN.sendKeys("1234");
            profileObjects.ChangeButton.click();
            Utility.waitForElement(Util.driver, profileObjects.PINMismatchErrorMsg, 8);
            profileObjects.OK.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            logger.info("cNewPINMismatch() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//confirm this
    @Test
    public void dWrongOldPINChange() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {//this pauses
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            Utility.waitForElement(Util.driver, profileObjects.ChangePINMenu, 5);
            profileObjects.ChangePINMenu.click();
            profileObjects.OldPIN.click();
            profileObjects.OldPIN.sendKeys("5678");
            profileObjects.NewPIN.click();
            profileObjects.NewPIN.sendKeys("4321");
            profileObjects.ConfirmPIN.click();
            profileObjects.ConfirmPIN.sendKeys("4321");
            profileObjects.ChangeButton.click();
            Utility.waitForElement(Util.driver, profileObjects.wrongOldPINMsg, 20);
            profileObjects.OK.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            logger.info("dWrongOldPINChange() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void eChangePINSuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {//pauses here
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            Utility.waitForElement(Util.driver, profileObjects.ChangePINMenu, 5);
            profileObjects.ChangePINMenu.click();
            profileObjects.OldPIN.click();
            profileObjects.OldPIN.sendKeys("1234");
            profileObjects.NewPIN.click();
            profileObjects.NewPIN.sendKeys("4321");
            profileObjects.ConfirmPIN.click();
            profileObjects.ConfirmPIN.sendKeys("4321");
            profileObjects.ChangeButton.click();
            Utility.waitForElement(Util.driver, profileObjects.PINChangedSuccessMsg, 20);
            profileObjects.OK.click();
            logger.info("eChangePINSuccessfully() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    @Test
//    public void fUsingOldPINforTransfer() throws InterruptedException, IOException {
//        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        try {
//            TransferTest transferTest  = new TransferTest();
//            transferTest.eTransferToOwnAccount();
//            logger.info("fUsingOldPINforTransfer() Testcase passed");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    @Test
    public void gChangePwdToPreviousPwd() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            dashboardObjects.ProfileMenu.click();
            Utility.waitForElement(Util.driver, profileObjects.ProfileName, 10);
            Utility.waitForElement(Util.driver, profileObjects.ChangePINMenu, 5);
            profileObjects.ChangePINMenu.click();
            profileObjects.OldPIN.click();
            profileObjects.OldPIN.sendKeys("4321");
            profileObjects.NewPIN.click();
            profileObjects.NewPIN.sendKeys("1234");
            profileObjects.ConfirmPIN.click();
            profileObjects.ConfirmPIN.sendKeys("1234");
            profileObjects.ChangeButton.click();
            Utility.waitForElement(Util.driver, profileObjects.PINChangedSuccessMsg, 20);
            profileObjects.OK.click();
            logger.info("Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //wrongOldPIN

}
