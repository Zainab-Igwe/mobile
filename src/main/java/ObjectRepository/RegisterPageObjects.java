package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjects {

        public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

        //Constructor will listen and accept the arg,driver from Login test case
        public RegisterPageObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Registration']")
    public WebElement registrationPage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Account Number']")
    public WebElement accountField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Mobile Number']")
    public WebElement mobileNumberField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel']")
    public WebElement cancelButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='10 digits required']")
    public WebElement accountNoErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cannot be empty']")
    public WebElement mobileNoErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONTINUE']")
    public WebElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='YOU ARE ALREADY REGISTERED. PLEASE LOGIN TO CONTINUE']")
    public WebElement registrationErrorMsg;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Password']")
    public WebElement password;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm Password']")
    public WebElement confirmPassword;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter PIN']")
    public WebElement PIN;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm PIN']")
    public WebElement confirmPIN;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='OTP']")
    public WebElement OTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Resend OTP']")
    public WebElement resendOTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OTP not found or has expired']")
    public WebElement invalidOTPErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Registration successful.']")
    public WebElement successfulRegMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Success']")
    public WebElement successfulRegAlert;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    public WebElement OKbutton;

}