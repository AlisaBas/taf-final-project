package byitacademy.habasaraba.finalproject.PageFactoryTest;

import byitacademy.habasaraba.finalproject.data.UserData;
import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import byitacademy.habasaraba.finalproject.leviPages.PageFactory.LogIn;
import byitacademy.habasaraba.finalproject.leviPages.PageFactory.Profile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LogIn logIn;
    public static Profile profile;
    public static WebDriver driver;

    @BeforeEach
    public static void setUp() {
        driver = new SafariDriver();
        logIn=new LogIn(driver);
        profile=new Profile(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(HomePage.URL);

        @Test
        public void logInTest() {
        logIn.clickLoginBtnHeader();
        logIn.inputEmail(UserData.EMAIL_VALID);
        logIn.inputPassword(UserData.PASSWORD_VALID);
        logIn.clickLoginBtn();
        String user= profile.getUserName();
        Assertions.assertEquals(UserData.USER_DATA,user);

    }
}}
