package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest_DemoWebShop {

    String BaseURL="https://demowebshop.tricentis.com";
    protected WebDriver TestClassChromeDriver;

    @BeforeTest
    public void BeforeTestMethod()
    {
        TestClassChromeDriver=new ChromeDriver();
        TestClassChromeDriver.manage().window().maximize();
        TestClassChromeDriver.get(BaseURL);
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();

        //TestClassChromeDriver.quit();
    }

}
