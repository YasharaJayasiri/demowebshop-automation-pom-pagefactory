package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Factory_RegisterPage {
    // 1) General/Normal way of find element
    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") WebElement RegisterButtonNavigation;
    @FindBy(xpath="//*[@id=\"gender-female\"]") WebElement RadioButton;
    @FindBy(xpath="//*[@id=\"FirstName\"]") WebElement FirstName;
    @FindBy(xpath="//*[@id=\"LastName\"]") WebElement LastName;
    @FindBy(xpath="//*[@id=\"Email\"]") WebElement Email;

    @FindBy(xpath="//*[@id=\"Password\"]") WebElement Password;
    @FindBy(xpath="//*[@id=\"ConfirmPassword\"]") WebElement ConfirmPassword;

    @FindBy(xpath="//*[@id=\"register-button\"]") WebElement RegisterButton;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]") WebElement Title;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input") WebElement ContinueBtn;



    // 3) Define web driver object for page class
    WebDriver WebPageClassDriver;

    // 4) Constructor method
    public Factory_RegisterPage(WebDriver TestClassDriver)
    {

        this.WebPageClassDriver=TestClassDriver;
    }

    // 5) Initialize methods
    public void  InsertDataToRegister(String UFirstName, String ULastName, String UEmail, String UPassword, String UConfirmPassword)
    {
        RegisterButtonNavigation.click();
        RadioButton.click();
        FirstName.sendKeys(UFirstName);
        LastName.sendKeys(ULastName);
        Email.sendKeys(UEmail);

        Password.sendKeys(UPassword);
        ConfirmPassword.sendKeys(UConfirmPassword);

        RegisterButton.click();
    }

    public boolean verifyPage() {
        String actualTitle = Title.getText();
        Assert.assertEquals(actualTitle, "Your registration completed", "Category Title Mismatch!");
        return true;

    }

    public void clickContinueButton()
    {
        ContinueBtn.click();

    }


}
