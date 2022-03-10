import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SwagLabsLogin{
@Test
    public void login() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel 3");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app","/Users/gowthamipv/IdeaProjects/LoginPage/src/test/resources/app/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");


    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
    Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")).click();
    Thread.sleep(3000);

    TouchAction t = new TouchAction<>(driver);
    t.tap(PointOption.point(509,1808)).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]")).sendKeys("Gowthami");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]")).sendKeys("PV");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")).sendKeys("563122");
    Thread.sleep(3000);
    t.tap(PointOption.point(521,1563)).perform();
    Thread.sleep(3000);
    t.press(PointOption.point(597,1883)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(PointOption.point(573,559)).release().perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]")).click();
    Thread.sleep(3000);
    driver.quit();
}
}
