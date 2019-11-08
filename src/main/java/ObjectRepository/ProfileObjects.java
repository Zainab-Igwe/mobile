package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProfileObjects {
    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public ProfileObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hello STANLEY MORGAN COMPANY']")
    public WebElement ProfileName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uE32C 08033016344']")
    public WebElement PhoneNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Device Info']")
    public WebElement DeviceInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Model: ']")
    public WebElement Model;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Device ID: ']")
    public WebElement DeviceId;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change PIN']")
    public WebElement ChangePINMenu;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Old Pin']")
    public WebElement OldPIN;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='New Pin']")
    public WebElement NewPIN;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm Pin']")
    public WebElement ConfirmPIN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CHANGE']")
    public WebElement ChangeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NEW and confirm PIN do not match']")
    public WebElement PINMismatchErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pin changed successfully.']")
    public WebElement PINChangedSuccessMsg;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement OK;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Error changing PIN']")
    public WebElement wrongOldPINMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cannot be empty']")
    public WebElement blankPINErrorMsg;
}
