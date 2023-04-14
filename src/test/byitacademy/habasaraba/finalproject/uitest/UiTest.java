package byitacademy.habasaraba.finalproject.uitest;
import byitacademy.habasaraba.finalproject.constants.ItemConstants;
import byitacademy.habasaraba.finalproject.pages.HomePage;
import byitacademy.habasaraba.finalproject.pages.SearchPage;
import byitacademy.habasaraba.finalproject.util.Util;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UiTest extends BaseTest {
    @Test
    public void loginWithValidCredentials() {

        Assertions.assertEquals("Hello, Hanna Basaraba", step.LoginWithValidCredentials());
    }

    @Test
    public void loginWithoutPassword() {
        Assertions.assertEquals("Please enter your password.", step.LoginWithoutPassword());
    }

    @Test
    public void loginWithoutEmail() {
        Assertions.assertEquals("Please enter a valid email address.", step.LoginWithoutEmail());
    }

    @Test
    public void loginWithIncorrectEmail() {
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", step.LoginWithIncorrectEmail());
    }

    @Test
    public void loginWithIncorrectPassword() {
        Assertions.assertEquals("The email and/or password you entered is incorrect. Please try again.", step.LoginWithIncorrectPassword());
    }

    @Test
    public void addItemToCart() {
        Assertions.assertEquals("1 item", step.AddItemToCart());
    }

    @Test
    public void searchTest() {
        Util.waitForPresenceElementByXPath(driver, HomePage.OFFER_BTN, 5);
        WebElement offerBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        offerBtn.click();
        WebElement searchInputField = driver.findElement(By.xpath(SearchPage.SEARCH_INPUT_FIELD));
        searchInputField.sendKeys("501® Shrink-to-Fit™ Men's Jeans (Big & Tall)", Keys.RETURN);
        List<WebElement> products = driver.findElements(By.className(SearchPage.LABEL_PRODUCT_NAME));
        for (WebElement product : products) {
            Assert.isTrue(product.getText().toLowerCase().
                            contains(ItemConstants.ITEM_NAME.toLowerCase()),
                    "Error. No " + ItemConstants.ITEM_NAME + " found.");
        }
    }
}
