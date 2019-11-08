package AccionTests;

import ObjectRepository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UnlinkDeviceTest {

    public Logger logger;
    private LandingPageObjects landingPageObjects;
    private DashboardObjects dashboardObjects;
    private RegisterPageObjects registerPageObjects;
    private UnlinkDeviceObjects unlinkDeviceObjects;
    private LogoutTest logoutTest;
    private MoreObjects moreObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        landingPageObjects = new LandingPageObjects(Util.driver); //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
        unlinkDeviceObjects = new UnlinkDeviceObjects(Util.driver);
        moreObjects = new MoreObjects(Util.driver);

    }

    @Test(priority = 1)
    public void UnlinkUsingWrongAcctNo() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkUsingWrongAcctNo()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("1234567890");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("12345658");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, landingPageObjects.invalidUsernameErrorMsg, 60);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
//            logger.info("Testcase UnlinkUsingWrongAcctNo() passed");
            System.out.println("Testcase: UnlinkUsingWrongAcctNo() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 2)
    public void UnlinkUsingWrongPwd() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkUsingWrongPwd()");


        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("12345658");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, landingPageObjects.wrongPasswordErrorMsg, 60);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            logger.info("Testcase UnlinkUsingWrongPwd() passed");
            System.out.println("Testcase: UnlinkUsingWrongPwd() passed");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 3)
    public void UnlinkUsingWrongOTP() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkUsingWrongOTP()");


        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.clear();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("12000");
            unlinkDeviceObjects.UnlinkDeviceBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.wrongOTPErrorMsg, 45);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 45);
            logger.info("Testcase UnlinkUsingWrongOTP()passed");
            System.out.println("Testcase: UnlinkUsingWrongOTP() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

//    @Test(priority = 4)
//    public void UnlinkAcctA() throws InterruptedException, IOException {
//        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println("Starting Testcase: UnlinkAcctA()");
//
//        try {
//            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
//            landingPageObjects.Login.click();
//            landingPageObjects.UnlinkDevice.click();
//            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
//            unlinkDeviceObjects.UnlinkUsername.click();
//            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
//            unlinkDeviceObjects.UnlinkPassword.click();
//            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
//            unlinkDeviceObjects.GenerateOTP.click();
//            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
//            unlinkDeviceObjects.OTP.click();
//            unlinkDeviceObjects.OTP.sendKeys("00000");
//            unlinkDeviceObjects.UnlinkDeviceBtn.click();
//            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceSuccessMsg, 45);
//            landingPageObjects.OKButton.click();
//            logger.info("UnlinkAcctA() was successful");
//            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
//            System.out.println("Testcase: UnlinkAcctA() passed");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

    @Test(priority = 4)
    public void UnlinkAnUnlinkedDevice() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkAnUnlinkedDevice()");


        try {
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.UnlinkDeviceBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkTwiceErrorMsg, 45);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Testcase UnlinkAnUnlinkedDevice() passed");
            System.out.println("Testcase: UnlinkAnUnlinkedDevice() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 5)
    public void BindDeviceSuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: BindDeviceSuccessfully()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0090103680");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.BindDevicePrompt, 60);
            landingPageObjects.OKButton.click();
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.SubmitBtn.click();
            Utility.waitForElement(Util.driver, dashboardObjects.Total, 60);
            logger.info("Testcase BindDeviceSuccessfully() passed");

            dashboardObjects.MoreMenu.click();
            moreObjects.logout.isDisplayed();
            moreObjects.logout.click();
            moreObjects.OKBtn.click();
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Logged out successfully");
            System.out.println("Testcase: BindDeviceSuccessfully() passed");

        } catch (Exception e) {
                    System.out.println(e);
            }
    }

    @Test(priority = 6)
    public void UnlinkAcctASuccessfully_LoginWithAcctB_WrongOTP() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkAcctASuccessfully_LoginWithAcctB_WrongOTP()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.UnlinkDeviceBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceSuccessMsg, 45);
            landingPageObjects.OKButton.click();
            logger.info("Unlink device for account A was successful");
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
//            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0060032367");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.BindDevicePrompt, 45);
            //tap cancel on bind device prompt
            landingPageObjects.CancelButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.UnlinkDevice, 45);
            //tap Ok to bind device
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.BindDevicePrompt, 60);
            landingPageObjects.OKButton.click();
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("12000");
            unlinkDeviceObjects.SubmitBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.wrongOTPErrorMsg2, 45);
            landingPageObjects.OKButton.click();
            //submit buttn scr, tap close
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Testcase UnlinkAcctASuccessfully_LoginWithAcctB_WrongOTP() Passed");
            System.out.println("Testcase: UnlinkAcctASuccessfully_LoginWithAcctB_WrongOTP() passed");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 7)
    public void UnlinkAcctASuccessfully_LoginWithAcctB_ValidOTP() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkAcctASuccessfully_LoginWithAcctB_ValidOTP()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            landingPageObjects.Login.click();
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0060032367");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.BindDevicePrompt, 45);
            landingPageObjects.OKButton.click();
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.SubmitBtn.click();
            Utility.waitForElement(Util.driver, dashboardObjects.Total, 45);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Testcase UnlinkAcctASuccessfully_LoginWithAcctB_WrongOTP() Passed");

            dashboardObjects.MoreMenu.click();
            moreObjects.logout.isDisplayed();
            moreObjects.logout.click();
            moreObjects.OKBtn.click();
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Logged out successfully");
            System.out.println("Testcase: UnlinkAcctASuccessfully_LoginWithAcctB_ValidOTP() passed");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 8)
    public void UnlinkAcctB() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkAcctB()");


        try {
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0060032367");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.UnlinkDeviceBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceSuccessMsg, 45);
            landingPageObjects.OKButton.click();
            logger.info("UnlinkAcctA() was successful");
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            System.out.println("Testcase: UnlinkAcctB() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 9)
    public void ForgotPwdAfterUnlinkingDevice() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: ForgotPwdAfterUnlinkingDevice()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.ForgotPasswordLink.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkForgotPwdErrorMsg, 120);
            landingPageObjects.OKButton.click();
            landingPageObjects.loginButton.isDisplayed();
            logger.info("ForgotPwdAfterUnlinkingDevice() Testcase passed");
            System.out.println("Testcase: ForgotPwdAfterUnlinkingDevice() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Test(priority = 9)
    public void UnlinkAcctASuccessfully_LoginWithAcctA_ValidOTP() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase: UnlinkAcctASuccessfully_LoginWithAcctA_ValidOTP()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 120);
//            landingPageObjects.Login.click();
            landingPageObjects.UnlinkDevice.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.GenerateOTP, 30);
            unlinkDeviceObjects.UnlinkUsername.click();
            unlinkDeviceObjects.UnlinkUsername.sendKeys("0090103680");
            unlinkDeviceObjects.UnlinkPassword.click();
            unlinkDeviceObjects.UnlinkPassword.sendKeys("test123");
            unlinkDeviceObjects.GenerateOTP.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceBtn, 60);
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.UnlinkDeviceBtn.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.UnlinkDeviceSuccessMsg, 45);
            landingPageObjects.OKButton.click();
            logger.info("Unlink device for account A was successful");
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0090103680");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, unlinkDeviceObjects.BindDevicePrompt, 45);
            landingPageObjects.OKButton.click();
            unlinkDeviceObjects.OTP.click();
            unlinkDeviceObjects.OTP.sendKeys("00000");
            unlinkDeviceObjects.SubmitBtn.click();
            Utility.waitForElement(Util.driver, dashboardObjects.Total, 45);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("UnlinkAcctASuccessfully_LoginWithAcctA_ValidOTP() Passed");
            System.out.println("Testcase: UnlinkAcctASuccessfully_LoginWithAcctA_ValidOTP() passed");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
