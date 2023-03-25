package byitacademy.habasaraba.finalproject;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class LeviTest {
    WebDriver driver;
    Step LeviPage;

    @BeforeEach
    public void warmUp() {
        driver = new SafariDriver();
        /*ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver = new ChromeDriver(options);*/
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        driver.get(byitacademy.habasaraba.finalproject.LeviPage.URL);
        LeviPage = new Step(driver);
    }
    @Test
    public void LogInWithValidCredentials(){
        Util.waitFor(5);
        WebElement OfferBtn= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER,10);
        LogInBtnHeader.click();
        Util.waitFor(5);
        WebElement EmailInputField= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.com");
        WebElement PasswordInputField=driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys("0505alisa");
        WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        Util.waitFor(10);
        String helloUser=driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.HELLO_USER)).getText();
        Assertions.assertEquals("Hello, Hanna Basaraba",helloUser);



    }


}
