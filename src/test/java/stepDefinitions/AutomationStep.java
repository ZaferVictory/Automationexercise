package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

public class AutomationStep {
    Faker faker=new Faker();
    AutomationPage page=new AutomationPage();
     String click, wiev,email,select;
    Actions action=new Actions(Driver.getDriver());




    @When("Navigate to {string}")
    public void navigateToUrlUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String homePage="https://automationexercise.com/";
        Assert.assertEquals(homePage,Driver.getDriver().getCurrentUrl());
    }

    @And("Click {string} button")
    public void clickSignupLoginButton(String tık) {
    click=tık;

        switch (tık){
            case"Signup / Login":
                page.signupLogin.click();
                break;
            case"Signup":
                page.SignupButon.click();
                break;
            case "Create Account button":
                page.createAccount.click();
                break;
            case "Continue":
                page.contınue.click();
                Driver.getDriver().navigate().refresh();
                page.contınue.click();
                break;
            case "Delete Account":
                page.DeleteAccount.click();

                break;
            case "login":
                page.Login.click();
                break;
        }

    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String gorunuyormu) {
        wiev=gorunuyormu;
        switch (gorunuyormu){
            case "New User Signup!":
                Assert.assertTrue(page.newUserSignup.isDisplayed());
                break;
            case "ACCOUNT CREATED!":
                Assert.assertTrue(page.accountCreated.isDisplayed());
                break;
            case "Logged in as username":
                Assert.assertTrue(page.Loggedınasusername.isDisplayed());
                break;
            case "ACCOUNT DELETED!":
                Assert.assertTrue(page.AccountDeleted.isDisplayed());
                break;
            case "Login to your account":
                Assert.assertTrue(page.LoginToYourAccount.isDisplayed());
                break;
        }

    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {

        page.SignupEmailBox.sendKeys(faker.internet().emailAddress());
        page.SignupNameBox.sendKeys(faker.name().name());

    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        page.TitleMr.click();
        page.password.sendKeys(faker.internet().password());
        page.day.sendKeys("10");
        page.months.sendKeys("11");
        page.years.sendKeys("1990");
    }

    @And("Select checkbox {string}")
    public void selectCheckboxSignUpForOurNewsletter(String sec) {
        select=sec;
        switch (sec){
            case"Sign up for our newsletter!":
                page.newsletter.click();
                break;
            case "Receive special offers from our partners!":
                page.Receivespecial.click();
                break;

        }

    }

    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {

        action.click(page.FirstName).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().streetAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).
                sendKeys(Keys.TAB).sendKeys(faker.address().state()).
                sendKeys(Keys.TAB).sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).perform();

    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
       page.LoginEmail.sendKeys(Hooks.email);
       page.LoginPassword.sendKeys(Hooks.Password);
    }
}
