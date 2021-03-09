package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//4. Add
//        1. Login
//        2. search "Ruby on Rails Mug"
//        3. "Ruby on Rails Mug" to cart
//        4. navigate to Checkout page and validate order amount
public class ValidateRubyOnRailsMugAmount extends Driver{
    @Test
    public void validateAmount(){
        //Login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-to-login")));
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("shweta.ganjewar@gmail.com");
        System.out.println("Entered uname");
        driver.findElement(By.cssSelector("#spree_user_password")).sendKeys("shweta@123");
        System.out.println("Entered pwd");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        System.out.println("Logged in");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert.alert-success")));
        String successMessage= driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        Assert.assertEquals(successMessage,"Logged in successfully");
        System.out.println("Logged in successfully");

        //crudeCode.Search 'Ruby on Rails Mug'
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#keywords")));
        driver.findElement(By.cssSelector("#keywords")).sendKeys("Ruby on Rails Mug");
        driver.findElement(By.cssSelector("input[value='crudeCode.Search']")).click();
        driver.findElement(By.xpath("//a[@href='/products/ruby-on-rails-mug']")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#checkout-link")).click();

        String actualOrderTotal=driver.findElement(By.cssSelector("#summary-order-total")).getText();
        String expectedOrderTotal="$13.99";

        Assert.assertEquals(actualOrderTotal,expectedOrderTotal);
    }
}
