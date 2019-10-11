package uol.automacao;

import java.text.Normalizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import gherkin.formatter.model.Scenario;
import cucumber.api.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

 
public class BaseTest {
    public static WebDriver driver;
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
    
    
    public String formataString(String str) {
    	str = Normalizer.normalize(str, Normalizer.Form.NFD);
    	str = str.replaceAll("-", " ").replaceAll(";", ": ");
    	str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }
    
}