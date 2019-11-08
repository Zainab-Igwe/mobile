package AccionTests;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Util extends Capabilities {

    public static AndroidDriver driver;

//    @BeforeSuite
//    public static void initEmulator() throws IOException, InterruptedException {
//        launchEmulator();
//    }

    @BeforeSuite
    public static void initSuite() throws IOException, InterruptedException {
        startServer();
        driver = Capabilities();
    }

    @AfterSuite
    public static void endSuite() throws IOException, InterruptedException {
        driver.quit();
        stopServer();
    }
}
