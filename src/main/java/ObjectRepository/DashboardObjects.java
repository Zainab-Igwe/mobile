package ObjectRepository;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DashboardObjects {
    public AndroidDriver driver; //Driver is declared here for it to be used by all methods in this class

    //Constructor will listen and accept the arg,driver from Login test case
    public DashboardObjects(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //Picks driver and concatenate it to the objects

        this.driver = driver; //Driver from Capabilities page should be passed to the public driver
    } //AppiumFieldDecorator was added so that it can run on Android and iOS


    //By Total = By.xpath("//android.widget.TextView[@text='Total']");

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total']")
    public WebElement Total;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dashboard']")
    public WebElement dashboardMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfers']")
    public WebElement transferMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment']")
    public WebElement paymentMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
    public WebElement ProfileMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
    public WebElement MoreMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0090076649']")
    public WebElement AccountNo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bright']")
    public WebElement AccountTypeText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
    public WebElement AccountHistory;


}
