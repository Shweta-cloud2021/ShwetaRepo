package pom;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersSpree.class)
public class AddToCartAndValidateOrderAmount extends BaseTest{
    @Test
    public void addToCartAndValidateOrderAmount(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("shweta.ganjewar@gmail.com","shweta@123");
        loginPage.searchProduct("Ruby on Rails Mug");
        Assert.assertTrue(loginPage.isOrderSummaryTotalCorrect("$13.99"));
        test.log(LogStatus.PASS, "Test Passed");
    }

}
