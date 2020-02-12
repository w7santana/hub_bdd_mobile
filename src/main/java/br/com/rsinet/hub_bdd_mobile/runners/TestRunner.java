package br.com.rsinet.hub_bdd_mobile.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd_mobile.utility.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/resources/features/"
 ,glue={"br.com.rsinet.hub_bdd_mobile.stepDefinitions"}
 ,plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html", "json:target/report.json"}
 ,monochrome = true
 ,snippets = SnippetType.CAMELCASE
 ,dryRun = false
		
 )
public class TestRunner {
	@AfterClass
	/* Executa a leitura das configuracoes do extends report */
	public static void writeExtentReport() {
		/* Informa o caminho onde esta localizado minhas configuracoes em XML do Extend Report */
		Reporter.loadXMLConfig(new File("src/main/resources/configs/extension-config.xml"));
		
		/* Informa qual o sistema foi utilizado para efetuar os testes */
		Reporter.setSystemInfo("OS", "Windows10");
		
		/* Informa o nome do analista no relatorio */
		Reporter.setSystemInfo("Tester Name", "Willian Santana");
		
		DriverFactory.getDriver().resetApp();
	}

}
