package uol.automacao.PageObject;

import org.openqa.selenium.support.PageFactory;

import uol.automacao.BaseTest;

public class ClientePage extends ClienteElementMap {
	
	

	public ClientePage() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}

	public void efetuarlogin(String usuario, String senha) {
		username.sendKeys(usuario);
		password.sendKeys(senha);
		btnEntrar.click();
	}

}
