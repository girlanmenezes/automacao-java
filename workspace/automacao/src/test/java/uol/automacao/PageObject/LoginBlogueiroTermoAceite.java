package uol.automacao.PageObject;


import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import uol.automacao.BaseTest;


public class LoginBlogueiroTermoAceite extends LoginBlogueiroTermoAceiteElementMap {

	ExtentTest extentTest = BaseTest.getExtentTest();
	
	public LoginBlogueiroTermoAceite() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}
	
	
	public void aceitarTermo() {
		chkterms.click();
		btnterms.click();
	}
	
	public void validaTermo() {
		
		BaseTest.waitForVisibility(chkterms);
	}
	
	
	
	
	
public void limparAceite() throws IOException {   

	        String command = "curl -X DELETE http://10.133.132.61:8098/buckets/migrado-userterm/keys/blg_qaum";
	       // String command = "curl -X POST https://postman-echo.com/post --data foo1=bar1&foo2=bar2";
	        Process process = Runtime.getRuntime().exec(command);
	        
	        // Get the delete result
	        String content = BaseTest.inputStreamToString(process.getInputStream());

	        //Assert.assertTrue(null != content && !content.isEmpty());  
	        System.out.println(content);
	    }
}
