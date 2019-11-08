package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TransferObjects {

    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public TransferObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0090076649']")
    public WebElement SourceAccountNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Destination Account']")
    public WebElement DestinationAccountText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Own Account']")
    public WebElement OwnAccountText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0090103680']")
    public WebElement DestAccountNo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='0.00']")
    public WebElement TransferAmount;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public WebElement Narration;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONFIRM']")
    public WebElement confirmButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"CONFIRM\"));")
    public WebElement scrollToconfirmButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1']")
    public WebElement Key1Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2']")
    public WebElement Key2Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3']")
    public WebElement Key3Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='4']")
    public WebElement Key4Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter PIN']")
    public WebElement NumberPad;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer successful']")
    public WebElement transferSuccessMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public WebElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beneficiary']")
    public WebElement BeneficiaryTab;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    public WebElement searchField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New Beneficiary']")
    public WebElement addNewBeneficiary;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ACCION']")
    public WebElement Accion;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Account Number']")
    public WebElement BeneficiaryAccountNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name']")
    public WebElement Name;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beneficiary Details']")
    public WebElement beneficiaryDetails;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='CLOUD ENERGY PH CLOUD ENERGY PHOTOELECTRI']")
    public WebElement beneficiaryBankName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Added beneficiary successfully']")
    public WebElement beneficiarySuccessMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0060032367 •Accion']")
    public WebElement addedBCYDetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CANNOT ADD EXISTING BENEFICIARY']")
    public WebElement existingBCYErrorMsg;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Amount\"));") //Scroll syntax
    public WebElement scrollToAmount;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='0.00']")
    public WebElement swipeToAmount;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"0.00\"));") //Scroll syntax
    public WebElement scrollToAmount1;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Narration\"));") //Scroll syntax
    public WebElement scrollToNarration;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement OK;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Amount']")
    public WebElement amountPrompt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cannot be empty']")
    public WebElement compulsoryFieldAlert;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Narration']")
    public WebElement narrationPrompt;







}
