package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Test extends Second1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		
		getDriver().findElement(By.xpath ("//*[@text='Preference']")).click();
		getDriver().findElement(By.xpath ("//*[@text='3. Preference dependencies']")).click();
		getDriver().findElementById("android:id/checkbox").click();
		getDriver().findElementByXPath("(//android.widget.RelativeLayout)[2])").click();

	}

}
