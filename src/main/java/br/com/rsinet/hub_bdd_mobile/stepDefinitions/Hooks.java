package br.com.rsinet.hub_bdd_mobile.stepDefinitions;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd_mobile.utility.DriverFactory;
import br.com.rsinet.hub_bdd_mobile.utility.Generator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	@Before
	public void beforeCenario() {
		DriverFactory.getDriver();
	}
	
	@After(order=1)
	public void afterCenario(Scenario scenario) {
		
		File screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + scenario.getName() + "-"
				+ Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
		DriverFactory.killDriver();
	}

	
}
