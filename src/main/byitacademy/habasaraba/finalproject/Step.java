package byitacademy.habasaraba.finalproject;
import byitacademy.habasaraba.finalproject.data.UserData;
import byitacademy.habasaraba.finalproject.leviPages.CartPage;
import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import byitacademy.habasaraba.finalproject.leviPages.LogInPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import static byitacademy.habasaraba.finalproject.leviPages.CartPage.SIDE_MENU_BTN_MEN;

public class Step {
    WebDriver driver;

    Step(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String email, String password) {
        Driver.waitForPresenceElementByXPath(driver, HomePage.OFFER_BTN, 5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        EmailInputField.sendKeys(email);
        WebElement PasswordInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys(password);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
    }

    public String LoginWithValidCredentials() {
        enterCredentials(UserData.EMAIL_VALID, UserData.PASSWORD_VALID);
        Driver.waitForPresenceElementByXPath(driver, LogInPage.HELLO_USER, 5);
        WebElement helloUser = driver.findElement(By.xpath(LogInPage.HELLO_USER));
        return helloUser.getText();
    }

    public String LoginWithoutPassword() {
        enterCredentials(UserData.EMAIL_VALID, "");
        WebElement ErrMsgPassword = driver.findElement(By.xpath(LogInPage.ERR_MSG_PASSWORD));
        return ErrMsgPassword.getText();
    }

    public String LoginWithoutEmail() {
        enterCredentials("", UserData.PASSWORD_VALID);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }

    public String LoginWithIncorrectEmail() {
        enterCredentials(UserData.EMAIL_INVALID, UserData.PASSWORD_VALID);
        Driver.waitForPresenceElementByXPath(driver, LogInPage.ERR_MSG_EMAIL, 5);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }
    public String LoginWithIncorrectPassword(){
        enterCredentials(UserData.EMAIL_VALID,UserData.PASSWORD_INVALID);
        Driver.waitForPresenceElementByXPath(driver,LogInPage.ERR_MSG_EMAIL,5);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }

    public void addToCart(){
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement MenuBtnShop = driver.findElement(By.xpath(CartPage.MENU_BTN_SHOP));
        Driver.waitForPresenceElementByXPath(driver, CartPage.MENU_BTN_SHOP, 10);
        MenuBtnShop.click();
        Driver.waitForPresenceElementByXPath(driver, SIDE_MENU_BTN_MEN,10);
        WebElement SideMenuBtn=driver.findElement(By.xpath(SIDE_MENU_BTN_MEN));
        Driver.waitForPresenceElementByXPath(driver,SIDE_MENU_BTN_MEN,10);
        SideMenuBtn.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_LINK_JEANS,15);
        WebElement SideMenuLinkJeans = driver.findElement(By.xpath(CartPage.SIDE_MENU_LINK_JEANS));
        Driver.waitForPresenceElementByXPath(driver, CartPage.SIDE_MENU_LINK_JEANS, 10);
        SideMenuLinkJeans.click();
        WebElement productCell= driver.findElement(By.xpath("//div[@class='product-cell']/a"));
        /*WebElement productName=productCell.findElement(By.xpath("//div[@class='product-name']"));*/
        Driver.waitForPresenceElementByXPath(driver,"//div[@class='product-cell']/a",10);
       /* Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_LINK,5);
        WebElement ItemLink=driver.findElement(By.xpath(CartPage.ITEM_LINK));
        ItemLink.click();*/
        Actions actions2=new Actions(driver);
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_COLOR_CHECKBOX,5);
        WebElement target2=driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        actions2.moveToElement(target2).perform();
        WebElement ItemColor=driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        ItemColor.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_WAIST_CHECKBOX,5);
        WebElement ItemWaist= driver.findElement(By.xpath(CartPage.ITEM_WAIST_CHECKBOX));
        ItemWaist.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_LENGTH_CHECKBOX,5);
        WebElement ItemLength=driver.findElement(By.xpath(CartPage.ITEM_LENGTH_CHECKBOX));
        ItemLength.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ADD_TO_CART_BTN,5);
        WebElement AddToCartBtn= driver.findElement(By.xpath(CartPage.ADD_TO_CART_BTN));
        AddToCartBtn.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.CART_ICON_HEADER,5);
        WebElement CartIconHeader= driver.findElement(By.xpath(CartPage.CART_ICON_HEADER));
        CartIconHeader.click();
    }
    public String AddItemToCart() {
        addToCart();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_PRICE,5);
        WebElement ItemPrice=driver.findElement(By.xpath(CartPage.ITEM_PRICE));
        return ItemPrice.getText();
    }
}





