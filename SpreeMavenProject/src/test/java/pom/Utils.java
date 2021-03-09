package pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utils {

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
