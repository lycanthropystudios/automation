package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.builders.Category;
import starter.builders.Login;
import starter.interactions.CreateCat;
import starter.navigation.NavigateTo;
import starter.ui.search.SearchFor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CatStepDefinitions {

    @When("click on cat")
    public void click_on_cat(String term) {

        withCurrentActor(
                CreateCat.addCat()
        );
    }
}
