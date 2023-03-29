package byitacademy.habasaraba.finalproject;

import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LeviTest {
    WebDriver driver;
    Step LeviPage;

    @BeforeEach
    public void warmUp() {
        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);*/
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3)):*/
        driver.get(HomePage.URL);
        LeviPage = new Step(driver);
    }

    @Test
    public void LogInWithValidCredentials() {
        Assertions.assertEquals("Hello, Hanna Basaraba", LeviPage.LogInWithValidCredentials());
    }

    @Test
    public void LogInWithoutPassword() {
        Assertions.assertEquals("Please enter your password.", LeviPage.LoginWithoutPassword());
    }

    @Test
    public void LogInWithoutEmail() {
        Assertions.assertEquals("Password*Show Password Toggle", LeviPage.LoginWithoutEmail());
    }

    @Test
    public void LogInWithIncorrectEmail() {
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", LeviPage.LoginWithIncorrectEmail());
    }
    @Test
    public void LogInWithIncorrectPassword() {
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", LeviPage.LoginWithIncorrectPassword());
    }

    @Test
    public void AddToCart() {
        Assertions.assertEquals("$98.00", LeviPage.AddToCart());
    }

    @Test
    public void ChangeCart() {
        Assertions.assertEquals("$137.20", LeviPage.ChangeCart());
    }
}






 /*ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver = new ChromeDriver(options);*/