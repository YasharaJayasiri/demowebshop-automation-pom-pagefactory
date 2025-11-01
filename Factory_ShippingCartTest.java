package TestClass;

import BaseTest.BaseTest_DemoWebShop;
import PageClass.Factory_AddToCartPage;
import PageClass.Factory_ShippingCartPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory_ShippingCartTest extends BaseTest_DemoWebShop {

    @Test(priority = 1)
    public void AddingItemsToCart() {
        // Created page object using page factory

        Factory_ShippingCartPage ShippingCart = PageFactory.initElements(TestClassChromeDriver, Factory_ShippingCartPage.class);

        ShippingCart.AddingItems();

        ShippingCart.verifyPage();
        System.out.println("✅ Title verified.");

        ShippingCart.InsertShippingInfo("789");
        ShippingCart.verifyCheckoutPage();
        System.out.println("✅ Checkout page title verified.");





    }
}
