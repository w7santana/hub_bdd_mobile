package br.com.rsinet.hub_bdd_mobile.pages;

import static br.com.rsinet.hub_bdd_mobile.utility.DriverFactory.getDriver;

import io.appium.java_client.MobileElement;

public class LoginPage extends BasePage {

	public MobileElement btnCriarConta() {
		return getDriver().findElementById("com.Advantage.aShopping:id/textViewSingUpToday");
	}
	
	

}
