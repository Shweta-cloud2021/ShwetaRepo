package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="link-to-login")
        WebElement loginHomePageButton;
    @FindBy(css="#spree_user_email")
        WebElement usernameField;
    @FindBy(css="#spree_user_password")
        WebElement passwordField;
    @FindBy(xpath="//input[@value='Login']")
        WebElement loginButton;
    @FindBy(css=".alert.alert-success")
        WebElement alertSuccess;
    @FindBy(css="#keywords")
        WebElement searchKeyword;
    @FindBy(css="input[value='crudeCode.Search']")
        WebElement searchButton;
    @FindBy(css="#add-to-cart-button")
        WebElement addToCartButton;
    @FindBy(css="#checkout-link")
        WebElement checkOutLinkButton;
    @FindBy(css="#summary-order-total")
        WebElement summaryOrderTotal;
    @FindBy(css="#quantity")
        WebElement quantity;
    @FindBy(css=".glyphicon.glyphicon-minus-sign")
        WebElement deleteProductFromCartButton;
    @FindBy(css=".alert.alert-info")
        WebElement cartEmptyMessage;


    String expectedLoggedMessage="Logged in successfully";
    //String expectedCartEmptyMessage="Your cart is empty";

    public void login(String username, String password){
        waitForElementToLoad(By.id("link-to-login"));
        loginHomePageButton.click();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        waitForElementToLoad(By.cssSelector(".alert.alert-success"));
        String actualTextMessage=alertSuccess.getText();
        Assert.assertEquals(actualTextMessage,expectedLoggedMessage);
    }
    public void searchProduct(String productName){
        waitForElementToLoad(By.cssSelector("#keywords"));
        searchKeyword.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.cssSelector("img[alt='"+productName+"']")).click();
        addToCartButton.click();
        checkOutLinkButton.click();

        //Assert.assertEquals(actualSummaryTotal,expectedOrderTotal);
    }
    public boolean isOrderSummaryTotalCorrect(String expectedOrderTotal){
        String actualSummaryTotal=summaryOrderTotal.getText();
        if(!(actualSummaryTotal.equals(expectedOrderTotal))){
            return false;
        }
        return true;
    }
    public void addProductToCart(String productName, String numberOfTimesToAddTheProduct){
        waitForElementToLoad(By.cssSelector("#keywords"));
        searchKeyword.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.cssSelector("img[alt='"+productName+"']")).click();
        quantity.clear();
        quantity.sendKeys(numberOfTimesToAddTheProduct);
        addToCartButton.click();

    }
    public void removeProductFromCart(String productName){
        deleteProductFromCartButton.click();

    }

    public boolean isCartEmpty(String expectedCartEmptyMessage){
        String actualCartEmptyMessage=cartEmptyMessage.getText();
        if(!(actualCartEmptyMessage.equals(expectedCartEmptyMessage))){
            return false;
        }
        return true;
    }
}
