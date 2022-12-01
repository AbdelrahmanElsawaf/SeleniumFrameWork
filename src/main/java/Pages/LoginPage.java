package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver) ;
    }
    @FindBy(id = "Email")
    WebElement emailTXTBOX ;

    @FindBy(id="Password")
    WebElement PassTXTBOX ;

    @FindBy(css="button.button-1.login-button")
    WebElement LoginBTN ;

    public void loginPage(String Email ,String Password)
    {
        SetTextKey(emailTXTBOX,Email);
        SetTextKey(PassTXTBOX , Password);
        ClickButton(LoginBTN);
    }
}
