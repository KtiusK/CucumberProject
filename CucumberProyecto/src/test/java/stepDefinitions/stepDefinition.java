package stepDefinitions;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class stepDefinition {

	    @Given("^Usuario se logea en la pagina$")
	    public void usuario_se_logea_en_la_pagina() throws Throwable {
	       //codigo de login to pagina url
	    	
	    	System.out.println("navega a loging url");
	    }

	    @When("^Usuario se logea en la aplicación con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	    public void usuario_se_logea_en_la_aplicación_con_usuario_y_password(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	    	System.out.println(arg1);
	    	System.out.println(arg2);
	  //driver.findElement(By.xpath).sendKeys(arg1);
}
	    
	    
	    @Then("^La tarjeta no esta disponible \"([^\"]*)\"$")
	    public void la_tarjeta_no_esta_disponible(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	         System.out.println(arg1);
	       
	     
	    }

	    @Then("^Home page is abierta$")
	    public void home_page_is_abierta() throws Throwable {
	    	System.out.println("valida la home page");
	   
	    }
	    @Then("^La tarjeta es desplegada \"([^\"]*)\"$")
	    public void la_tarjeta_es_desplegada(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	
	      System.out.println(arg1);
	    }
	    
	    
	    @Then("^La tarjeta no esta disponible$")
	    public void la_tarjeta_no_esta_disponible() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("valida la tarjeta");
	    }

		
		
	}
	
	
	
	
	
	
	

