package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Second1 {

		private static AppiumDriver driver;
		private static void intializeAppiumDriver() {
			File appDir = new File("src");
			File app = new File(appDir, "General-Store.apk");

	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.getCentralData("PlatformVersion"));
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3 API 26");
	        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	      
	            //capabilities.setCapability(APPLICATION_NAME, app.getAbsolutePath());
	            //capabilities.setCapability(APP_PACKAGE, CommonUtils.getCentralData("AppPackage"));
	            //capabilities.setCapability(APP_ACTIVITY, CommonUtils.getCentralData("AppActivity"));
	       
	      
	        //capabilities.setCapability(FULL_RESET, CommonUtils.getCentralData("FullReset"));
	        //capabilities.setCapability(NO_RESET, CommonUtils.getCentralData("NoReset"));
	        //capabilities.setCapability("udid", CommonUtils.getCentralData("UDID"));
	        //capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, CommonUtils.getCentralData("WaitTimeoutInSeconds"));

	        try {
	            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	    }

	    public static AppiumDriver getDriver() {
	    	if (driver == null) {
	            intializeAppiumDriver();
	        }
	        return driver;
	    }
	}
		
	


