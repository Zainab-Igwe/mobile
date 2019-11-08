package AccionTests;

import ObjectRepository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LogoutTest {
    public Logger logger;
    private LandingPageObjects landingPageObjects;
    private DashboardObjects dashboardObjects;
    private RegisterPageObjects registerPageObjects;
    private MoreObjects moreObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        landingPageObjects = new LandingPageObjects(Util.driver); //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
        moreObjects = new MoreObjects(Util.driver);
    }

    @Test
    public void aLogOutSuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
//            Utility.waitForElement(Util.driver, moreObjects.logout, 15);
            logger.info("Testcase BindDeviceSuccessfully2c() passed");
            dashboardObjects.MoreMenu.click();
            moreObjects.logout.isDisplayed();
            moreObjects.logout.click();
            moreObjects.CancelBtn.click();
            dashboardObjects.paymentMenu.click();
            dashboardObjects.MoreMenu.click();
//            Utility.waitForElement(Util.driver, moreObjects.logout, 15);
            moreObjects.logout.click();
            moreObjects.OKBtn.click();
            Utility.waitForElement(Util.driver, landingPageObjects.Login, 45);
            logger.info("Logged out successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
