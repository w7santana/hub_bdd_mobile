package br.com.rsinet.hub_bdd_mobile.stepDefinitions;

import org.junit.Assert;

import br.com.rsinet.hub_bdd_mobile.pages.HomePage;
import br.com.rsinet.hub_bdd_mobile.utility.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaHomeSteps {
	HomePage homePage = new HomePage();
	
	@Dado("^que estou na tela principal da aplicação$")
	public void que_estou_na_tela_principal_da_aplicação() throws Throwable {
	    DriverFactory.getDriver();
	}

	@Quando("^eu clicar em uma \"([^\"]*)\"$")
	public void eu_clicar_em_uma(String categoria) throws Throwable {
//	    homePage.clicaNaCategoria(categoria);
		Thread.sleep(3000);
		homePage.categoria(categoria).click();
	}

	@Quando("^eu clicar no \"([^\"]*)\"$")
	public void eu_clicar_no(String produto) throws Throwable {
		Thread.sleep(3000);
	    homePage.produtoDaCategoria(produto).click();
	}

	@Então("^um tela com a descrição do produto \"([^\"]*)\" deve ser apresentada$")
	public void um_tela_com_a_descrição_do_produto_deve_ser_apresentada(String produto) throws Throwable {
	    Thread.sleep(1000);
		Assert.assertTrue(homePage.lblProdutoEscolhido(produto).isDisplayed());
	}
	
	@Quando("^eu clicar no botão filtro$")
	public void eu_clicar_no_botão_filtro() throws Throwable {
		Thread.sleep(3000);
	    homePage.btnFiltro().click();
	}

	@Quando("^eu clicar no filtro Customization$")
	public void eu_clicar_no_filtro_Customization() throws Throwable {
	    homePage.filtroCustomization().click();
	}

	@Quando("^eu clicar no filtro dois em um$")
	public void eu_clicar_no_filtro_dois_em_um() throws Throwable {
	    homePage.filtro2_in_1().click();
	}

	@Quando("^eu clicar no filtro Memory$")
	public void eu_clicar_no_filtro_Memory() throws Throwable {
	    homePage.filtroMemory().click();
	}

	@Quando("^eu clicar no filtro desesseis GB$")
	public void eu_clicar_no_filtro_desesseis_GB() throws Throwable {
	    homePage.mem16Gb().click();
	}

	@Quando("^eu clicar no botão Aplicar Filtro$")
	public void eu_clicar_no_botão_Aplicar_Filtro() throws Throwable {
	    homePage.btnApplyFiltro().click();
	}

	@Então("^será apresentada uma mensagem na tela informando que o produto buscado não existe$")
	public void será_apresentada_uma_mensagem_na_tela_informando_que_o_produto_buscado_não_existe() throws Throwable {
	    Assert.assertTrue(homePage.lblNoResults().isDisplayed());
	}

}
