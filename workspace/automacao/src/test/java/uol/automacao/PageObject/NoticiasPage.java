package uol.automacao.PageObject;

import org.openqa.selenium.support.PageFactory;

import uol.automacao.BaseTest;

public class NoticiasPage extends NoticiasElementMap {

	public NoticiasPage() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}
	
	public void AcessarEditorialnoticiaProjetoGrafico() {
		noticiaProjetoGrafico.click();
	}
	
	public void preencherFormulario() {
		titulo.sendKeys("Teste");

		
		
	}

}
