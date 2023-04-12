package byitacademy.habasaraba.finalproject;
import byitacademy.habasaraba.finalproject.data.ApiTestData;
import byitacademy.habasaraba.finalproject.data.Item;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class ApiTest {
 @Test
    public void testGetUrl(){
     String url="https://www.levi.com/";
     when().get(url).
             then().statusCode(200);
 }
    @Test
    public void testGetJeans() {
        String url = "https://www.levi.com/US/en_US/search/men%20jeans";
        int id = 1;
        when().get(url).
                then().assertThat().
                statusCode(200);

    }}




