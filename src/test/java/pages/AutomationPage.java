package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@class=\"fa fa-lock\"]")
    public WebElement signupLogin;

    @FindBy(xpath = "//*[contains (text(),'New User Signup!')]")
    public WebElement newUserSignup;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement SignupEmailBox;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement SignupNameBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement SignupButon;

    @FindBy(xpath = "//*[contains(text(),'Enter Account Information')]")
    public WebElement EnterAccountInformation;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement TitleMr;

    @FindBy(xpath = " //*[@id='name']")
    public WebElement Name;

    @FindBy(xpath = " //*[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement newsletter;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement Receivespecial;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement FirstName;

    @FindBy(xpath = "//*[contains(text(),'Create Account')]")
    public WebElement createAccount;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement accountCreated;
//*[contains(text(),'Account Created!')]
    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement contınue;
//*[contains(text(),'Continue')]
   // #btn btn-primary
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement Loggedınasusername;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement DeleteAccount;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement AccountDeleted;

    //Testcase two
    @FindBy(xpath = "//*[contains(text(),'Login to your account')]")
    public WebElement LoginToYourAccount;

    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement LoginEmail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement LoginPassword;

    @FindBy(xpath = "(//*[contains(text(),'Login')])[4]")
    public WebElement Login;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement DeletedAccount;































































}
