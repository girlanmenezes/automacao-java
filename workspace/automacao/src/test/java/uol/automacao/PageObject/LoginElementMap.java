package uol.automacao.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	protected WebElement username;
	protected WebElement password;
	@FindBy(xpath = "//*[@id=\"login-area\"]/form/fieldset/button")
	protected WebElement btnEntrar;
	@FindBy(id = "logo-publicador")
	protected WebElement logopublicador;

}
