import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "11");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\pc\\ApkProjects\\Otelz\\Otelz.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout");
        el1.click();
        (new TouchAction(driver))
                .press(PointOption.point([object Object], undefined}))
            .moveTo(PointOption.point(undefined, undefined}))
        .release()
        .perform();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_one_time_button");
        el2.click();
        (new TouchAction(driver))
        .press(PointOption.point([object Object], undefined}))
        .moveTo(PointOption.point(undefined, undefined}))
        .release()
        .perform();
        MobileElement el3 = (MobileElement) driver.findElementById("com.otelz.mobil:id/materialButtonContinue");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvSearchHome");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView[1]");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.otelz.mobil:id/textView3");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[23]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[24]/android.widget.TextView");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvCheckDaysAndContinue");
        el9.click();
        driver.context("NATIVE_APP");
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]");
        el10.click();
        driver.context("NATIVE_APP");
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]");
        el11.click();
        driver.context("NATIVE_APP");
        MobileElement el12 = (MobileElement) driver.findElementById("com.otelz.mobil:id/btnChooseRoom");
        el12.click();
        driver.context("NATIVE_APP");
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView");
        el13.click();
        driver.context("NATIVE_APP");
        driver.context("NATIVE_APP");
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView");
        el14.click();
        driver.context("NATIVE_APP");
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.ImageButton[2]");
        el16.click();
        driver.context("NATIVE_APP");
        MobileElement el17 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvPersonalInfoName");
        el17.click();
        el17.sendKeys("Oğulcan");
        MobileElement el18 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvPersonalInfoSurname");
        el18.click();
        el18.sendKeys("Karacan");
        MobileElement el19 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvPersonalInfoMail");
        el19.click();
        el19.sendKeys("deneme@gmail.com");
        MobileElement el20 = (MobileElement) driver.findElementById("com.otelz.mobil:id/etPersonalInfoPhoneCode");
        el20.click();
        driver.context("NATIVE_APP");
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvPersonalInfoPhone");
        el22.click();
        el22.sendKeys("505 555 55 55");
        MobileElement el23 = (MobileElement) driver.findElementById("com.otelz.mobil:id/tvPersonalInfoCountry");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementById("com.otelz.mobil:id/checkBoxSaveInfo");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementById("com.otelz.mobil:id/checkBoxIllumination");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementById("com.otelz.mobil:id/checkBoxPermission");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementById("com.otelz.mobil:id/btnPersonalInfoNext2");
        el28.click();
        MobileElement el32 = (MobileElement) driver.findElementById("com.otelz.mobil.reservationSteps:id/tvCouponUse");
        el32.click();
        MobileElement el33 = (MobileElement) driver.findElementById("com.otelz.mobil.reservationSteps:id/etCouponCode");
        el33.click();
        el33.sendKeys("PSD483");
        MobileElement el34 = (MobileElement) driver.findElementById("com.otelz.mobil.reservationSteps:id/button4");
        el34.click();
        driver.context("NATIVE_APP");
        MobileElement el35 = (MobileElement) driver.findElementById("android:id/button1");
        el35.click();
        }

@After
public void tearDown() {
        driver.quit();
        }
        }