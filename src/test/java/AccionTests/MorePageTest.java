package AccionTests;

import ObjectRepository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MorePageTest {
    public Logger logger;
    private LandingPageObjects landingPageObjects;
    private DashboardObjects dashboardObjects;
    private ProfileObjects profileObjects;
    private MoreObjects moreObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        dashboardObjects = new DashboardObjects(Util.driver);
        profileObjects = new ProfileObjects(Util.driver);
        moreObjects = new MoreObjects(Util.driver);
        landingPageObjects = new LandingPageObjects(Util.driver);
    }

    @Test
    public void aViewMorePage() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            dashboardObjects.MoreMenu.click();
            Utility.waitForElement(Util.driver, moreObjects.ContactHeader, 10);
            Utility.waitForElement(Util.driver, moreObjects.AccionBankName, 5);
            Utility.waitForElement(Util.driver, moreObjects.AccionTelNo, 5);
            Utility.waitForElement(Util.driver, moreObjects.EmailAdd, 5);
            Utility.waitForElement(Util.driver, moreObjects.CallCenter, 5);
            logger.info("All elements are displayed");
            System.out.println("aViewMorePage() testcase passed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
