package byitacademy.habasaraba.finalproject.uitest;
import byitacademy.habasaraba.finalproject.pages.HomePage;
import byitacademy.habasaraba.finalproject.step.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest{
    WebDriver driver;
    Step step;
    @BeforeEach
    public void warmUp() {

        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(HomePage.URL);
        step = new Step(driver);
        }

        @AfterEach
        public void tearDown() {
        driver.quit();
        }
    }

