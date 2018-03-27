import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shifangfang on 18/3/26.
 */
public class test1 {

@Test
  /*模拟器上打开雪球app
  */
  public void click(){
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "192.168.56.101:5555");
    capabilities.setCapability("appPackage", "com.xueqiu.android");
    capabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
    try {
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
    //capabilities.setCapability("automationName", "uiautomator2");

    }

}
