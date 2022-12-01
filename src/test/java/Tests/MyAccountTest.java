package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyAccountTest extends TestBase {
    HomePage HM;
    RegisterationPage RP;
    LoginPage LP ;
    MyAccountPage AP ;
    String FirstName = "Abdelrahman";
    String LastName = "Elsawaf" ;
    String Email = "abdotest3@gmail.com";
    String OldPassword = "123456789" ;
    String NewPassword = "123456" ;

    @Test(priority = 1 )
    public void RegisterSuccessfully() {
        HM = new HomePage(driver);
        HM.OpenRegisterPage();
        RP = new RegisterationPage(driver);
        RP.UserRegisteration( FirstName , LastName  , Email  ,OldPassword );
        Assert.assertTrue(RP.SuccessMessage.getText().contains("Your registration completed"));
    }
    @Test(priority = 2)
    public void click_on_MyAccount_Link()
    {
        RP = new RegisterationPage(driver);
        RP.OpenMyAccount();
    }
    @Test(priority = 3)
    public void Click_on_changePass_Link()
    {
        AP =new MyAccountPage(driver);
        AP.OpenChangePassLink();
    }
    @Test(priority = 4)
    public void PassChangedSuccessfully()
    {
        AP =new MyAccountPage(driver);
        AP.ChangePassword(OldPassword , NewPassword);
       Assert.assertTrue(AP.MSGPasswordChanged.getText().contains("Password was changed"));
    }
    @Test(priority = 5)
    public void closeTab()
    {
        AP =new MyAccountPage(driver);
        AP.closeTabOfMSG_PasswordChanged();


    }


    @Test(priority = 6)
    public void Logout() throws InterruptedException
    {
        Thread.sleep(1000);
        //WebDriverWait waiting= new WebDriverWait(driver , Duration.ofSeconds(30));
        //waiting.until(ExpectedConditions.visibilityOf(RP.logoutPage));
        RP = new RegisterationPage(driver);
      //  driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);
        RP.UserLogout();
    }
    @Test(priority = 7 )
    public void UserLoginSuccessfully()
    {
        RP = new RegisterationPage(driver);
        RP.loginBTN_in_Registeration();
        LP =new LoginPage(driver) ;
        LP.loginPage(Email,NewPassword);
       Assert.assertTrue(RP.logoutPage.isDisplayed());
    }
}
