package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Change password")
    WebElement ChangePassLink ;

    @FindBy(id="OldPassword")
    WebElement OldPassField ;

    @FindBy(id ="NewPassword")
    WebElement NewPassField ;

    @FindBy(id="ConfirmNewPassword")
    WebElement ConfirmPassField ;

    @FindBy(css="button.button-1.change-password-button ")
    WebElement ChangePassBTN ;

    @FindBy(xpath ="//*[@id=\"bar-notification\"]/div/p")
   public WebElement MSGPasswordChanged ;

   @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
   public WebElement close_tab ;
    public void OpenChangePassLink()
    {
        ClickButton(ChangePassLink);
    }

    public void ChangePassword(String OldPss , String NewPass)
    {
     SetTextKey(OldPassField ,OldPss );
     SetTextKey(NewPassField,NewPass);
     SetTextKey(ConfirmPassField,NewPass);
     ClickButton(ChangePassBTN);
    }
    public void closeTabOfMSG_PasswordChanged()
    {
       ClickButton(close_tab);
    }

}
