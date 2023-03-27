package byitacademy.habasaraba.finalproject;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;


public class LeviTest {
    WebDriver driver;
    Step LeviPage;

    @BeforeEach
    public void warmUp() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        driver.get(byitacademy.habasaraba.finalproject.LeviPage.URL);
        LeviPage = new Step(driver);
    }
    @Test
    public void LogInWithValidCredentials(){
        Assertions.assertEquals("Hello, Hanna Basaraba",LeviPage.LogInWithValidCredentials());
    }

    @Test
    public void LogInWithoutPassword() {
        Assertions.assertEquals("Please enter your password.", LeviPage.LoginWithoutPassword());
    }

    @Test
    public void LogInWithIncorrectEmail(){
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", LeviPage.LoginWithIncorrectEmail());
    }

    @Test
    public void AddItemToTheBasket(){
        Assertions.assertEquals("$98.00", LeviPage.AddItemToTheBasket());
    }
}






 /*ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver = new ChromeDriver(options);*/