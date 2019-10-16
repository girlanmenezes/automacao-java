package Steps;

import com.aventstack.extentreports.ExtentTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import uol.automacao.BaseTest;
import uol.automacao.PageObject.InicioPage;
import uol.automacao.PageObject.LoginPage;
import uol.automacao.PageObject.NoticiasPage;

public class NoticiasSteps {
	
	ExtentTest extentTest = BaseTest.getExtentTest();
	LoginPage loginPage = new LoginPage();
	InicioPage inicioPage = new InicioPage();
	NoticiasPage noticiasPage = new NoticiasPage();
	BaseTest baseTest  = new BaseTest();
	
	
	
	@Dado("^que eu tenha realizado login$")
	public void que_eu_tenha_realizado_login() throws Throwable {
		loginPage.efetuarlogin("mce_gmenezes", "qL5*u!hof");
	}
	
	@Dado("^que eu esteja na tela de adicionar editoria noticiaProjetoGrafico$")
	public void que_eu_esteja_na_tela_de_adicionar_editoria_noticiaProjetoGrafico() throws Throwable {
		inicioPage.navegarTodosNoticias();
		noticiasPage.AcessarEditorialnoticiaProjetoGrafico();
		inicioPage.adicionar();
	}
	

	@Quando("^preencher todos os campos obrigatorios e acionar a opção publicar$")
	public void preencher_todos_os_campos_obrigatorios_e_acionar_a_opção_publicar() throws Throwable {
		noticiasPage.preencherFormulario();
		baseTest.teste();
		
		
	}

	@Entao("^o sistema deve apresentar a publicação conforme template$")
	public void o_sistema_deve_apresentar_a_publicação_conforme_template() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
