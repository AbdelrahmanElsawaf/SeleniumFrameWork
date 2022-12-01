package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserRegisterationTest extends TestBase {
   HomePage HM;
   RegisterationPage RP;
   LoginPage LP ;

 @Test(priority = 1 ,alwaysRun = true)
 public void RegisterSuccessfully() {
     HM = new HomePage(driver);
     HM.OpenRegisterPage();
     RP = new RegisterationPage(driver);
     RP.UserRegisteration( "Abdelrahman" ,  "Elsawaf" ,  "abdotest@gmail.com" , "123456789");
     Assert.assertTrue(RP.SuccessMessage.getText().contains("Your registration completed"));
 }
 @Test(dependsOnMethods = {"RegisterSuccessfully"})
    public void Logout ()
{
    RP = new RegisterationPage(driver);
    RP.UserLogout();
}
 @Test(dependsOnMethods ={"Logout"} )
    public void UserLoginSuccessfully()
 {
     RP = new RegisterationPage(driver);
     RP.loginBTN_in_Registeration();
    LP =new LoginPage(driver) ;
    LP.loginPage("abdotest@gmail.com" ,"123456789");
 }
}
