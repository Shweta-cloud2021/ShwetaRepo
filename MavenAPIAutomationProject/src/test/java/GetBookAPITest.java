import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;

public class GetBookAPITest {
    @Test
    public void assertGetBookByID(){
        baseURI="http://216.10.245.166";
        Response response= given().queryParam("ID","sonal1227225")
                .header("Content-Type","application/json")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .statusCode(200)
                .extract().response();
        String responseString=response.asString();
        System.out.println(responseString);
        Assert.assertEquals(responseString,"[{\"book_name\":\"Learn Appium Basics\",\"isbn\":\"sonal1\",\"aisle\":\"227225\",\"author\":\"John foe2\"}]");
    }
    @Test
    public void assertGetBookByIDUsingDeserialization(){
        baseURI="http://216.10.245.166";
        Response response= given().queryParam("ID","sonal1227225")
                .header("Content-Type","application/json")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .statusCode(200)
                .extract().response();
        String responseString=response.asString();
        System.out.println(responseString);
        //BookResponse book1= response.as(BookResponse.class);
        //System.out.println(book1.getIsbn());
        GetBookResponse[] book=response.as(GetBookResponse[].class);
        Assert.assertEquals(book[0].getIsbn(),"sonal1","Test cae failed due to wrong ISBN");
    }
}
