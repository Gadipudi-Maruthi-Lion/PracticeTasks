package com.qa.stepDefination;


import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;


import com.qa.pages.Homepage;
import com.qa.pages.SearchResultPage;
import com.qa.util.Initialization;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookATicketStepDefination extends Initialization{

	public WebDriver driver;
	public Properties prop;
	Homepage homepage;
	SearchResultPage searchpage;

	@Given("^user open easemytrip application$")
	public void user_open_easemytrip_application() throws IOException  {
		setup();

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String src, String dstn)  {
		homepage = new Homepage();
		homepage.sourceAndDestination(src, dstn);

	}
	@Then("^user should get the fares of all flights$")
	public void user_should_get_the_fares_of_all_flights()  {
		searchpage = new SearchResultPage();
		searchpage.getAllFares();

	}

	@Then("^user select any lowest cost flight$")
	public void user_select_any_lowest_cost_flight()  {

		searchpage.getLowestPrice();

	}

	@Then("^close the browser$")
	public void close_the_browser()  {
		closeBrowser();

	}



}
