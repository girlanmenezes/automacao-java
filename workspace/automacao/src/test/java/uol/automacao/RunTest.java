package uol.automacao;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/",
glue = { "" }, plugin ={"pretty" , "html:Folder_Name"}, monochrome = true, dryRun = false)
public class RunTest {

}

