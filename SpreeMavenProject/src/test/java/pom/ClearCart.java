package pom;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(ListenersSpree.class)
public class ClearCart extends BaseTest{

    @Test
    public void clearCart() throws IOException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("shweta.ganjewar@gmail.com","shweta@123");
        loginPage.addProductToCart("Ruby on Rails Mug","3");
        loginPage.removeProductFromCart("Ruby on Rails Mug");
        //Utils.takeScreenShot(driver);
        Assert.assertTrue(loginPage.isCartEmpty("Your cart is empty"),"Passed- Cart is empty.");
//        test.log(LogStatus.PASS, "Test Passed");
    }
}
