package br.com.rsinet.hub_bdd_mobile.stepDefinitions;


import org.junit.Assert;

import br.com.rsinet.hub_bdd_mobile.pages.HomePage;
import br.com.rsinet.hub_bdd_mobile.utility.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaLupaSteps {
	
	private HomePage homePage = new HomePage();

	@Dado("^que estou na tela inicial da aplicação$")
	public void que_estou_na_tela_inicial_da_aplicação() throws Throwable {
	    DriverFactory.getDriver();
	}
	
	@Quando("^eu clicar no campo de pesquisa$")
	public void eu_clicar_no_campo_de_pesquisa() throws Throwable {
	    homePage.clicaNaLupa();
	}


	@Quando("^eu preencher o campo pesquisa com o nome de um produto \"([^\"]*)\"$")
	public void eu_preencher_o_campo_pesquisa_com_o_nome_de_um_produto(String produtoExistente) throws Throwable {
		homePage.campoPesquisa().sendKeys(produtoExistente);
	}
	
	@Quando("^eu preencher o campo pesquisa com o nome de um \"([^\"]*)\"$")
	public void eu_preencher_o_campo_pesquisa_com_o_nome_de_um(String produtoExistente) throws Throwable {
		homePage.campoPesquisa().sendKeys(produtoExistente);
	}
	
	@Quando("^eu preencher o campo pesquisa com um \"([^\"]*)\"$")
	public void eu_preencher_o_campo_pesquisa_com_um(String produtoInexistente) throws Throwable {
	    homePage.campoPesquisa().sendKeys(produtoInexistente);
	}

	@Quando("^clicar na lupa$")
	public void clicar_na_lupa() throws Throwable {
		homePage.clicaNaLupa().click();
	}

	@Então("^o \"([^\"]*)\" que eu pesquisei deverá ser exibido na tela$")
	public void o_que_eu_pesquisei_deverá_ser_exibido_na_tela(String produtoExistente) throws Throwable {
		Assert.assertTrue(homePage.existeElementoPorTexto(produtoExistente));
	}

	@Então("^será apresentada uma mensagem informando não há resultados para a palavra pesquisada$")
	public void será_apresentada_uma_mensagem_informando_não_há_resultados_para_a_palavra_pesquisada() throws Throwable {
		Assert.assertTrue(homePage.lblNoResults().isDisplayed());
	}

}
