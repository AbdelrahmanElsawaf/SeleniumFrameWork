package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

  @FindBy(id ="small-searchterms")
    WebElement SearchTextBox ;

  @FindBy(css ="button.button-1.search-box-button")
  WebElement SearchBTN ;

  @FindBy(id = "ui-id-1")
  WebElement ProductList ;

  public void SearchForProduct(String SearchName)
  {
   SetTextKey(SearchTextBox,SearchName);
   ClickButton(SearchBTN);
  }

}
