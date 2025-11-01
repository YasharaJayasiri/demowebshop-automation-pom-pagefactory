package TestClass;

import BaseTest.BaseTest_DemoWebShop;
import PageClass.Factory_CheckoutPage;
import PageClass.Factory_ShippingCartPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory_CheckoutTest extends BaseTest_DemoWebShop {
    @Test(priority = 1)
    public void AddingItemsToCart() throws InterruptedException {
        // Created page object using page factory

        Factory_CheckoutPage Checkout = PageFactory.initElements(TestClassChromeDriver, Factory_CheckoutPage.class);

        Checkout.AddingItems();

        Checkout.verifyPage();
        System.out.println("✅ Title verified.");

        Checkout.InsertShippingInfo("789");
        Checkout.verifyCheckoutPage();
        System.out.println("✅ Checkout page title verified.");

        Checkout.InsertFormInfo("yash", "jayasiri", "yash@gmail.com", "colombo", "no.213/67,colcmbo", "789", "0987654");


        Checkout.ContinueBtn4Click();
        Checkout.ConfirmBtnClick();




    }
}
