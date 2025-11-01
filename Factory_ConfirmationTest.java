package TestClass;

import BaseTest.BaseTest_DemoWebShop;
import PageClass.Factory_CheckoutPage;
import PageClass.Factory_ConfirmationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory_ConfirmationTest extends BaseTest_DemoWebShop {
    @Test(priority = 1)
    public void AddingItemsToCart() throws InterruptedException {
        // Created page object using page factory

        Factory_ConfirmationPage Confirmation = PageFactory.initElements(TestClassChromeDriver, Factory_ConfirmationPage.class);

        Confirmation.AddingItems();

        Confirmation.verifyPage();
        System.out.println("✅ Title verified.");

        Confirmation.InsertShippingInfo("789");
        Confirmation.verifyCheckoutPage();
        System.out.println("✅ Checkout page title verified.");

        Confirmation.InsertFormInfo("yash", "jayasiri", "yash@gmail.com", "colombo", "no.213/67,colcmbo", "789", "0987654");


        Confirmation.ContinueBtn4Click();
        Confirmation.ConfirmBtnClick();

        Confirmation.VerifyThank();
        System.out.println("✅ Confirmation page title verified.");

        Confirmation.LastConfirmBtnClick();

        Confirmation.VerifyHomePage();
        System.out.println("✅BackToHome page title verified.");





    }
}
