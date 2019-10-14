package uol.automacao.PageObject;
import org.openqa.selenium.support.PageFactory;
import uol.automacao.BaseTest;

public class InicioPage extends InicioElementMap {

	public InicioPage() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}
	
	public void navegarNoticiasEditoria() {
		news.click();
		editorialReferencia.click();
	}

}
