package stepDefinitions;

import Hooks.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pageObjects.JourneyPlannerPage;


public class JourneyPlannerSteps{
  public WebDriver driver;
//    //JourneyPlannerPage journeyPlannerPage;
//    public JourneyPlannerSteps(BaseTest baseTest)
//    {
//        this.driver = baseTest.driver;
//       // journeyPlannerPage= new JourneyPlannerPage
//    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

  public JourneyPlannerSteps(WebDriver driver){
    this.driver = driver;
  }

    //public WebDriver driver;
    public JourneyPlannerPage journeyPlannerPage;
   //JourneyPlannerPage journeyPlannerPage;
// journeyPlannerPage = new JourneyPlannerPage(driver);

//    public  JourneyPlannerSteps()
//    {
//       // this.journeyPlannerPage = new JourneyPlannerPage(driver);
//    }

    @Given("I navigate to Tfl website {}")
    public void iNavigateToTflWebsite(String url) {

        journeyPlannerPage.Navigate(url);
    }



    @When("I click on cookies button")
    public void iClickOnCookiesButton() {
       // journeyPlannerPage.co
    }

    @Then("plan a journey page is displayed")
    public void planAJourneyPageIsDisplayed() {
    }

    @When("I enter from a location")
    public void iEnterFromALocation() {
    }

    @And("I enter to a location")
    public void iEnterToALocation() {
    }

    @And("I click change time link")
    public void iClickChangeTimeLink() {
    }

    @Then("I verify that leaving tab is enabled")
    public void iVerifyThatLeavingTabIsEnabled() {
    }

    @When("I select leaving date")
    public void iSelectLeavingDate() {
    }

    @And("I select leaving time")
    public void iSelectLeavingTime() {
    }

    @And("I click plan my journey")
    public void iClickPlanMyJourney() {
    }

    @Then("quieter Times Message Displayed")
    public void quieterTimesMessageDisplayed() {
    }



}
