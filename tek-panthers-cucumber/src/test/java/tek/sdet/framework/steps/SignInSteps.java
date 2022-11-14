package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void UserClickOnSignInOption() {
		click(factory.homePage().SignIn);
		logger.info("user clicked on search button");
	}
	    
		
		@And("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String email, String password) {
			
			sendText(factory.signInPage().emailField,email);
			sendText(factory.signInPage().passwordField,password);
			
			logger.info("user enterted email and password"+email);
			
		}
		
		@And("User click on login button")
		public void userClickOnLoginButton() {
			
			click(factory.signInPage().LoginButton);
			logger.info("user clicked on login button");
			
		}
		
		@Then("User should be logged in into Account")
		public void UserShouldBeloggedInIntoAccount() {
			Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
			logger.info("user logged In into account");
			slowDown();
		}
		
		
		
		
		@And("user click on Create New Account button")
	    public void userClickOnCreateNewAccountButton() {
	        click(factory.signInPage().NewAccount);
	        logger.info("user clicked on Create New Account button");
	    }
	    @And("user fill the signUp information with below data")
	    public void userFillTheSignUpInformationWithBelowData(DataTable data) {
	        List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
	        sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
	        sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
	        sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
	        sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
	       // List<List<String>> SingleData = data.asLists(String.class);
	        //sendText(factory.signInPage().nameInput,SingleData.get(0).get(0)); the same code 61 but the value is name instead of name value
	        logger.info("user entered required information into sign up form");
	        slowDown();
	    }
	    
	    @And("user click on SignUp button")
	    public void userClickOnSignUpButton() {
	        click(factory.signInPage().signUpButton);
	        logger.info("user clicked on Sign up Button");
	       
	       
	    }
	    
	    @Then("user should be logged into account page")
	    public void userShouldBeLoggedIntoAccountPage() {
	        Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
	        Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	        logger.info("Account was created");
	        slowDown();
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
}
