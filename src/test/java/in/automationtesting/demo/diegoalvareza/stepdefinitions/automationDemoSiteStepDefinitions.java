package in.automationtesting.demo.diegoalvareza.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.automationtesting.demo.diegoalvareza.model.AutomationDemoSiteData;
import in.automationtesting.demo.diegoalvareza.questions.Answer;
import in.automationtesting.demo.diegoalvareza.tasks.OpenUp;
import in.automationtesting.demo.diegoalvareza.tasks.SignUp;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class automationDemoSiteStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that I want to sign up in Automation Demo Site$")
    public void thatIWantToSignUpInAutomationDemoSite() {
        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage());
    }

    @When("^I enter in form details$")
    public void iEnterInFormDetails(List<AutomationDemoSiteData> automationDemoSiteData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.withData(automationDemoSiteData.get(0)));
    }

    @Then("^I see the WebTable tab$")
    public void iSeeTheWebTableTab() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("- Double Click on Edit Icon to EDIT the Table Row.")));
    }
}
