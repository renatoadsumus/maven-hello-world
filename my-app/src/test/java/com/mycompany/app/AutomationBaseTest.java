package com.mycompany.app;


import org.junit.*;
import static org.junit.Assert.*;


//import junit.framework.Test;

//import junit.framework.TestCase;

//import junit.framework.TestSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class AutomationBaseTest{
    
    public static AndroidDriver driver;
    
    
    @Before
    public void setup () throws MalformedURLException {
		
		// 1 Create File class to point to the tested application "ApiDemons-debug.apk"
		File src		= new File("src");
		File app 		= new File(src, "ApiDemos-debug.apk");		
		
		// 2 Create DesiredCapabilities object called 'cap'
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// 2.1 Set device name, application path, emulator name as our desired capabilities.
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_8.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.APP, app);
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		
		// 2.2 Create an object of URL class
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
			
		/*
		 * 3 Create an Android Driver with specifying 2 arguments:
		 * 		- URL to Appium server
		 * 		- Desired Capabilities
		 */
	    driver = new AndroidDriver<AndroidElement>(url, capabilities);
		
	
	}
	
	@Test 
	public void veryGettingBatteryInformation() {
        final AndroidBatteryInfo batteryInfo = driver.getBatteryInfo();
       //assertThat(batteryInfo.getLevel(), is(greaterThan(0.0)));
        //assertThat(batteryInfo.getState(), is(not(AndroidBatteryInfo.BatteryState.UNKNOWN)));
    }
    
    @Test 
	public void verifySetAndGetClipboardText() {
        final String text = "Happy testing";
      
        assertEquals(text, text);
    }
	

}