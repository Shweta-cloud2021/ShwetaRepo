import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
public class AddBookAPITest {
    @Test
    public void assertRequestBookAdded(){
        baseURI="http://216.10.245.166";
        SetBookRequest addBookRequest=new SetBookRequest();
        addBookRequest.setBookName("Rest Assured Learnings1");
        addBookRequest.setIsbn("XCD123");
        addBookRequest.setAisle("456");
        addBookRequest.setAuthor("Shwetaaa");
        Response response=given()
                .header("Content-Type","application/json")
                .body(addBookRequest)
                .when()
                .post("/Library/Addbook.php")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .extract().response();

//        AddBookResponse addBookResponse=response.body().as(AddBookResponse.class);
//        System.out.println("The book ID is "+addBookResponse.getId());

//        Response responseToCheckIfBookIsAdded= given().queryParam("ID", addBookResponse.getId())
//                .header("Content-Type","application/json")
//                .when()
//                .get("/Library/GetBook.php")
//                .then()
//                .assertThat()
//                .statusCode(200)
//                .extract().response();
//        GetBookResponse[] book=responseToCheckIfBookIsAdded.as(GetBookResponse[].class);
//        System.out.println("Added book author: "+book[0].getAuthor());
//        Assert.assertEquals(book[0].getAuthor(),"Shweta");
        //System.out.println(response.prettyPrint());
        //Test case passed through TestNG but in POSTMAN-
//        Endpoint - http://216.10.245.166/Library/GetBook.php?ID=A12890
//        TestResult-
//        {
//            "msg": "The book by requested bookid / author name does not exists!"
//        }
    }
}
