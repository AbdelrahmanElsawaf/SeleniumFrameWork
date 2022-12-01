package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver ;
    public PageBase(WebDriver driver)
    {
     PageFactory.initElements(driver , this);
    }


    public static void ClickButton(WebElement Button)
    {
        Button.click();
    }
    public static void SetTextKey (WebElement TextKey , String value)
    {
     TextKey.sendKeys(value);
    }
}
