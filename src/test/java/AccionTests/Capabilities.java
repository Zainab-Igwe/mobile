package AccionTests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {
    //Launching Genymotion Emulator
    public static void launchEmulator() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start C:\\Users\\Zainab.Igwe\\Documents\\mobile\\udemy\\FCMB\\launchemulator.bat");
        Thread.sleep(100000L);
        System.out.println("Emulator is up and running");
    }

    //Starting Appium server programmatically
    public static void startServer() throws IOException, InterruptedException
    {
        Runtime.getRuntime().exec("cmd /c start C:\\Users\\Zainab.Igwe\\Documents\\mobile\\udemy\\startappium.bat");
        Thread.sleep(80000L);
        System.out.println("Yayy, Appium server is up, let's roll");
    }

    //Stopping Appium server programmatically
    public static void stopServer() throws IOException, InterruptedException
    {
        Runtime.getRuntime().exec("cmd /c start C:\\Users\\Zainab.Igwe\\Documents\\mobile\\udemy\\stopappium.bat");
        Thread.sleep(70000L);
        System.out.println("I'm done here!!, stopped Appium server successfully");
    }

    public static AndroidDriver Capabilities() throws MalformedURLException {

        //Making apk generic
        File appDir = new File("src");
        File appName = new File(appDir, "app-release (46).apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "192.168.40.102:5555");
        //caps.setCapability("deviceName", "Android device");
        caps.setCapability("platformName", "Android");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
        caps.setCapability("newCommandTimeout", 100000);

        //When package and activity is known
//        caps.setCapability("appPackage", "com.abank.abankapp");
//        caps.setCapability("appActivity", "com.abank.abankapp.MainActivity");
        //caps.setCapability("appWaitActivity", "com.abank.abankapp.MainActivity");


        //If apk name is used, do this
        caps.setCapability("app", appName);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //driver.startActivity();

        return driver;
    }
}
