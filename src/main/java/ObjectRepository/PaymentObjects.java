package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PaymentObjects {
    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public PaymentObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9MOBILE']")
    public WebElement NineMobile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AIRTEL']")
    public WebElement Airtel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GLO']")
    public WebElement Glo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MTN']")
    public WebElement MTN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MTN VTU']")
    public WebElement MTNProductName;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Amount\"));") //Scroll syntax
    public WebElement scrollToAmount;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='0.00']")
    public WebElement Amount;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mobile Number\"));")
    public WebElement scrollToPhoneNo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Mobile Number']")
    public WebElement PhoneNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONFIRM']")
    public WebElement confirmButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0090076649']")
    public WebElement SourceAccountNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Category']")
    public WebElement Category;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Airtime']")
    public WebElement AirtimeTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose Beneficiary']")
    public WebElement ChooseBeneficiary;

    @AndroidFindBy(xpath = "//android.widget.Switch[@text='OFF']")
    public WebElement ToggleON;

    @AndroidFindBy(xpath = "//android.widget.Switch[@text='OFF']")
    public WebElement ToggleOFF;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Beneficiary Name']")
    public WebElement BCYName;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"CONFIRM\"));")
    public WebElement scrollToConfirm;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Airtime TopUp for 07065729929 successful.']")
    public WebElement AirtimeSuccessMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public WebElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Beneficiary']")
    public WebElement selectBCY;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='07065729929']")
    public WebElement BCYPhoneNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test']")
    public WebElement addedBCYName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bill Payments']")
    public WebElement BillPaymentTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cable TV']")
    public WebElement CableTV;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DSTV']")
    public WebElement DSTV;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Product']")
    public WebElement SelectProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DSTV Access']")
    public WebElement Access;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Smart card number']")
    public WebElement scrollToSmartCardNo ;

}
