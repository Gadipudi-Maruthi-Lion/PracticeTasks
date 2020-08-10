package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Maruthi Work\\Working\\PracticeTasks\\src\\main\\java\\com\\qa\\features\\bookATicket.feature",
		glue= {"com.qa.stepDefination"},
		plugin= {"pretty","html:test-output"},  
		dryRun=true,  
		monochrome=true 
		)
public class TestRunner {
}
