package tutorial; 


import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.android.AndroidElement;



import org.junit.Test;

public class ecommerce_tc_4Error extends Second1{
	
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
		
	     getDriver().findElement(MobileBy.AndroidUIAutomator
	    		 ("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\"))"
	    		 		+ ".scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	    // String text = null;
	   //  int count= getDriver().findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	     
	    List<WebElement> productNames = getDriver().findElements(By.id("com.androidsample.generalstore:id/productName"));
	    	int index = productNames.indexOf("Jordan 6 Rings");

	    	WebElement add_card = (WebElement) getDriver().findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(index);
	    	 
	    	 add_card.click();

	
	     getDriver().findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	     

	     String lastpageText=   getDriver().findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

	   
	     
	     assertEquals("Jordan 6 Rings", lastpageText);

	}
	
}
		
		

	



	


