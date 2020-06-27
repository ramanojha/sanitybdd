package com.myproject.qa.sanity.bdd.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class HookSD {
	
	//Source info - https://www.baeldung.com/java-cucumber-hooks
	//				https://cucumber.io/docs/cucumber/api/
	@Before(order=1)
	public void commonHookBefore(){
		System.out.println("Common Hook before or Non-Conditional Hook");
	}
	@After(order=1)
	public void commonHookAfter(){
		System.out.println("Common Hook After or Non-Conditional Hook");
	}
	
	@Before("@Smoke")
	public void taggedHookBefore(){
		System.out.println("Tagged Hook before or Condition Hook");
	}
	
	@After
	//@After({"@Smoke", "@Regression"})   // And
	//@After({"@Smoke, @Regression"})   // OR
	public void taggedHookAfter(){
		System.out.println("Tagged Hook After or Condition Hook");
	}
	
	
	@BeforeStep
	public void stepHookBefore(){
		System.out.println("Step Hook before or Condition Hook");
	}
	
	@AfterStep
	//@After({"@Smoke, @Regression"})   // OR
	public void stepHookAfter(){
		System.out.println("Step Hook After or Condition Hook");
	}
	
}	
