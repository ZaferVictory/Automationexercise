package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {
    

    AutomationPage automationPage=new AutomationPage();

    static String email;
    static  String Password;
    Actions action=new Actions(Driver.getDriver());
    @Before(value="@test02")
    public void RegisterUser() {
        email= Faker.instance().internet().emailAddress();
        Password=Faker.instance().internet().password();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        automationPage.signupLogin.click();

        automationPage.SignupNameBox.sendKeys(Faker.instance().name().name());
        automationPage.SignupEmailBox.sendKeys(email);
        automationPage.SignupButon.click();
        ReusableMethods.jsScrollClick(automationPage.TitleMr);
        automationPage.password.sendKeys(Password);
        automationPage.day.sendKeys("10");
        automationPage.months.sendKeys("11");
        automationPage.years.sendKeys("1990");
        automationPage.newsletter.click();
        automationPage.Receivespecial.click();
        action.click(automationPage.FirstName).
                sendKeys(Faker.instance().name().firstName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().lastName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().company().name()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().streetAddress()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().country()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().state()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().city()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().phoneNumber().phoneNumber()).perform();
        automationPage.createAccount.click();
      // automationPage.contınue.click();
      // Driver.getDriver().navigate().refresh();
      // automationPage.contınue.click();

        Driver.closeDriver();


    }

    @After
    public void tearDown(Scenario scenario){  final byte[] screenshot=((TakesScreenshot)
            Driver.getDriver()).getScreenshotAs(OutputType.BYTES);  if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png","screenshots");
    }
        // Driver.closeDriver();
    }
 }

