package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Driver {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","/Users/shwetanishag/Downloads/chromedriver");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver,10);
        driver.get("https://spree-vapasi.herokuapp.com/");
        //driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeSession(){

        driver.quit();
    }
}
