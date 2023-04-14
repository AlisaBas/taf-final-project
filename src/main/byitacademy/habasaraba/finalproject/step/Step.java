package byitacademy.habasaraba.finalproject.step;
import byitacademy.habasaraba.finalproject.util.Util;
import byitacademy.habasaraba.finalproject.constants.UserConstants;
import byitacademy.habasaraba.finalproject.pages.CartPage;
import byitacademy.habasaraba.finalproject.pages.HomePage;
import byitacademy.habasaraba.finalproject.pages.LogInPage;
import org.openqa.selenium.*;
import static byitacademy.habasaraba.finalproject.pages.CartPage.SIDE_MENU_BTN;

public class Step {
   public WebDriver driver;

   public Step(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String email, String password) {
        Util.waitForPresenceElementByXPath(driver, HomePage.OFFER_BTN, 5);
        WebElement offerBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        offerBtn.click();
        WebElement logInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Util.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        logInBtnHeader.click();
        WebElement emailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        emailInputField.sendKeys(email);
        WebElement passwordInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        passwordInputField.sendKeys(password);
        WebElement logInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        logInBtn.click();
    }

    public String LoginWithValidCredentials() {
        enterCredentials(UserConstants.EMAIL_VALID, UserConstants.PASSWORD_VALID);
        Util.waitForPresenceElementByXPath(driver, LogInPage.HELLO_USER, 5);
        WebElement helloUser = driver.findElement(By.xpath(LogInPage.HELLO_USER));
        return helloUser.getText();
    }

    public String LoginWithoutPassword() {
        enterCredentials(UserConstants.EMAIL_VALID, "");
        WebElement errMsgPassword = driver.findElement(By.xpath(LogInPage.ERR_MSG_PASSWORD));
        return errMsgPassword.getText();
    }

    public String LoginWithoutEmail() {
        enterCredentials("", UserConstants.PASSWORD_VALID);
        WebElement errMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return errMsgEmail.getText();
    }

    public String LoginWithIncorrectEmail() {
        enterCredentials(UserConstants.EMAIL_INVALID, UserConstants.PASSWORD_VALID);
        Util.waitForPresenceElementByXPath(driver, LogInPage.ERR_MSG_EMAIL, 5);
        WebElement errMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return errMsgEmail.getText();
    }

    public String LoginWithIncorrectPassword() {
        enterCredentials(UserConstants.EMAIL_VALID, UserConstants.PASSWORD_INVALID);
        Util.waitForPresenceElementByXPath(driver, LogInPage.ERR_MSG_EMAIL, 5);
        WebElement errMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return errMsgEmail.getText();
    }

    public void addToCart() {
        Util.waitForPresenceElementByXPath(driver, HomePage.OFFER_BTN, 5);
        WebElement offerBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        offerBtn.click();
        Util.waitForPresenceElementByXPath(driver, CartPage.MENU_BTN_SHOP, 20);
        WebElement menuBtnShop = driver.findElement(By.xpath(CartPage.MENU_BTN_SHOP));
        Util.clickWithJS(driver, menuBtnShop);
        Util.waitForPresenceElementByXPath(driver, SIDE_MENU_BTN, 40);
        WebElement sideMenuBtn = driver.findElement(By.xpath(SIDE_MENU_BTN));
        Util.clickWithJS(driver, sideMenuBtn);
        Util.waitForPresenceElementByXPath(driver, CartPage.SIDE_MENU_LINK, 20);
        WebElement sideMenuLink = driver.findElement(By.xpath(CartPage.SIDE_MENU_LINK));
        sideMenuLink.click();
        Util.waitForPresenceElementByXPath(driver, CartPage.ITEM_LINK, 20);
        WebElement itemLink = driver.findElement(By.xpath(CartPage.ITEM_LINK));
        Util.clickWithJS(driver, itemLink);
        Util.waitForPresenceElementByXPath(driver, CartPage.ITEM_COLOR_CHECKBOX, 20);
        WebElement itemColor = driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        Util.clickWithJS(driver, itemColor);
        Util.waitForPresenceElementByXPath(driver, CartPage.ITEM_WAIST_CHECKBOX, 5);
        WebElement itemWaist = driver.findElement(By.xpath(CartPage.ITEM_WAIST_CHECKBOX));
        Util.clickWithJS(driver, itemWaist);
        Util.waitForPresenceElementByXPath(driver, CartPage.ITEM_LENGTH_CHECKBOX, 5);
        WebElement itemLength = driver.findElement(By.xpath(CartPage.ITEM_LENGTH_CHECKBOX));
        Util.clickWithJS(driver, itemLength);
        Util.waitForPresenceElementByXPath(driver, CartPage.ADD_TO_CART_BTN, 10);
        WebElement addToCartBtn = driver.findElement(By.xpath(CartPage.ADD_TO_CART_BTN));
        Util.clickWithJS(driver, addToCartBtn);
        Util.waitForPresenceElementByXPath(driver, CartPage.CART_ICON_HEADER, 5);
        WebElement cartIconHeader = driver.findElement(By.xpath(CartPage.CART_ICON_HEADER));
        cartIconHeader.click();
    }

    public String AddItemToCart() {
        addToCart();
        Util.waitForNoEmptyCart(driver,CartPage.ITEM_QUANTITY,10);
        WebElement itemQuantity = driver.findElement(By.xpath(CartPage.ITEM_QUANTITY));
        return itemQuantity.getText();
    }
}








