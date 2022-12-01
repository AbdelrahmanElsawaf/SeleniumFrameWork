package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css ="strong.current-item")
  public WebElement CheckProductName ;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement SearchDetails  ;

    public void OpenSearchDetails()
    {
        ClickButton(SearchDetails);
    }
}
