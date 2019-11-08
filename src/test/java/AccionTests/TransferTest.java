package AccionTests;

import ObjectRepository.DashboardObjects;
import ObjectRepository.RegisterPageObjects;
import ObjectRepository.TransferObjects;
import ObjectRepository.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TransferTest {

    public Logger logger;
    private DashboardObjects dashboardObjects;
    private TransferObjects transferObjects;


    @BeforeClass
    public void init() throws IOException, InterruptedException {

        logger = LoggerFactory.getLogger(LoginTest.class);
        //This calls the methods/variables of another class (Login_Object) using objects
        dashboardObjects = new DashboardObjects(Util.driver);
        transferObjects = new TransferObjects(Util.driver);
    }

    @Test
    public void aAddBcySuccessfully() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.transferMenu, 120);
            dashboardObjects.transferMenu.click();
            Utility.waitForElement(Util.driver, transferObjects.SourceAccountNo, 45);
            transferObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, transferObjects.DestinationAccountText, 45);
            Utility.waitForElement(Util.driver, transferObjects.BeneficiaryTab, 45);
            transferObjects.BeneficiaryTab.click();
            Utility.waitForElement(Util.driver, transferObjects.searchField, 10);
//            transferObjects.searchField.click();
//            transferObjects.searchField.sendKeys("10.50");
            transferObjects.addNewBeneficiary.click();
            Utility.waitForElement(Util.driver, transferObjects.Accion, 60);
            transferObjects.Accion.click();
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryDetails, 10);
            transferObjects.BeneficiaryAccountNo.click();
            transferObjects.BeneficiaryAccountNo.sendKeys("0060032367");
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryBankName, 60);
            Utility.waitForElement(Util.driver, transferObjects.confirmButton, 20);
            transferObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
//            Utility.waitForAlertClickElement(Util.driver, transferObjects.beneficiarySuccessMsg, transferObjects.closeButton);
            Utility.waitForElement(Util.driver, transferObjects.beneficiarySuccessMsg, 45);
            transferObjects.OK.click();
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 30);
            logger.info("Beneficiary added successfully");
            logger.info("aAddBcySuccessfully() testcase passed");
            //Delete added BCY, use tap with coordinates to tap on delete----delete, add, add existing....-send to added,
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Add again
    @Test
    public void bDeleteBCY_AddExistingBCY() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
//             aAddBcySuccessfully();
            Utility.waitForElement(Util.driver, transferObjects.DestinationAccountText, 45);
            Utility.waitForElement(Util.driver, transferObjects.BeneficiaryTab, 45);
            transferObjects.BeneficiaryTab.click();
            Utility.waitForElement(Util.driver, transferObjects.searchField, 10);
