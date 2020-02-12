package br.com.rsinet.hub_bdd_mobile.pages;


import static br.com.rsinet.hub_bdd_mobile.utility.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;

public class HomePage extends BasePage {

	public MobileElement campoPesquisa() {
		return getDriver().findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
	}

	public MobileElement lblNoResults() {
		return getDriver().findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"));
	}

	public MobileElement categoria(String categoria) {
		return getDriver().findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ categoria + "\").instance(0))");
	}
	
	public MobileElement produtoDaCategoria(String categoria) {
		return getDriver().findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ categoria + "\").instance(0))");
	}
	
	public void clicaNaCategoria(String categoria) {
//		return obterElementoPorTexto(categoria);
		scrollToText(getDriver(), "MICE");
	}

	public WebElement escolheProdutoDaCategoria(String produto) throws Exception {
		return getDriver().findElement(By.xpath("//*[@text='"+produto+"']"));
	}
	
	
	public MobileElement lblProdutoEscolhido(String produto) {
		return getDriver().findElement(By.xpath("//*[@text='" + produto + "']"));
	}
	
	public MobileElement btnFiltro() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.Advantage.aShopping:id/gridViewProducts")));
		return getDriver().findElementById("com.Advantage.aShopping:id/imageViewFilter");
	}
	
	public MobileElement filtroCustomization() {
		return (MobileElement) wait.until(ExpectedConditions.visibilityOf(obterElementoPorTexto("BY CUSTOMIZATION")));
	}
	
	public MobileElement filtro2_in_1() {
		return getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"));
	}
	
	public MobileElement filtroMemory() {
		return obterElementoPorTexto("BY MEMORY");
	}
	
	public MobileElement mem16Gb() {
		return obterElementoPorTexto("16GB DDR3 - 2 DIMM");
	}
	
	public MobileElement btnApplyFiltro() {
		return getDriver().findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
	}

	public MobileElement menuLateral() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
	}

	public RemoteWebElement btnLogin() {
		return getDriver().findElementById("com.Advantage.aShopping:id/textViewMenuUser");
	}
	
	public MobileElement usuarioLogado() {
		return getDriver().findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
	}

	public MobileElement clicaNaLupa() {
		return getDriver().findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
	}

}
