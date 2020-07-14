package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//la ruta del arhivo feature.java
		features = "src/test/java/features",
		glue="stepDefinitions")//nombre el paquete donde esta el archivo feature.java
		
				
public class TestRunner {

}
