package uol.automacao;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extentReport;
    private static ExtentTest extentTest;
	String baseURL = "http://publicador.qa.intranet/";
 
    @Before
    public void setup (Scenario cenario) {
    	

    	
    	// Inicialização do report
    	if(extentReport == null) {
    		extentReport = new ExtentReports();
    		htmlReporter = new ExtentHtmlReporter("src/test/resources/report.html");
    		extentReport.attachReporter(htmlReporter);
    		
        	//Configuração Report
        	htmlReporter.config().setTheme(Theme.DARK);
        	htmlReporter.config().setReportName("Publicador Automação");
        	htmlReporter.config().setDocumentTitle("Automação UOL");
    	}
    	
    	String cenarioID=formataString(cenario.getId());
    	extentTest = extentReport.createTest(cenarioID);
    	
   
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
        driver.navigate().to(baseURL);
 
        //Maximize Window
        driver.manage().window().maximize();
        //timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }
    public static ExtentTest getExtentTest() {
    	return extentTest;
    }
 
    @After
    public void teardown (Scenario cenario) {
    	
    	String cenarioLimpo=formataString(cenario.getName());
    	
    	if(cenario.isFailed()) {			
    		extentTest.log(Status.FAIL, "Cenario: " + cenarioLimpo);
        	extentReport.flush();
    	}
    	else {
    		extentTest.log(Status.PASS, "Cenario: " + cenarioLimpo);
        	extentReport.flush();
    	}
    	
    	if(driver !=null) {
    		driver.close();
    		driver.quit();
    	}
    	
    }
    
    
    //Metodos auxiliares
	public String formataString(String str) {
    	str = Normalizer.normalize(str, Normalizer.Form.NFD);
    	str = str.replaceAll("-", " ").replaceAll(";", ": ");
    	str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }
    
    //Wait Wrapper Method
    public static void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 30)
             .until(ExpectedConditions.visibilityOf(element));
 }
    
    
    public static String inputStreamToString(InputStream inputStream) {
        final int bufferSize = 8 * 1024;
        byte[] buffer = new byte[bufferSize];
        final StringBuilder builder = new StringBuilder();
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, bufferSize)) {
            while (bufferedInputStream.read(buffer) != -1) {
                builder.append(new String(buffer));
            }
        } catch (IOException ex) {
            Logger.getLogger(BaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return builder.toString();
    }

    public static void consumeInputStream(InputStream inputStream) {
        inputStreamToString(inputStream);
    }
 
    /*Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
 
    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
 
    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
 
    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
 
    }
    */
    
}