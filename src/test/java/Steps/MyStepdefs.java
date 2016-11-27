package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class MyStepdefs {


    @Given("^Open Firefox and start application$")
    public void openFirefoxAndStartApplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step - 1 @Given ");

    }

    @When("^Opened web page of rozetka$")
    public void openedWebPageOfRozetka() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step - 2 @When ");

    }

    @And("^Entered following for credentials$")
    public void enteredFollowingForCredentials(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //В КАЖДОМ ИЗ МЕТОДОВ гивен вен или зен -  делать все педж обжектами  !!!
        System.out.println("Step - 3 @And");
        List<List<String>> data = table.raw();

        System.out.println("The value is = " + data.get(1).get(0).toString());
        System.out.println("The value is = " + data.get(1).get(1).toString());


    }

    @Then("^User successfully login$")
    public void userSuccessfullyLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step - 4  @Then");

    }
}
