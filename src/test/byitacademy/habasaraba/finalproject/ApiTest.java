package byitacademy.habasaraba.finalproject;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class ApiTest {
 @Test
    public void testGetAllItems(){
     String url="https://www.levi.com/US/en_US/";
     when().get(url).
             then().assertThat().statusCode(200);
 }
    @Test
    public void testGetMenJeans(){
        String url="https://www.levi.com/US/en_US/search/men%20jeans";
        int id=1;
        when().get(url).
                then().assertThat().
                statusCode(200);



}}


