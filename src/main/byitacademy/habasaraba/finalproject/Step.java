package byitacademy.habasaraba.finalproject;

import byitacademy.habasaraba.finalproject.data.UserData;
import byitacademy.habasaraba.finalproject.leviPages.CartPage;
import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import byitacademy.habasaraba.finalproject.leviPages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Step {
    WebDriver driver;

    Step(WebDriver driver) {
        this.driver = driver;
    }



    public String LogInWithValidCredentials() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.INPUT_EMAIL,5);
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        EmailInputField.sendKeys(UserData.EMAIL_VALID);
        WebElement PasswordInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys(UserData.PASSWORD_VALID);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.HELLO_USER,5);
        WebElement helloUser = driver.findElement(By.xpath(LogInPage.HELLO_USER));
        return helloUser.getText();
    }

    public String LoginWithoutPassword() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.INPUT_EMAIL,5);
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        EmailInputField.sendKeys(UserData.EMAIL_VALID);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
        WebElement ErrMsgPassword = driver.findElement(By.xpath(LogInPage.ERR_MSG_PASSWORD));
        return ErrMsgPassword.getText();
    }
    public String LoginWithoutEmail() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.INPUT_PASSWORD,5);
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        EmailInputField.sendKeys(UserData.PASSWORD_VALID);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
        WebElement ErrMsgPassword = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgPassword.getText();
    }


    public String LoginWithIncorrectEmail() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.INPUT_EMAIL,5);
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        EmailInputField.sendKeys(UserData.EMAIL_INVALID);
        WebElement PasswordInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys(UserData.PASSWORD_VALID);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.ERR_MSG_EMAIL,5);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }
    public String LoginWithIncorrectPassword() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(LogInPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, LogInPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.INPUT_EMAIL,5);
        WebElement EmailInputField = driver.findElement(By.xpath(LogInPage.INPUT_EMAIL));
        EmailInputField.sendKeys(UserData.EMAIL_VALID);
        WebElement PasswordInputField = driver.findElement(By.xpath(LogInPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys(UserData.PASSWORD_INVALID);
        WebElement LogInBtn = driver.findElement(By.xpath(LogInPage.LOGIN_BTN));
        LogInBtn.click();
        Driver.waitForPresenceElementByXPath(driver,LogInPage.ERR_MSG_EMAIL,5);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LogInPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }


    public String AddToCart() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement MenuBtnShop = driver.findElement(By.xpath(CartPage.MENU_BTN_SHOP));
        Driver.waitForPresenceElementByXPath(driver, CartPage.MENU_BTN_SHOP, 10);
        MenuBtnShop.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_BTN_MEN,5);
        WebElement SideMenuBtnMen = driver.findElement(By.xpath(CartPage.SIDE_MENU_BTN_MEN));
        Driver.waitForPresenceElementByXPath(driver, CartPage.SIDE_MENU_BTN_MEN, 10);
        SideMenuBtnMen.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_LINK_JEANS,5);
        WebElement SideMenuLinkJeans = driver.findElement(By.xpath(CartPage.SIDE_MENU_LINK_JEANS));
        Driver.waitForPresenceElementByXPath(driver, CartPage.SIDE_MENU_LINK_JEANS, 10);
        SideMenuLinkJeans.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_LINK,5);
        WebElement ItemLink=driver.findElement(By.xpath(CartPage.ITEM_LINK));
        ItemLink.click();
        Util.waitFor(10);
        Actions actions=new Actions(driver);
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_COLOR_CHECKBOX,5);
        WebElement target=driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        actions.moveToElement(target).perform();
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
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_PRICE,5);
        WebElement ItemPrice=driver.findElement(By.xpath(CartPage.ITEM_PRICE));
        return ItemPrice.getText();
    }

    public String ChangeCart() {
        Driver.waitForPresenceElementByXPath(driver,HomePage.OFFER_BTN,5);
        WebElement OfferBtn = driver.findElement(By.xpath(HomePage.OFFER_BTN));
        OfferBtn.click();
        WebElement MenuBtnShop = driver.findElement(By.xpath(CartPage.MENU_BTN_SHOP));
        Driver.waitForPresenceElementByXPath(driver, CartPage.MENU_BTN_SHOP, 10);
        MenuBtnShop.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_BTN_MEN,5);
        WebElement SideMenuBtnMen = driver.findElement(By.xpath(CartPage.SIDE_MENU_BTN_MEN));
        Driver.waitForPresenceElementByXPath(driver, CartPage.SIDE_MENU_BTN_MEN, 10);
        SideMenuBtnMen.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_LINK_JEANS,5);
        WebElement SideMenuLinkJeans = driver.findElement(By.xpath(CartPage.SIDE_MENU_LINK_JEANS));
        Driver.waitForPresenceElementByXPath(driver,CartPage.SIDE_MENU_LINK_JEANS, 10);
        SideMenuLinkJeans.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_LINK,5);
        WebElement ItemLink=driver.findElement(By.xpath(CartPage.ITEM_LINK));
        ItemLink.click();
        Util.waitFor(10);
        Actions actions=new Actions(driver);
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEM_COLOR_CHECKBOX,5);
        WebElement target=driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        actions.moveToElement(target).perform();
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
        Driver.waitForPresenceElementByXPath(driver,CartPage.FILTER_QUANTITY,5);
        WebElement FilterQuantity=driver.findElement(By.xpath(CartPage.FILTER_QUANTITY));
        Driver.waitForPresenceElementByXPath(driver,CartPage.FILTER_QUANTITY,5);
        FilterQuantity.click();
        WebElement BtnQuantity=driver.findElement(By.xpath(CartPage.BTN_QUANTITY));
        Driver.waitForPresenceElementByXPath(driver,CartPage.BTN_QUANTITY,5);
        BtnQuantity.click();
        Driver.waitForPresenceElementByXPath(driver,CartPage.ITEMS_PRICE,5);
        WebElement ItemsPrice=driver.findElement(By.xpath(CartPage.ITEMS_PRICE));
        return ItemsPrice.getText();
    }
}





