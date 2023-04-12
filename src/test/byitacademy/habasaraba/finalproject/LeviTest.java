package byitacademy.habasaraba.finalproject;

import byitacademy.habasaraba.finalproject.data.Item;
import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import byitacademy.habasaraba.finalproject.leviPages.SearchPage;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LeviTest {
    WebDriver driver;
    Step leviPage;

    @BeforeEach
    public void warmUp() {
       /* ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);*/
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3)):*/
        driver.get(HomePage.URL);
        leviPage = new Step(driver);
    }

    @Test
    public void loginWithValidCredentials(){

        Assertions.assertEquals("Hello, Hanna Basaraba", leviPage.LoginWithValidCredentials());
    }
    @Test
    public void loginWithoutPassword(){
        Assertions.assertEquals("Please enter your password.", leviPage.LoginWithoutPassword());
    }
    @Test
    public void loginWithoutEmail(){
        Assertions.assertEquals("Password*Show Password Toggle", leviPage.LoginWithoutEmail());
    }
    @Test
    public void loginWithIncorrectEmail(){
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", leviPage.LoginWithIncorrectEmail());
    }
    @Test
    public void loginWithIncorrectPassword(){
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", leviPage.LoginWithIncorrectPassword());
    }
    @Test
    public void AddItemToCart() {
        Assertions.assertEquals("$76.55", leviPage.AddItemToCart());
    }

    @Test
    public void SearchTest(){
        Driver.waitForPresenceElementByXPath(driver, HomePage.OFFER_BTN, 5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement SearchInputField= driver.findElement(By.xpath(SearchPage.SEARCH_INPUT_FIELD));
        SearchInputField.sendKeys("501® Shrink-to-Fit™ Men's Jeans (Big & Tall)", Keys.RETURN);
        List<WebElement> products=driver.findElements(By.className(SearchPage.LABEL_PRODUCT_NAME));
        for (WebElement product : products) {
            Assert.isTrue(product.getText().toLowerCase().
                            contains(Item.ITEM_NAME.toLowerCase()),
                    "Error. No " + Item.ITEM_NAME + " found.");
        }
    }}
