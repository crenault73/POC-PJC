package stepdefinitions;

import com.saucedemo.pages.DriverFactory;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageSteps {
    LoginPage login = new LoginPage(DriverFactory.getPage());

    @Given("User launched SwagLabs application.")
    public void userLaunchedSwagLabsApplication() {
        login.navigateToUrl();
    }

    @When("User verify the Page title")
    public void verifyPageTitle() {
        String title = login.verifyTitle();
        assertEquals(title, "Swag Labs");
    }

    //Login into the application
    @When("User logged in the app using username {string} and password {string}")
    public void loginIntoTheApplication(String username, String password) {
        login.loginIntoApplication(username, password);
    }

    //Logout from application
    @Then("User logout from the application")
    public void logoutFromApplication() {
        login.logoutApplication();
    }

}
