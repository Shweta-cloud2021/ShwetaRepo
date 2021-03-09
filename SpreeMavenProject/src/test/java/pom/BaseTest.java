package pom;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;
    @BeforeMethod
    public void setDriver(){

       // extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentScreenshot.html", true);

        System.setProperty("webdriver.chrome.driver","/Users/shwetanishag/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeSession() throws IOException {
//
//        if(result.getStatus() == ITestResult.SUCCESS){
//            takeScreenShot(driver);
//            test.log(LogStatus.PASS,result.getThrowable());
//        }
////        if(result.getStatus() == ITestResult.FAILURE)
////        {
////            takeScreenShot(driver);
////            test.log(LogStatus.FAIL, result.getThrowable());
////            //test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
////        }
//        extent.endTest(test);
//        extent.flush();
//        extent.close();
        driver.quit();
    }

    public static  void takeScreenShot(WebDriver driver) throws IOException {
        String timeStamp;
        File screenShotName;
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        File screenShotFile=new File(System.getProperty("user.dir")+"/"+timeStamp+".png");
        FileUtils.copyFile(srcFile,screenShotFile);

        String filePath=screenShotFile.toString();
        System.out.println(filePath);
        Reporter.log("<img src='"+filePath+"'");
    }

}
