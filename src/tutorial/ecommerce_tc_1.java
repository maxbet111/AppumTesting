package tutorial; 


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.android.AndroidElement;


public class ecommerce_tc_1 extends Second1{
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		getDriver().hideKeyboard();	
		getDriver().findElement(By.xpath ("//*[@text='Female']")).click();
		getDriver().findElement(By.id("android:id/text1")).click();
		
		getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
		          + "new UiSelector().text(\"Argentina\"));"));
		
		getDriver().findElement(By.xpath ("//*[@text='Argentina']")).click();
		getDriver().findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		

	}

}

	


