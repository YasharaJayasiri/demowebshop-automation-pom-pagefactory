package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Factory_AddToCartPage {

    // 1) General/Normal way of find element

    @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a") WebElement BookNavBtn;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input") WebElement BookAddToCartBtn;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a") WebElement  ElectronicNavBtn;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/h2/a") WebElement CellPhoneBtn;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input") WebElement CellPhoneAddToCartBtn ;
    @FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]") WebElement CartButton;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1") WebElement Title;

    // 3) Define web driver object for page class
    WebDriver WebPageClassDriver;

    // 4) Constructor method
    public Factory_AddToCartPage(WebDriver TestClassDriver)
    {

        this.WebPageClassDriver=TestClassDriver;
    }

    public void  AddingItems()
    {
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







}
