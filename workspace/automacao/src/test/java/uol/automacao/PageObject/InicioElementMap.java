package uol.automacao.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InicioElementMap {
	
	
	// Midias
	protected WebElement news;
	protected WebElement image;
	protected WebElement score;
	protected WebElement album;
	protected WebElement audio;
	protected WebElement blog;
	protected WebElement bulletin;
	protected WebElement poll;
	protected WebElement card;
	protected WebElement movie;
	protected WebElement gif;
	protected WebElement guide;
	protected WebElement mixed;
	protected WebElement indoor;
	protected WebElement infographic;
	protected WebElement module;
	protected WebElement product;
	protected WebElement quiz;
	protected WebElement recipe;
	protected WebElement tagpage;
	protected WebElement transcription;
	protected WebElement video;
	
	
	
	
	//BTN Todos por midia
	@FindBy(xpath = "//*[@id='news']/div/div[2]/h3")
	protected WebElement newsTodos;
	
	@FindBy(xpath = "//*[@id='image']/div/div[2]/h3")
	protected WebElement imageTodos;

	@FindBy(xpath = "//*[@id='score']/div/div[2]/h3")
	protected WebElement scoreTodos;
	
	@FindBy(xpath = "//*[@id='album']/div/div[2]/h3")
	protected WebElement albumTodos;
	
	@FindBy(xpath = "//*[@id='audio']/div/div[2]/h3")
	protected WebElement audioTodos;
	
	@FindBy(xpath = "//*[@id='blog']/div/div[2]/h3")
	protected WebElement blogTodos;
	
	@FindBy(xpath = "//*[@id='bulletin']/div/div[2]/h3")
	protected WebElement bulletinTodos;
	
	@FindBy(xpath = "//*[@id='poll']/div/div[2]/h3")
	protected WebElement pollTodos;
	
	@FindBy(xpath = "//*[@id='card']/div/div[2]/h3")
	protected WebElement cardTodos;
	
	@FindBy(xpath = "//*[@id='movie']/div/div[2]/h3")
	protected WebElement movieTodos;
	
	@FindBy(xpath = "//*[@id='gif']/div/div[2]/h3")
	protected WebElement gifTodos;
	
	@FindBy(xpath = "//*[@id='guide']/div/div[2]/h3")
	protected WebElement guideTodos;
	
	@FindBy(xpath = "//*[@id='mixed']/div/div[2]/h3")
	protected WebElement mixedTodos;
	
	@FindBy(xpath = "//*[@id='indoor']/div/div[2]/h3")
	protected WebElement indoorTodos;
	
	@FindBy(xpath = "//*[@id='infographic']/div/div[2]/h3")
	protected WebElement infographicTodos;
	
	@FindBy(xpath = "//*[@id='module']/div/div[2]/h3")
	protected WebElement moduleTodos;
	
	@FindBy(xpath = "//*[@id='product']/div/div[2]/h3")
	protected WebElement productTodos;
	
	@FindBy(xpath = "//*[@id='quiz']/div/div[2]/h3")
	protected WebElement quizTodos;
	
	@FindBy(xpath = "//*[@id='recipe']/div/div[2]/h3")
	protected WebElement recipeTodos;
	
	@FindBy(xpath = "//*[@id='tagpage']/div/div[2]/h3")
	protected WebElement tagpageTodos;
	
	@FindBy(xpath = "//*[@id='transcription']/div/div[2]/h3")
	protected WebElement transcriptionTodos;
	
	@FindBy(xpath = "//*[@id='video']/div/div[2]/h3")
	protected WebElement videoTodos;
	
	// BTN Adicionar
	@FindBy(xpath = "//*[@id='modules']/div[2]/button")
	protected WebElement adicionar;
	
	
}
