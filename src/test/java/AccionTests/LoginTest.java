package AccionTests;

import ObjectRepository.DashboardObjects;
import ObjectRepository.LandingPageObjects;
import ObjectRepository.RegisterPageObjects;
import ObjectRepository.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public Logger logger;
    private LandingPageObjects landingPageObjects;
    private DashboardObjects dashboardObjects;
    private RegisterPageObjects registerPageObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        landingPageObjects = new LandingPageObjects(Util.driver); //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
    }


    @Test(priority = 1)
    public void aForgotPassword() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.ForgotPasswordLink.click();
            Utility.waitForElement(Util.driver, landingPageObjects.OTP, 120);
            landingPageObjects.OTP.isDisplayed();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            logger.info("aForgotPassword() Testcase passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Test(priority = 1)
    public void bLoginWithIncorrectUsername() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("STarting Testcase bLoginWithIncorrectUsername()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0099009900");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.wrongUsernameErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("bLoginWithIncorrectUsername() Testcase passed");
            System.out.println("Testcase bLoginWithIncorrectUsername passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void bLoginWithAValidAcctNotTiedToDevice() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase bLoginWithAValidAcctNotTiedToDevice()");
        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
//            landingPageObjects.username.clear();
            landingPageObjects.username.sendKeys("0060032367");
            landingPageObjects.password.click();
//            landingPageObjects.password.clear();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.WrongProfileErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("Testcase passed");
            System.out.println("Testcase bLoginWithAValidAcctNotTiedToDevice() passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 3)
    public void cLoginWithIncorrectPassword() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase cLoginWithIncorrectPassword()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
//            landingPageObjects.username.clear();
            landingPageObjects.username.sendKeys("0090103680");
            landingPageObjects.password.click();
//            landingPageObjects.password.clear();
            landingPageObjects.password.sendKeys("test");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.wrongPasswordErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("cLoginWithIncorrectPassword() Testcase passed");
            System.out.println("cLoginWithIncorrectPassword() Testcase passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 4)
    public void dLoginWithNoDetails() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting testcase dLoginWithNoDetails()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.loginButton.click();
//            Utility.waitForElement(Util.driver, landingPageObjects.wrongPasswordErrorMsg, 150);
            Utility.waitForElement(Util.driver, landingPageObjects.blankCredentialsErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("dLoginWithNoDetails() Testcase passed");
            System.out.println("dLoginWithNoDetails() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 5)
    public void eLoginWithBlankUsername() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting testcase eLoginWithBlankUsername() passed");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
//        landingPageObjects.username.click();
//        landingPageObjects.username.sendKeys("0060032367");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.blankCredentialsErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("eLoginWithBlankUsername() Testcase passed");
            System.out.println("eLoginWithBlankUsername() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 6)
    public void fLoginWithBlankPassword() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting Testcase fLoginWithBlankPassword()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0090103680");
//            landingPageObjects.password.clear();
//        landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, landingPageObjects.blankCredentialsErrorMsg, 150);
            landingPageObjects.OKButton.click();
            Utility.tapUsingCoordinates(Util.driver, 1272, 802);
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            logger.info("fLoginWithBlankPassword() Testcase passed");
            System.out.println("fLoginWithBlankPassword() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 6)
    public void gLoginSuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Starting testcase gLoginSuccessfully()");

        try {
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 120);
            Utility.waitForElement(Util.driver, landingPageObjects.loginButton, 10);
            landingPageObjects.Login.click();
            landingPageObjects.username.click();
            landingPageObjects.username.sendKeys("0090000000");
            landingPageObjects.password.click();
            landingPageObjects.password.sendKeys("test123");
            landingPageObjects.loginButton.click();
            Utility.waitForElement(Util.driver, dashboardObjects.AccountNo, 120);
            dashboardObjects.AccountNo.isDisplayed();
            logger.info("LOGIN testsuite passed!");
            System.out.println("gLoginSuccessfully() Testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}