package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Factory_ConfirmationPage {
    // 1) General/Normal way of find element

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
    WebElement BookNavBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
    WebElement BookAddToCartBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
    WebElement ElectronicNavBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/h2/a")
    WebElement CellPhoneBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
    WebElement CellPhoneAddToCartBtn;
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement CartButton;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1")
    WebElement Title;

    @FindBy(xpath = "//*[@id=\"CountryId\"]")
    WebElement CountryDropdown;
    @FindBy(xpath = "//*[@id=\"CountryId\"]/option[3]")
    WebElement CountryChose;
    @FindBy(xpath = "//*[@id=\"StateProvinceId\"] ")
    WebElement StateDropdown;
    @FindBy(xpath = "//*[@id=\"StateProvinceId\"]/option[1] ")
    WebElement StateChose;
    @FindBy(xpath = "//*[@id=\"ZipPostalCode\"]")
    WebElement Zip;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input")
    WebElement EstimateBtn;
    @FindBy(xpath = "//*[@id=\"termsofservice\"]")
    WebElement Tick;
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")
    WebElement TitleCheckout;

    //new elements in checkout page
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]")
    WebElement CheckoutAsBtn;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_FirstName\"] ")
    WebElement FN;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_LastName\"] ")
    WebElement LN;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_Email\"]")
    WebElement Email;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_CountryId\"]")
    WebElement CountryDrop;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]/option[3] ")
    WebElement CountrySelect;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_City\"]")
    WebElement City;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_Address1\"]")
    WebElement Address;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement Postal;
    @FindBy(xpath = " //*[@id=\"BillingNewAddress_PhoneNumber\"]")
    WebElement PhoneNo;
    @FindBy(xpath = " //*[@id=\"billing-buttons-container\"]/input")
    WebElement ContinueBtn1;

    @FindBy(xpath = " //*[@id=\"PickUpInStore\"]")
    WebElement TickInStore;
    @FindBy(xpath = " //*[@id=\"shipping-buttons-container\"]/input")
    WebElement ContinueBtn2;

    @FindBy(xpath = "//*[@id=\"paymentmethod_0\"] ")
    WebElement CODRadio;
    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input ")
    WebElement ContinueBtn3;


    @FindBy(xpath = " //*[@id=\"payment-info-buttons-container\"]/input")
    WebElement ContinueBtn4;

    @FindBy(xpath = "//*[@id=\"checkout-confirm-order-load\"]/div/div[2]/div/form/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/span")
    WebElement SubTotalText;
    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input ") WebElement ConfirmBtn;

    //Confirmation elements
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1") WebElement  ThankYou;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input") WebElement  LastContinueBtn;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[2]/div[1]/strong") WebElement  Home;



    // 3) Define web driver object for page class
    WebDriver WebPageClassDriver;

    // 4) Constructor method
    public Factory_ConfirmationPage(WebDriver TestClassDriver) {

        this.WebPageClassDriver = TestClassDriver;
    }

    // 5) Initialize methods

    public void AddingItems() {
        BookNavBtn.click();
        BookAddToCartBtn.click();
        ElectronicNavBtn.click();
        CellPhoneBtn.click();
        CellPhoneAddToCartBtn.click();
        CartButton.click();
    }

    public boolean verifyPage() {
        String actualTitle = Title.getText();
        Assert.assertEquals(actualTitle, "Shopping cart", "Category Title Mismatch!");
        return true;

    }

    public void InsertShippingInfo(String UZip) {
        CountryDropdown.click();
        CountryChose.click();
        StateDropdown.click();
        StateChose.click();

        Zip.sendKeys(UZip);
        EstimateBtn.click();
        Tick.click();
        CheckoutBtn.click();

    }

    public boolean verifyCheckoutPage() {
        String actualTitle = TitleCheckout.getText();
        Assert.assertEquals(actualTitle, "Welcome, Please Sign In!", "Category Title Mismatch!");
        return true;
    }

    public void InsertFormInfo(String UFN, String ULN, String UEMAIL, String UCITY, String UADDRESS, String UPOSTAL, String UPHONE) throws InterruptedException {
        CheckoutAsBtn.click();
        FN.sendKeys(UFN);
        LN.sendKeys(ULN);
        Email.sendKeys(UEMAIL);
        CountryDrop.click();
        CountrySelect.click();
        City.sendKeys( UCITY);
        Address.sendKeys( UADDRESS);
        Postal.sendKeys( UPOSTAL);
        PhoneNo.sendKeys( UPHONE);
        Thread.sleep(2000);
        ContinueBtn1.click();
        Thread.sleep(4000);
        TickInStore.click();
        Thread.sleep(4000);
        ContinueBtn2.click();
        Thread.sleep(5000);
        CODRadio.click();
        Thread.sleep(3000);
        ContinueBtn3.click();
        Thread.sleep(3000);



    }



    public void ContinueBtn4Click() throws InterruptedException {
        ContinueBtn4.click();
        Thread.sleep(2000);
    }

    public void ConfirmBtnClick() throws InterruptedException {
        ConfirmBtn.click();
        Thread.sleep(2000);
    }

    public boolean  VerifyThank() {
        String actualTitle = ThankYou.getText();
        Assert.assertEquals(actualTitle, "Thank you", "Category Title Mismatch!");
        return true;
    }
    public void LastConfirmBtnClick() throws InterruptedException {
        LastContinueBtn.click();
        Thread.sleep(2000);
    }
    public boolean  VerifyHomePage() {
        String actualTitle = Home.getText();
        Assert.assertEquals(actualTitle, "MANUFACTURERS", "Category Title Mismatch!");
        return true;
    }

}
