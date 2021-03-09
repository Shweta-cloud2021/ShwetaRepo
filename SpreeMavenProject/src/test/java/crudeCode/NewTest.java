package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewTest extends  Driver{

    @Test
    public void verifyLoginFailure() {
        // Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-to-login")));
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("abc123");
        System.out.println("Entered uname");
        driver.findElement(By.cssSelector("#spree_user_password")).sendKeys("abcd1234");
        System.out.println("Entered pwd");
        driver.findElement(By.xpath("//input[@value='crudeCode.Search']")).click();
        System.out.println("Logged in");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //String errorMessage= driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        String errorMessage= driver.findElement(By.className("alert-error")).getText();
        Assert.assertEquals(errorMessage,"Invalid email or password.");


    }
    @Test
    public void verifyLoginSuccess()  {
        //Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-to-login")));
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("shweta.ganjewar@gmail.com");
        System.out.println("Entered uname");
        driver.findElement(By.cssSelector("#spree_user_password")).sendKeys("shweta@123");
        System.out.println("Entered pwd");
        driver.findElement(By.xpath("//input[@value='crudeCode.Search']")).click();
        System.out.println("Logged in");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String successMessage= driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        Assert.assertEquals(successMessage,"Logged in successfully");


    }

}
