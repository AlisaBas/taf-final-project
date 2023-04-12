package byitacademy.habasaraba.finalproject;
import byitacademy.habasaraba.finalproject.data.ApiTestData;
import byitacademy.habasaraba.finalproject.data.UserData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class ApiTest {
    @Test
    public void testGetUrl() {
        String url = "https://www.levi.com/";
        when().get(url).
                then().statusCode(200);
    }

    @Test
    public void testPostInvalidUserSubscriptionWithoutBody() {
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                post(ApiTestData.API_URL_SUBSCRIPTION).
                then().log().body().
                assertThat().statusCode(500);
    }

    @Test
    public void testPostInvalidUserLogin() {
        RestAssured
                .given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                multiPart("email", UserData.EMAIL_INVALID).
                multiPart("password", UserData.PASSWORD_INVALID);
        when().
                post(ApiTestData.API_URL_LOGIN).
                then().log().body().
                assertThat().statusCode(403);
    }
}




