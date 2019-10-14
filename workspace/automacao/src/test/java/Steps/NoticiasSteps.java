package Steps;

import com.aventstack.extentreports.ExtentTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import uol.automacao.BaseTest;
import uol.automacao.PageObject.InicioPage;
import uol.automacao.PageObject.LoginPage;

public class NoticiasSteps {
	
	ExtentTest extentTest = BaseTest.getExtentTest();
	LoginPage loginPage = new LoginPage();
	InicioPage inicioPage = new InicioPage();
	
	@Dado("^que eu esteja na tela de adicionar editoria$")
	public void que_eu_esteja_na_tela_de_adicionar_editoria() throws Throwable {
		
		loginPage.efetuarlogin("mce_gmenezes", "qL5*u!hof");
	}

	@Quando("^preencher todos os campos obrigatorios e acionar a opção publicar$")
	public void preencher_todos_os_campos_obrigatorios_e_acionar_a_opção_publicar() throws Throwable {
		inicioPage.navegarNoticiasEditoria();
	}

	@Entao("^o sistema deve apresentar a publicação conforme template$")
	public void o_sistema_deve_apresentar_a_publicação_conforme_template() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
