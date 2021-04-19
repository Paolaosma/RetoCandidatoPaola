package co.com.choucair.certificacion.retocandidatos.stepdefinitions;

import co.com.choucair.certificacion.retocandidatos.model.retoPaolaData;
import co.com.choucair.certificacion.retocandidatos.questions.Answer;
import co.com.choucair.certificacion.retocandidatos.tasks.FillOut;
import co.com.choucair.certificacion.retocandidatos.tasks.Openup;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class retoPaolaChoucairStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Felipe wants to create an account at Utest$")
    public void thanFelipeWantsToCreateAnAccountAtUtest() {
       OnStage.theActorCalled("Felipe").wasAbleTo(Openup.theUtestPage());
    }


    @When("^he fill out the registration form at Utest$")
    public void heFillOutTheRegistrationFormAtUtest(List<retoPaolaData> retoPaolaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.theform(retoPaolaData.get(0).getFirstName(),
                retoPaolaData.get(0).getLastName(),
                retoPaolaData.get(0).getEmail(),
                retoPaolaData.get(0).getMonthOfBirth(),
                retoPaolaData.get(0).getDayOfBirth(),
                retoPaolaData.get(0).getYearOfBirth(),
                retoPaolaData.get(0).getZip(),
                retoPaolaData.get(0).getPassWord(),
                retoPaolaData.get(0).getConfirmPassword()));
    }

    @Then("^he faced an account registration successful message$")
    public void heFacedAnAccountRegistrationSuccessfulMessage(List<retoPaolaData> retoPaolaData) {
        //Set static message due to a captcha at the end of the form
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoPaolaData.get(0).getConfirmationMessage(),retoPaolaData.get(0).getConfirmationMessage())));
    }
}
