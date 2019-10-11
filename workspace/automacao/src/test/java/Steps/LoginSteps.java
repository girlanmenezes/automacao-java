package Steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import uol.automacao.BaseTest;
import uol.automacao.PageObject.ClientePage;

public class ClientSteps {
	ExtentTest extentTest = BaseTest.getExtentTest();

	@Dado("^que eu esteja na tela de login$")
	public void que_eu_esteja_na_tela_de_login() throws Throwable {
		System.out.println("Pendente de implemesssssssssntar");
		System.out.println("Pendente de implemesssssssssntar");
	}
	
	@Quando("^preencher o campo usuario \"([^\"]*)\" e senha \"([^\"]*)\" e clicar no botao entrar$")
	public void preencher_o_campo_usuario_e_senha_e_clicar_no_botao_entrar(String usuario, String senha) throws Throwable {
		ClientePage clientePage = new ClientePage();
		clientePage.efetuarlogin(usuario, senha);
	}

	@Entao("^o sistema realiza login e apresenta a tela inicial$")
	public void o_sistema_realiza_login_e_apresenta_a_tela_inicial() throws Throwable {
		
		
		extentTest.log(Status.PASS, "O sistema realzia pre pre pre");
		
	System.out.println("Pendente de implementar");
	}  
	
}



