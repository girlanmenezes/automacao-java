package uol.automacao.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBlogueiroTermoAceiteElementMap {
	
	//@FindBy(id = "acept_terms")
	
	@FindBy(css="label[for='acept_terms']")
	protected WebElement chkterms;
	
	@FindBy(id = "accept-terms")
	protected WebElement btnterms;
	
}
