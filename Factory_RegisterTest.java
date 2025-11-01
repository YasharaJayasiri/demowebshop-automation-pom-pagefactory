package TestClass;

import BaseTest.BaseTest_DemoWebShop;
import PageClass.Factory_FacebookLoginPage;
import PageClass.Factory_RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Factory_RegisterTest extends BaseTest_DemoWebShop {


    @Test(priority = 1)
    public void  Registration()
    {
        // Created page object using page factory
        Factory_RegisterPage Register = PageFactory.initElements(TestClassChromeDriver,Factory_RegisterPage.class);
        Register.InsertDataToRegister("harass","ash123","bhbhbhbhbhbhh@gmail.com","bbhh@123","bbhh@123");

        Register.verifyPage();
        System.out.println("✅ Category title verified.");

        Register.clickContinueButton();




    }


}
