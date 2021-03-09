package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//1. Login & Logout
//        1. register a login for yourself (manual)
//        2. Login
//        3. Logout
public class LoginAndLogout extends Driver {

    @Test(priority = 0)
    public void verifyLoginSuccess()  {
        System.out.println("In Test verifyLoginSuccess");
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

    }
    @Test(priority = 1)
    public void verifyLogout(){
        System.out.println("In Test verifyLogout");
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

        driver.findElement(By.cssSelector("a[href='/logout']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert.alert-notice")));
        String logOutMessage=driver.findElement(By.cssSelector(".alert.alert-notice")).getText();
        Assert.assertEquals(logOutMessage,"Signed out successfully.");
        System.out.println("Logged out successfully");
    }
//    @Test
//    public void verifyLoginFailure() {
//        System.out.println("In Test verifyLogout");
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-to-login")));
//        driver.findElement(By.id("link-to-login")).click();
//        driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("abc@123");
//        System.out.println("Entered uname");
//        driver.findElement(By.cssSelector("#spree_user_password")).sendKeys("abcd1234");
//        System.out.println("Entered pwd");
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
//        System.out.println("Logged in");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-error")));
//        //String errorMessage= driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
//        String errorMessage= driver.findElement(By.className("alert-error")).getText();
//        Assert.assertEquals(errorMessage,"Invalid email or password.");
//
//
//    }
}
