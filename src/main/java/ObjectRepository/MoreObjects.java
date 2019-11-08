package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MoreObjects{
    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public MoreObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact']")
    public WebElement ContactHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Accion Microfinance Bank Ltd.']")
    public WebElement AccionBankName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tel: 01-271 9325-6']")
    public WebElement AccionTelNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email: info@accionmfb.com']")
    public WebElement EmailAdd;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Call Center: +234 1 2951010']")
    public WebElement CallCenter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGOUT']")
    public WebElement logout;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Are you sure you want to logout?']")
    public WebElement logoutPopUp;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement CancelBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement OKBtn;







}
