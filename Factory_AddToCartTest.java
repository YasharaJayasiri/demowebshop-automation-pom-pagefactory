package TestClass;

import BaseTest.BaseTest_DemoWebShop;
import PageClass.Factory_AddToCartPage;
import PageClass.Factory_RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory_AddToCartTest extends BaseTest_DemoWebShop {


    @Test(priority = 1)
    public void AddingItemsToCart()
    {
        // Created page object using page factory

        Factory_AddToCartPage AddToCart = PageFactory.initElements(TestClassChromeDriver,Factory_AddToCartPage.class);

        AddToCart.AddingItems();

        AddToCart.verifyPage();
        System.out.println("✅ Category title verified.");






    }

}
