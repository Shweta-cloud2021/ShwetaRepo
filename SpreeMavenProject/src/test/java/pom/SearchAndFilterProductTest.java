package pom;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersSpree.class)
public class SearchAndFilterProductTest extends BaseTest{
    @Test
    public void filterProducts(){
        HomePage homePage=new HomePage(driver);
        homePage.open();
        homePage.selectCategory("Bags");
        homePage.filterUsingPriceRange("$15.00 - $18.00");
        Assert.assertTrue(homePage.areAllProductsDisplayedInPriceRange("$15.00 - $18.00"),"The Price is within the price range");
        test.log(LogStatus.PASS, "Test Passed");
    }

}
