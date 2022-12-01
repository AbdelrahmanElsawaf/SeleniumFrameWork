package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase {

    public RegisterationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender-male")
    WebElement gender ;

    @FindBy(id="FirstName")
    WebElement firstNameTXT ;

    @FindBy(id="LastName")
    WebElement lastNameTXT ;

    @FindBy(id="Email")
    WebElement emailTXT ;

    @FindBy(id="Password")
    WebElement passTXT ;

    @FindBy(id="ConfirmPassword")
    WebElement confirmPassTXT ;

    @FindBy(id="register-button")
    WebElement btnRegister ;

    @FindBy(css="div.result")
    public  WebElement SuccessMessage;

    @FindBy(linkText = "Log out")
    public WebElement logoutPage ;

    @FindBy(linkText = "Log in")
    WebElement LoginBTN ;

    @FindBy(linkText = "My account")
    WebElement AccountBTN ;

    public void UserRegisteration(String FirstName , String LastName , String Email , String Password)
    {
        ClickButton(gender);
        SetTextKey(firstNameTXT,FirstName);
        SetTextKey(lastNameTXT,LastName);
        SetTextKey(emailTXT,Email);
        SetTextKey(passTXT,Password);
        SetTextKey(confirmPassTXT,Password);
        ClickButton(btnRegister);
    }
    public void UserLogout()
    {
       ClickButton(logoutPage) ;
    }
    public void loginBTN_in_Registeration()
    {
        ClickButton(LoginBTN);
    }

    public void OpenMyAccount()
    {
       ClickButton(AccountBTN);
    }
}
