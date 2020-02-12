package br.com.rsinet.hub_bdd_mobile.stepDefinitions;

import org.junit.Assert;

import br.com.rsinet.hub_bdd_mobile.pages.CadastroPage;
import br.com.rsinet.hub_bdd_mobile.pages.HomePage;
import br.com.rsinet.hub_bdd_mobile.pages.LoginPage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	private HomePage homePage = new HomePage();
	private CadastroPage cadastroPage = new CadastroPage();
	private LoginPage loginPage = new LoginPage();
	
	@Quando("^eu clicar no menu lateral$")
	public void eu_clicar_no_menu_lateral() throws Throwable {
		homePage.menuLateral().click();
	}

	@Quando("^clicar no botão Login$")
	public void clicar_no_botão_Login() throws Throwable {
		homePage.btnLogin().click();
	}

	@Quando("^clicar no botão SIGN UP TODAY$")
	public void clicar_no_botão_SIGN_UP_TODAY() throws Throwable {
	    loginPage.btnCriarConta().click();
	}

	@Quando("^preencher o campo user name com \"([^\"]*)\"$")
	public void preencher_o_campo_user_name_com(String userName) throws Throwable {
	    cadastroPage.campoApelido().click();
	    cadastroPage.campoApelido().sendKeys(cadastroPage.geraUsuario(10));
	}

	@Quando("^preencher o campo email com \"([^\"]*)\"$")
	public void preencher_o_campo_email_com(String email) throws Throwable {
	    cadastroPage.campoEmail().click();
	    cadastroPage.campoEmail().sendKeys(email);
	}

	@Quando("^preencher o campo password com \"([^\"]*)\"$")
	public void preencher_o_campo_password_com(String senha) throws Throwable {
	    cadastroPage.campoSenha().click();
	    cadastroPage.campoSenha().sendKeys(senha);
	}

	@Quando("^preencher o campo confirm password com \"([^\"]*)\"$")
	public void preencher_o_campo_confirm_password_com(String confirmPassword) throws Throwable {
	    cadastroPage.campoConfirmaSenha().click();
	    cadastroPage.campoConfirmaSenha().sendKeys(confirmPassword);
	    cadastroPage.scrollDown(0.8, 0.2);
	}

	@Quando("^preencher o campo first name password com \"([^\"]*)\"$")
	public void preencher_o_campo_first_name_password_com(String firstName) throws Throwable {
	    cadastroPage.campoNome().click();
	    cadastroPage.campoNome().sendKeys(firstName);
	}

	@Quando("^preencher o campo last name password com \"([^\"]*)\"$")
	public void preencher_o_campo_last_name_password_com(String password) throws Throwable {
	    cadastroPage.campoUltimoNome().click();
	    cadastroPage.campoUltimoNome().sendKeys(password);
	}

	@Quando("^preencher o campo phone number com \"([^\"]*)\"$")
	public void preencher_o_campo_phone_number_com(String phone) throws Throwable {
	    cadastroPage.campoTelefone().click();
	    cadastroPage.campoTelefone().sendKeys(phone);
	}

	@Quando("^selecionar o pais \"([^\"]*)\"$")
	public void selecionar_o_pais(String pais) throws Throwable {
		Thread.sleep(1000);
		cadastroPage.campoPais().click();
	    cadastroPage.selecionaPais(pais);
	    cadastroPage.scrollDown(0.8, 0.2);
	}

	@Quando("^preencher o campo estate com \"([^\"]*)\"$")
	public void preencher_o_campo_estate_com(String estate) throws Throwable {
	    cadastroPage.campoEstado().click();
	    cadastroPage.campoEstado().sendKeys(estate);
	}

	@Quando("^preencher o campo address com \"([^\"]*)\"$")
	public void preencher_o_campo_address_com(String address) throws Throwable {
	    cadastroPage.campoEndereco().click();
	    cadastroPage.campoEndereco().sendKeys(address);
	}

	@Quando("^preencher o campo city com \"([^\"]*)\"$")
	public void preencher_o_campo_city_com(String city) throws Throwable {
	    cadastroPage.campoCidade().click();
	    cadastroPage.campoCidade().sendKeys(city);
	}

	@Quando("^preencher o campo zip com \"([^\"]*)\"$")
	public void preencher_o_campo_zip_com(String zip) throws Throwable {
	    cadastroPage.campoCep().click();
	    cadastroPage.campoCep().sendKeys(zip);
	}

	@Quando("^clicar no botão register$")
	public void clicar_no_botão_register() throws Throwable {
	    cadastroPage.botaoParaRegistrar().click();
	}

	@Então("^o poderei ver meu nome de usuário$")
	public void o_poderei_ver_meu_nome_de_usuário() throws Throwable {
	    Assert.assertNotNull(homePage.usuarioLogado().getText());
	}
	
	@Quando("^digitar no campo user name \"([^\"]*)\"$")
	public void digitarNoCampoUserName(String arg1) throws Throwable {
	    cadastroPage.campoApelido().click();
	    cadastroPage.campoApelido().sendKeys(cadastroPage.geraUsuario(4));
	}
	
	@Quando("^clicar no campo email$")
	public void clicar_no_campo_email() throws Throwable {
	    cadastroPage.campoEmail().click();
	}

	@Então("^será apresentada uma mensagem dizendo que o mínimo de caracteres não foi atingido$")
	public void será_apresentada_uma_mensagem_dizendo_que_o_mínimo_de_caracteres_não_foi_atingido() throws Throwable {
	    Assert.assertTrue(cadastroPage.lblMinimoCaracteresUsuarioInvalido().isDisplayed());
	}

}
