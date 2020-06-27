package com.myproject.qa.sanity.bdd.stepdefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFeatureSD {
	@When("^site is launched \"([^\"]*)\"$")
	public void site_is_launched(String arg1) throws Throwable {
	    
	}
	
	@Then("^verify title \"([^\"]*)\"$")
	public void verify_title(String arg1) throws Throwable {
	  
	}

	@When("^enter \"([^\"]*)\" and hit search$")
	public void enter_and_hit_search(String arg1) throws Throwable {

	}

	@Then("^verify \"([^\"]*)\" is searched$")
	public void verify_is_searched(String arg1) throws Throwable {
		
	}



}
