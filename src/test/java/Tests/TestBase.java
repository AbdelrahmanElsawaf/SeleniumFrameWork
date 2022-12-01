package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase  {
     WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public void openbrowser(@Optional(value = "chrome") String BrowserName)
    {
        if(BrowserName.equals("chrome") )
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
       if (BrowserName.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
       if(BrowserName.equals("microsoft edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
        driver.manage().window().maximize();
    }
   /* @AfterSuite
    public void closebrowser()
    {
       driver.quit();
    }
    */

}
