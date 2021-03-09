package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);

    }
//    @FindBy(xpath = "//a[@href='/t/bags']")
//    WebElement categoryName;

//    @FindBy(css = ".navigation>ul>li:nth-child(3)")
//    WebElement priceRangeCriteria;

    @FindBy(css=".btn.btn-primary")
    WebElement filterSearchButton;

    @FindBys(@FindBy( css=".price.selling.lead"))
    List<WebElement> productList;

    public void open(){
        driver.get("https://spree-vapasi.herokuapp.com/");
    }
    public void selectCategory(String categorySearchText){
        WebElement categoryName=driver.findElement(By.linkText(categorySearchText));
        categoryName.click();
        By activeCategory=By.cssSelector(".list-group-item.active");
        waitForElementToLoad(activeCategory);
    }
    public void filterUsingPriceRange(String priceRange){
        //
        WebElement priceRangeCriteria= driver.findElement(By.xpath("//div[@class='navigation']/ul/li/input[@value='"+priceRange+"']"));
        priceRangeCriteria.click();
        filterSearchButton.click();
    }

    public boolean areAllProductsDisplayedInPriceRange(String priceRange){

        String subStringLowerEnd= priceRange.substring(1,6);//$15.00
        String subStringUpperEnd= priceRange.substring(10,15);
        double lowerEndNumber= Double.parseDouble(subStringLowerEnd);
        double upperEndNumber= Double.parseDouble(subStringUpperEnd);

        for(int i=0;i<productList.size();i++){
            String s=productList.get(i).getAttribute("content");
            //System.out.println(s);
            double d= Double.parseDouble(s);
            //System.out.println(d);
            if(!(d>=lowerEndNumber || d<=upperEndNumber)){
                return false;
            }

        }
        return true;
    }
}
