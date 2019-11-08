package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObjects {

    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public LandingPageObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    public WebElement loginButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public WebElement login2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Register']")
    public WebElement registerButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open Account']")
    public WebElement openAccountButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username']")
    public WebElement username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public WebElement password;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forgot?']")
    public WebElement ForgotPasswordLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    public WebElement Login;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uE082']")
    public WebElement CloseButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Username is required']")
    public WebElement blankUsernameErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement OKButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement CancelButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Invalid Account Number']")
    public WebElement wrongUsernameErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Password is required']")
    public WebElement blankPasswordErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Incorrect Password']")
    public WebElement wrongPasswordErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='YOUR PROFILE IS NOT ACTIVE']")
    public WebElement InactiveProfileErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CANNOT LOG YOU IN. THIS DEVICE IS TIED TO ANOTHER PROFILE.']")
    public WebElement WrongProfileErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter valid credentials']")
    public WebElement blankCredentialsErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter OTP']")
    public WebElement OTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Unlink Device']")
    public WebElement UnlinkDevice;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Invalid Account Number']")
    public WebElement invalidUsernameErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='A new password has been sent to you. Click Ok to log in with the new password']")
    public WebElement ForgotPwdMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your session has timed out, please login again']")
    public WebElement SessionTimeOutMsg;


}