//            transferObjects.searchField.click();
//            transferObjects.searchField.sendKeys("10.50");
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 10);
            Utility.tapUsingCoordinates(Util.driver, 1256, 1833);
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            //            Utility.waitForAlertClickElement(Util.driver, transferObjects.beneficiarySuccessMsg, transferObjects.closeButton);
            Utility.waitForElement(Util.driver, transferObjects.BeneficiaryTab, 45);
            logger.info("Beneficiary deleted successfully");


            //Add
            Utility.waitForElement(Util.driver, transferObjects.addNewBeneficiary, 120);
            transferObjects.addNewBeneficiary.click();
            Utility.waitForElement(Util.driver, transferObjects.Accion, 60);
            transferObjects.Accion.click();
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryDetails, 10);
            transferObjects.BeneficiaryAccountNo.click();
            transferObjects.BeneficiaryAccountNo.sendKeys("0060032367");
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryBankName, 60);
            Utility.waitForElement(Util.driver, transferObjects.confirmButton, 60);
            transferObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            //            Utility.waitForAlertClickElement(Util.driver, transferObjects.beneficiarySuccessMsg, transferObjects.closeButton);
            Utility.waitForElement(Util.driver, transferObjects.beneficiarySuccessMsg, 45);
            transferObjects.OK.click();
            logger.info("Beneficiary added successfully");

            //Add Existing
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 30);
            transferObjects.addNewBeneficiary.click();
            transferObjects.Accion.click();
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryDetails, 10);
            transferObjects.BeneficiaryAccountNo.click();
            transferObjects.BeneficiaryAccountNo.sendKeys("0060032367");
            Utility.waitForElement(Util.driver, transferObjects.beneficiaryBankName, 60);
            Utility.waitForElement(Util.driver, transferObjects.confirmButton, 60);
            transferObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForElement(Util.driver, transferObjects.existingBCYErrorMsg, 10);
            transferObjects.OK.click();
            Utility.tapUsingCoordinates(Util.driver, 64, 160);
            if (transferObjects.addedBCYDetails.isDisplayed()) {
                logger.info("Beneficiary Details are displayed");
            } else logger.info("Beneficiary details could not be found");
            logger.info("bDeleteBCY_AddExistingBCY() Testcase passed");

            //delete bcy again

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cSearchBCY() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, transferObjects.searchField, 10);
            transferObjects.searchField.click();
            transferObjects.searchField.sendKeys("CLOUD");
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 10);
            logger.info("cSearchBCY testcase passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void dTransferToBCY() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 120);
            transferObjects.addedBCYDetails.click();
            Utility.scroll(Util.driver, 240, 1302, 240, 408);
            transferObjects.TransferAmount.click();
            transferObjects.TransferAmount.sendKeys("15.55");
            Utility.tapUsingCoordinates(Util.driver, 80, 1708);
            System.out.println("1");
            transferObjects.Narration.click();
            System.out.println("2");
            transferObjects.Narration.sendKeys("ISW TEST");
            transferObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForElement(Util.driver, transferObjects.transferSuccessMsg, 50);
            transferObjects.closeButton.click();
            Utility.waitForElement(Util.driver, dashboardObjects.Total, 60);
            logger.info("dTransferToBCY() Testcase passed.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void eTransferToOwnAccount() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Utility.waitForElement(Util.driver, dashboardObjects.transferMenu, 120);
            dashboardObjects.transferMenu.click();
            Utility.waitForElement(Util.driver, transferObjects.SourceAccountNo, 45);
            transferObjects.SourceAccountNo.click();
            Utility.waitForElement(Util.driver, transferObjects.DestinationAccountText, 45);
            Utility.waitForElement(Util.driver, transferObjects.OwnAccountText, 45);
            transferObjects.DestAccountNo.click();
            Utility.waitForElement(Util.driver, transferObjects.TransferAmount, 45);
            transferObjects.TransferAmount.click();
            transferObjects.TransferAmount.sendKeys("10.50");
            //check for complusory fields
            transferObjects.TransferAmount.clear();
            Utility.waitForElement(Util.driver, transferObjects.amountPrompt, 10);
            Utility.waitForElement(Util.driver, transferObjects.compulsoryFieldAlert, 10);
            transferObjects.TransferAmount.click();
            transferObjects.TransferAmount.sendKeys("10.50");
            transferObjects.Narration.click();
            System.out.println("1");
            transferObjects.Narration.sendKeys("ISW TEST");
            transferObjects.Narration.clear();
            Utility.waitForElement(Util.driver, transferObjects.narrationPrompt, 10);
            Utility.waitForElement(Util.driver, transferObjects.compulsoryFieldAlert, 10);
            transferObjects.Narration.click();
            transferObjects.Narration.sendKeys("ISW TEST");
            transferObjects.scrollToconfirmButton.click();
//            transferObjects.confirmButton.click();
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            Utility.waitForElement(Util.driver, transferObjects.transferSuccessMsg, 50);
            transferObjects.closeButton.click();
            Utility.waitForElement(Util.driver, dashboardObjects.Total, 60);
            logger.info("eTransferToOwnAccount() Testcase passed.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void fDeleteBCY() throws InterruptedException, IOException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Util.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
//             aAddBcySuccessfully();
            Utility.waitForElement(Util.driver, transferObjects.DestinationAccountText, 45);
            Utility.waitForElement(Util.driver, transferObjects.BeneficiaryTab, 45);
            transferObjects.BeneficiaryTab.click();
            Utility.waitForElement(Util.driver, transferObjects.searchField, 10);
//            transferObjects.searchField.click();
//            transferObjects.searchField.sendKeys("10.50");
            Utility.waitForElement(Util.driver, transferObjects.addedBCYDetails, 10);
            Utility.tapUsingCoordinates(Util.driver, 1256, 1833);
            Utility.waitForElement(Util.driver, transferObjects.NumberPad, 10);
            transferObjects.Key1Button.click();
            transferObjects.Key2Button.click();
            transferObjects.Key3Button.click();
            transferObjects.Key4Button.click();
            //            Utility.waitForAlertClickElement(Util.driver, transferObjects.beneficiarySuccessMsg, transferObjects.closeButton);
            Utility.waitForElement(Util.driver, transferObjects.BeneficiaryTab, 45);
            logger.info("Beneficiary deleted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//transferwithchangedPIN
//transferAcctAddBeneficiary
//transferAcctAddExistingBCY
//transferAcctDeleteExistingBCY
//transferAcctUseSavedBeneficiary