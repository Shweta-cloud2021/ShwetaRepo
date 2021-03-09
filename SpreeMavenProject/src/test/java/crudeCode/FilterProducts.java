package crudeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//3. Filter products
//        1. select "Bags" in Shop by Categories
//        2. select "$15.00 - $18.00" price range
//        3. Apply filter (search)
//        4. Assert products displayed matched criteria
//        If possible make above data driven
public class FilterProducts extends Driver {

    @Test
    public void filterProducts(){

        WebElement bags=driver.findElement(By.xpath("//a[@href='/t/bags']"));
        bags.click();
        WebElement criteria= driver.findElement(By.cssSelector(".navigation>ul>li:nth-child(3)"));
        criteria.click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        List<WebElement> list=driver.findElements(By.cssSelector(".price.selling.lead"));
        //System.out.println(list.size());

        criteria= driver.findElement(By.cssSelector(".navigation>ul>li:nth-child(3)"));
        String criteriaStringValue=criteria.getText();// $15.00 - $18.00
        String subStringLowerEnd= criteriaStringValue.substring(1,6);
        String subStringUpperEnd= criteriaStringValue.substring(10,15);
        double lowerEndNumber= Double.parseDouble(subStringLowerEnd);
        double upperEndNumber= Double.parseDouble(subStringUpperEnd);
        System.out.println(subStringLowerEnd + " "+ subStringUpperEnd);
        System.out.println(lowerEndNumber+" "+upperEndNumber);

        for(int i=0;i<list.size();i++){
            String s=list.get(i).getAttribute("content").toString();
            System.out.println(s);
            double d= Double.parseDouble(s);
            //System.out.println(d);
            Assert.assertTrue((d>=lowerEndNumber || d<=upperEndNumber),"Within criteria limits");
        }
    }
}
