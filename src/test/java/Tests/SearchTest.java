package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
  String ProductName ="Apple MacBook Pro 13-inch" ;
SearchPage SP ;
ProductDetailsPage PD ;
@Test
public void SearchSuccessfully()
{
    SP =new SearchPage(driver);
    SP.SearchForProduct(ProductName);
    PD =new ProductDetailsPage(driver);
    PD.OpenSearchDetails();
    Assert.assertTrue(PD.CheckProductName.getText().contains("Apple MacBook Pro 13-inch"));
}


}
