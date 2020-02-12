package br.com.rsinet.hub_bdd_mobile.pages;

import static br.com.rsinet.hub_bdd_mobile.utility.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class CadastroPage extends BasePage {
	
	public  MobileElement campoApelido() throws Exception {
		return getDriver().findElementByXPath
		("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/android.widget.EditText");
	}
	
	public  MobileElement campoEmail() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/android.widget.EditText");

	}
	
	public  MobileElement campoSenha() {
		return getDriver().findElementByXPath
		("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/android.widget.EditText");
	}
	
	public  MobileElement campoConfirmaSenha() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/android.widget.EditText");
	}
	
	public  MobileElement campoNome() {
		return getDriver().findElementByXPath
		("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/android.widget.EditText");
	}
	
	public  MobileElement campoUltimoNome() {
		return getDriver().findElementByXPath
		("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/android.widget.EditText");
	}
	
	public  MobileElement campoTelefone() {
		return getDriver().findElementByXPath
		("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/android.widget.EditText");
	}
	
	public  MobileElement campoPais() {
		return getDriver().findElementById("com.Advantage.aShopping:id/linearLayoutCountry");
	}
	
	public void selecionaPais(String pais) {
		getDriver().findElementByAndroidUIAutomator
		("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ pais + "\").instance(0))").click();
	}
	
	public  MobileElement campoEstado() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/android.widget.EditText");
	}
	
	public  MobileElement campoEndereco() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/android.widget.EditText");
	}
	
	public  MobileElement campoCidade() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/android.widget.EditText");
	}
	
	public  MobileElement campoCep() {
		return getDriver().findElementByXPath
				("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/android.widget.EditText");
	}
	
	public  MobileElement botaoParaRegistrar() {
		return getDriver().findElementById("com.Advantage.aShopping:id/buttonRegister");
	}

	public MobileElement lblMinimoCaracteresUsuarioInvalido() {
		return retornarElemento(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/*[@text='Use 5 characters or longer']"));
	}
	
}
