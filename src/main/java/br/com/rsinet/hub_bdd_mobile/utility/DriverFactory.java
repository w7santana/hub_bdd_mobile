package br.com.rsinet.hub_bdd_mobile.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver(); 
		}
		return driver;
	}
	
	private static  void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "Meu Aparelho");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.Advantage.aShopping");
	    desiredCapabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\willian.costa\\eclipse-workspace\\servlets\\hub_bdd_mobile\\src\\main\\resources\\Advantage+demo+2_2.apk");
	    desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		desiredCapabilities.setCapability("unicodeKeyboard", true);   
		desiredCapabilities.setCapability("resetKeyboard", true);
		
		try {
			//(DRIVER DE CONEXAO) COM QUEM VOU ME CONECTAR
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;  //PARA NAO RECEBER UM DRIVER COM SESSAO JA ENCERRADA
		}
	}
	
}
