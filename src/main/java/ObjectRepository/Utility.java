package ObjectRepository;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

public class Utility {

    public static Logger logger = LoggerFactory.getLogger(Utility.class);
    ///wait commands
    public static boolean waitForElement(AndroidDriver driver, WebElement locator, int timeLimitInSeconds) {

        try {
            logger.info("Waiting for element...");

            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
            wait.until(ExpectedConditions.visibilityOf(locator));
            boolean isElementPresent = locator.isDisplayed();
            logger.info("Element was found");
            return isElementPresent;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void waitForAlert(AndroidDriver driver, WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            logger.info("Initiating Webdriver wait...");
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            logger.info("I clicked");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // alert.accept();
    }

    public static void waitForAlertClickElement(AndroidDriver driver, WebElement alert, WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 180);
            logger.info("Initiating Webdriver wait...");
            wait.until(ExpectedConditions.visibilityOf(alert));
            element.click();
            logger.info(element + " was clicked");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }// alert.accept();
    }

    public static void WaitUntilClickable(AndroidDriver driver, WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 70);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    ////tap
    public static void tapUsingXPath (AndroidDriver driver, String xpath){
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().
                withElement(element(driver.findElementByXPath(xpath))))
                .perform();
    }

    public static void tapUsingId (AndroidDriver driver, String id){
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().
                withElement(element(driver.findElementById(id))))
                .perform();
    }

    public static void tapUsingLocator (AndroidDriver driver, WebElement locator){
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().
                withElement(element(locator)))
                .perform();
    }

    public static void tapUsingLocator2 (AndroidDriver driver, WebElement locator){
        TouchAction t = new TouchAction(driver);
        t.tap(tapOptions().
                withElement(element(locator))).perform();
    }

    public static void tapUsingClassName (AndroidDriver driver, String className) {
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().
                withElement(element(driver.findElementByClassName(className))))
                .perform();
    }

    ///tap with coordinates
    public static void tapUsingCoordinates1 (AndroidDriver driver){
        //Point point= locator.getLocation();
        TouchAction t= new TouchAction(driver);
        t.tap(PointOption.point(210, 350)).perform();
    } //y=300, x=600

    public static void tapUsingCoordinates2 (AndroidDriver driver){
        //Point point= locator.getLocation();
        TouchAction t= new TouchAction(driver);
        t.tap(PointOption.point(590, 290)).perform();
    }

    public static void tapUsingCoordinates (AndroidDriver driver, int x, int y){
        //Point point= locator.getLocation();
        TouchAction t= new TouchAction(driver);
        t.tap(PointOption.point(x, y)).perform();
        logger.info("Provided coordinates was found and tapped on.");
    }

    ///move
    public static void moveToPositionandType (AndroidDriver driver, WebElement locator, String text){
        try {
            Actions cursor = new Actions(driver);
            System.out.println("A");
            cursor.moveToElement(locator, -250, -250).click().build().perform();
//        builder.moveToElement(locator,  10, 25).click().build().perform();
            System.out.println("B");
            locator.sendKeys(text);
            logger.info("Clicked and sent keys");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    ////long press
    public static void longPress (AndroidDriver driver, WebElement locator) {
        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(element(locator))
                .withDuration(ofSeconds(3)))
                .release()
                .perform();
    }

    public static void longPressByXpath (AndroidDriver driver, String xpath) {
        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(element(driver.findElementByXPath(xpath)))
                .withDuration(ofSeconds(3)))
                .release()
                .perform();
    }

    public static void longPressByClassName (AndroidDriver driver, String className) {
        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(element(driver.findElementByClassName(className)))
                .withDuration(ofSeconds(3)))
                .release()
                .perform();
    }

   ///Swipe
   public static void swipe (AndroidDriver driver, WebElement locator1, WebElement locator2) {
       TouchAction t = new TouchAction(driver);
       t.longPress(LongPressOptions.longPressOptions()
               .withElement(element(locator1))
               .withDuration(ofSeconds(3))).moveTo(element(locator2))
               .release()
               .perform();
   }

   //scrolll
    public static void scrolll (AndroidDriver driver, WebElement locator, int x, int y){
        TouchActions action = new TouchActions(driver);
        action.scroll(locator, x, y);
        action.perform();
    }

    //scroll
    public static void scroll (AndroidDriver driver, int x_src, int y_src, int x_dest, int y_dest) {
        TouchAction t = new TouchAction(driver);
        t.press(PointOption.point(x_src, y_src))
                .waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(x_dest, y_dest))
                .release()
                .perform();
    }


   //    /*Drag and Drop --- If you are not going to be doing anything extra,
//      like clicking on a specific position/element,
//    then you can use this shorter version of longpress syntax */
    public static void drag_and_drop (AndroidDriver driver, WebElement source, WebElement destination) {
        TouchAction t = new TouchAction(driver);
        t.longPress(element(source)).moveTo(element(destination))
                .release()
                .perform();
    }

   ///capture screenshots
    public static void takeScreenshot (AndroidDriver driver) {
        File scrFile = driver.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            FileUtils.copyFile(scrFile, new File("C:\\Users\\Zainab.Igwe\\Documents\\ISW\\mobile\\udemy\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void captureScreenshot(AndroidDriver driver) throws IOException{
        String filename= UUID.randomUUID().toString();
        String path_screenshot = "C:\\Users\\Zainab.Igwe\\Documents\\ISW\\mobile\\udemy\\screenshots\\accessghanascreenshots\\";

        try{
            File srcFile=driver.getScreenshotAs(OutputType.FILE);
            File targetFile=new File(path_screenshot + filename + ".jpg");
            FileUtils.copyFile(srcFile,targetFile);
            logger.info("Screenshot has been saved successfully!");
        }  catch (Exception e){
            logger.error("Error capturing screen shot of failed test.");
            // remove old pic to prevent wrong assumptions
            File f = new File(filename);
            f.delete(); // don't really care if this doesn't succeed, but would like it to.
        }
    }

    //timeOut
    public static boolean verifySessionTimeOut (AndroidDriver driver, WebElement locator, int timeLimitInSeconds ){
        try {
            logger.info("User's session is about to time out...");

            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
            wait.until(ExpectedConditions.visibilityOf(locator));
            boolean isElementPresent = locator.isDisplayed();
            logger.info("User's session has timed out.");
            return isElementPresent;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
