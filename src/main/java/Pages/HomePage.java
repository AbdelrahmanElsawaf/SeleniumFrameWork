package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Register")
    WebElement RegisterLink ;

    @FindBy(linkText = "Log in")
    WebElement LoginLink ;
    public void OpenRegisterPage()
    {
        ClickButton(RegisterLink);
    }

   public void LoginPage()
   {
    ClickButton(LoginLink);
   }
}
