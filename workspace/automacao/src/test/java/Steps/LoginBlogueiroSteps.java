package Steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import uol.automacao.PageObject.LoginBlogueiroTermoAceite;
import uol.automacao.PageObject.LoginPage;

public class LoginBlogueiroSteps {
	

	LoginPage loginPage = new LoginPage();
	LoginBlogueiroTermoAceite loginBlogueiroTermoAceite = new LoginBlogueiroTermoAceite();
	
	
	@Dado("^que eu esteja na tela de login e tenha o perfil de bloqueiro e não tenha realizado o aceitado o termo$")
	public void que_eu_esteja_na_tela_de_login_e_tenha_o_perfil_de_bloqueiro_e_não_tenha_realizado_o_aceitado_o_termo() throws Throwable {
		loginBlogueiroTermoAceite.limparAceite();

	}

	@Entao("^o sistema realiza login e apresenta a tela de termo de aceite$")
	public void o_sistema_realiza_login_e_apresenta_a_tela_de_termo_de_aceite() throws Throwable {
		loginBlogueiroTermoAceite.validaTermo();	
	}

	@Entao("^irei realizar o aceite do termo de serviço$")
	public void irei_realizar_o_aceite_do_termo_de_serviço() throws Throwable {
		loginBlogueiroTermoAceite.aceitarTermo();

	}
	
	
	
	// Segundo Cenario
	@Dado("^que eu esteja na tela de login e tenha o perfil de bloqueiro tenha realizado o aceitado o termo$")
	public void que_eu_esteja_na_tela_de_login_e_tenha_o_perfil_de_bloqueiro_tenha_realizado_o_aceitado_o_termo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
}
