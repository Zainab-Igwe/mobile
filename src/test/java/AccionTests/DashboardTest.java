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

public class DashboardTest {

    public Logger logger;
    private DashboardObjects dashboardObjects;
    private RegisterPageObjects registerPageObjects;

    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
         //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
    }

    @Test
    public void averifyDashboard() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {

//            Utility.waitForElement(Util.driver, dashboardObjects.Total, 120);
            Utility.waitForElement(Util.driver, dashboardObjects.dashboardMenu, 10);
//            Utility.waitForElement(Util.driver, dashboardObjects.AccountTypeText, 10);
            logger.info("averifyDashboard() Testcase passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

