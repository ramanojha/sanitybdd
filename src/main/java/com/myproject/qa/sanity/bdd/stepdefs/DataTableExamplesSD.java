package com.myproject.qa.sanity.bdd.stepdefs;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableExamplesSD {
	@When("^user launches site \"([^\"]*)\"$")
	public void user_launches_site(String arg1) throws Throwable {
	    System.out.println(arg1);
	    
	}

	@Then("^user verify title  using list$")
	public void user_verify_title_using_list(List<String> arg1) throws Throwable {
		  System.out.println(arg1.get(0));
	    
	}

	@When("^user launches site and verify title using list of list$")
	public void user_launches_site_and_verify_title_using_list_of_list(List<List<String>> arg1) throws Throwable {
		  System.out.println(arg1.get(0).get(0)+"--"+arg1.get(0).get(1));
	    
	}

	@When("^user launches site again and verify title using map$")
	public void user_launches_site_again_and_verify_title_using_map(Map<String, String> arg1) throws Throwable {
		for(Map.Entry<String, String> entry : arg1.entrySet()){
			  System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	    
	}

	@When("^user launches site again and verify title using dataTable$")
	public void user_launches_site_again_and_verify_title_using_dataTable(DataTable arg1) throws Throwable {
		  System.out.println(arg1.raw().get(0).get(0)+"--"+arg1.raw().get(0).get(1));
	    
	}
}
