package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//2. crudeCode.Search
//        1. crudeCode.Search for "Ruby" and make sure all search results have Ruby in the name
//        2. crudeCode.Search for "Apache" and make sure all search results have Apache in the name
//        If possible make above data driven
public class Search extends Driver{

    @Test
    public void search(){

        driver.findElement(By.cssSelector("#keywords")).sendKeys("Ruby");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#products")));
        WebElement productSearchElement=driver.findElement(By.cssSelector("#products"));
        List<WebElement> searchList=productSearchElement.findElements(By.xpath("//div[contains(@id,'product_')]"));
        System.out.println(searchList.size());
        for(int i=0;i<searchList.size();i++){
            String text=searchList.get(i).getText();
            //System.out.println(text);
            Assert.assertTrue(text.contains("Ruby"),"Ruby");
        }

    }

    @Test
    public void searchApache(){
        driver.findElement(By.cssSelector("#keywords")).sendKeys("Apache");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#products")));
        WebElement productSearchElement=driver.findElement(By.cssSelector("#products"));
        List<WebElement> searchList=productSearchElement.findElements(By.xpath("//div[contains(@id,'product_')]"));
        System.out.println(searchList.size());
        for(int i=0;i<searchList.size();i++){
            String text=searchList.get(i).getText();
            System.out.println(text);
            Assert.assertTrue(text.contains("Apache"),"Apache");
        }
    }
}
