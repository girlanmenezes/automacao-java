package uol.automacao.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InicioElementMap {
	
	
	
	protected WebElement news;
	
	
	/*
	@FindBy(xpath = "//*[@id=\"news\"]/div/div[2]/h3/input")
	protected WebElement buscar;
	*/
	@FindBy(css="a[href*='metatemplate-referencia']")
	protected WebElement editorialReferencia;
	
}
