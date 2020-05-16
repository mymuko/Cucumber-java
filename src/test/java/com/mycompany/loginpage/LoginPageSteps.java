
package com.mycompany.loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
    
    private final LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    
    }

    @Given("^I open Facebook page")
    public void aUserNavigatesToLoginPage() throws InterruptedException {
        this.loginPage.goToLoginPage();
    }

    @And("^I fill \"([^\"]*)\" field with \"([^\"]*)\"")
    public void iFillFielsdWith(String selector, String inputValue) throws InterruptedException {
        this.loginPage.fillFormInput(selector, inputValue);
        Thread.sleep(1000);
    }
    
    @When("^I click on login button \"([^\"]*)\"")
    public void iPressButton(String selector) throws InterruptedException {
        this.loginPage.pressButton(selector);
        Thread.sleep(1000);
    }
    @Then("^Page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        this.loginPage.checkTitle(title);
    }
    
}
