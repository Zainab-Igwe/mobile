package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UnlinkDeviceObjects {

    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public UnlinkDeviceObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0090076649']")
    public WebElement SourceAccountNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GENERATE OTP']")
    public WebElement GenerateOTP;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Account Number']")
    public WebElement UnlinkUsername;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Password']")
    public WebElement UnlinkPassword;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter OTP']")
    public WebElement OTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Resend OTP']")
    public WebElement resendOTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='UNLINK DEVICE']")
    public WebElement UnlinkDeviceBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Device has been unlinked successfully.']")
    public WebElement UnlinkDeviceSuccessMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cannot be empty']")
    public WebElement emptyUsernameErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cannot be empty']")
    public WebElement emptyPasswordErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Unlink Device']")
    public WebElement UnlinkDeviceScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INVALID PIN']")
    public WebElement wrongOTPErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DEVICE TO BE UNLINKED NO LONGER EXISTS']")
    public WebElement UnlinkTwiceErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please note, this device will be binded to your profile']")
    public WebElement BindDevicePrompt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit']")
    public WebElement SubmitBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OTP not found or has expired']")
    public WebElement wrongOTPErrorMsg2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='YOUR PASSWORD COULD NOT BE RESET BECAUSE THIS DEVICE IS NOT LINKED TO ANY PROFILE']")
    public WebElement UnlinkForgotPwdErrorMsg;
}






