package byitacademy.habasaraba.finalproject;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.when;



public class ApiTest {
 @Test
    public void testGetAllItems(){
     String url="https://www.levi.com/US/en_US/";
     when().get(url).
             then().assertThat().statusCode(200);
 }



}


