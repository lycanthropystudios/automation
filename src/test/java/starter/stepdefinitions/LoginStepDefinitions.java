package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.geometry.Pos;
import jdk.nashorn.internal.parser.JSONParser;
import starter.builders.Category;
import starter.builders.Login;
import starter.builders.Post;
import starter.navigation.NavigateTo;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    String name;

    public LoginStepDefinitions() throws FileNotFoundException {
    }

    @Given("(.*) has an active account")
    public void has_an_active_account(String name) {
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateTo.dashboardPanel(),
                Login
                        .with()
                        .username("admin@phptravels.com")
                        .and()
                        .password("demoadmin")
                        .and()
                        .rememberMe(),
                NavigateTo.theCategoryPanel(),

                Category
                        .with()
                        .name("Sports")
                        .and()
                        .status("none")
                        .and()
                        .vi("các môn thể thao")
                        .and()
                        .ru("виды спорта")
                        .and()
                        .ar("رياضات")
                        .and()
                        .fa("ورزش ها")
                        .and()
                        .tu("Spor Dalları")
                        .and()
                        .fr("Des sports")
                        .and()
                        .es("Deportes")
                        .and()
                        .de("Sport")
                        .and()
                        .addCategory(),
                NavigateTo.postPanel(),

                Post
                        .with()
                        .ti("Two-time Formula 1 champion involved in road accident while cycling")
                        .and()
                        .lk("10-02-2021")
                        .and()
                        .sta("Enable")
                        .and()
                        .cat("Sports")
                        .and()
                        .rel("Maxima")
                        .and()
                        .thu("F:/IdeaProjects/serenitybddwebinspanishtraining/post-1.jpg")
                        .and()
                        .key("Alonso formula sports news")
                        .and()
                        .des("Fernando Alonso: Two-time Formula 1 champion involved in road accident while cycling")
                        .and()
                        .txt("The Spaniard, who is returning to Formula 1 this season after a two-year absence, is conscious and well in himself, according to his Alpine team.\n" +
                                "Alpine said Alonso would have further medical examinations on Friday, without confirming whether he was in hospital.\n" +
                                "Sources close to Alonso say he was hit by a car near his Lugano home and the indications are he has a jaw fracture.\n" +
                                "It is said that he will be taken to Bern, where there is a specialist unit to deal with such injuries.\n" +
                                "The incident raises questions as to whether Alonso will be fit to start the season in Bahrain next month.\n" +
                                "Pre-season testing is to be held in Bahrain from 12-14 March, before the first race on 26-28 March.\n" +
                                "Alonso, a winner of 32 Grands Prix and world champion in 2005 and 2006, left F1 at the end of 2018 after four seasons with an uncompetitive McLaren to pursue other \n" +
                                "interests in racing.")
                        .addPost()


        );

    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {

    }
}
