package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Base {

	/*public static  AndroidDriver cababilities () throws MalformedURLException {
		// TODO Auto-generated method stub
		//Instantiate Appium Driver
		AndroidDriver<MobileElement> driver;
		try {
		   driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
		    System.out.println(e.getMessage());
		}
		DesiredCapabilities cap = new DesiredCapabilities();
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3 API 26" );
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
	
return driver;
	}
*/
}
