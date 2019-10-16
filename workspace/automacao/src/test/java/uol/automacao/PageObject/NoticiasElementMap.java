package uol.automacao.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoticiasElementMap {

	
	// ***************** MT *************
	//Editorial template de referencia noticiaProjetoGrafico
	@FindBy(css="a[href*='noticiaProjetoGrafico']")
	protected WebElement noticiaProjetoGrafico;
	
	//Editorial template de referencia ExportJson com gif
	@FindBy(css="a[href*='modelogifexportjson']")
	protected WebElement modelogifexportjson;
	
	//Editorial template de referencia Export para commons
	@FindBy(css="a[href*='exportParaCommons']")
	protected WebElement exportParaCommons;
	
	//Editorial template de referencia Mais de 10 exports
	@FindBy(css="a[href*='multiplosExport']")
	protected WebElement multiplosExport;
	
	// ***************** CAMPOS FORMULARIO *************
	
	@FindBy(name = "noticia/conteudo/titulo")
	protected WebElement titulo;
	
	@FindBy(name = "noticia/conteudo/autor")
	protected WebElement autor;
	
	@FindBy(name = "noticia/conteudo/local")
	protected WebElement local;
	
	@FindBy(tagName= "a")
	protected WebElement txt;
	
	
}
