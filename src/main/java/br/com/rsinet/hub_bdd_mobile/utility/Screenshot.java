package br.com.rsinet.hub_bdd_mobile.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static br.com.rsinet.hub_bdd_mobile.utility.DriverFactory.getDriver;

import java.io.File;

public class Screenshot {
	public static String tirar(String arquivo) {
		File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/target/screenshot/" + arquivo + "-"
				+ Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
		return caminho;

	}
}