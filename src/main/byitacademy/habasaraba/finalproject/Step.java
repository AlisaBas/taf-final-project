package byitacademy.habasaraba.finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step {
    WebDriver driver;

    Step(WebDriver driver) {
        this.driver = driver;
    }

    public String LogInWithValidCredentials() {
        Util.waitFor(5);
        WebElement OfferBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Util.waitFor(5);
        WebElement EmailInputField = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.com");
        WebElement PasswordInputField = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys("0505alisa");
        WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        Util.waitFor(10);
        WebElement helloUser = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.HELLO_USER));
        return helloUser.getText();
    }

    public String LoginWithoutPassword() {
        Util.waitFor(5);
        WebElement OfferBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Util.waitFor(5);
        WebElement EmailInputField = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.com");
        WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        WebElement ErrMsgPassword = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.ERR_MSG_PASSWORD));
        return ErrMsgPassword.getText();
    }

    public String LoginWithIncorrectEmail() {
        Util.waitFor(5);
        WebElement OfferBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER, 10);
        LogInBtnHeader.click();
        Util.waitFor(5);
        WebElement EmailInputField = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.con");
        WebElement PasswordInputField = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys("0505alisa");
        WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        Util.waitFor(10);
        WebElement ErrMsgEmail = driver.findElement(By.xpath(LeviPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
    }

    public String AddItemToTheBasket() {
        Util.waitFor(5);
        WebElement OfferBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement MenuBtnShop = driver.findElement(By.xpath(LeviPage.MENU_BTN_SHOP));
        Driver.waitForPresenceElementByXPath(driver, LeviPage.MENU_BTN_SHOP, 10);
        MenuBtnShop.click();
        Util.waitFor(5);
        WebElement SideMenuBtnMen = driver.findElement(By.xpath(LeviPage.SIDE_MENU_BTN_MEN));
        Driver.waitForPresenceElementByXPath(driver, LeviPage.SIDE_MENU_BTN_MEN, 10);
        SideMenuBtnMen.click();
        Util.waitFor(5);
        WebElement SideMenuLinkJeans = driver.findElement(By.xpath(LeviPage.SIDE_MENU_LINK_JEANS));
        Driver.waitForPresenceElementByXPath(driver, LeviPage.SIDE_MENU_LINK_JEANS, 10);
        SideMenuLinkJeans.click();
        Util.waitFor(5);
        WebElement AddToBagBtn = driver.findElement(By.xpath(LeviPage.ADD_TO_BAG_BTN));
        AddToBagBtn.click();
        Util.waitFor(5);
        WebElement FilterWaistCheckbox = driver.findElement(By.xpath(LeviPage.FILTER_WAIST_CHECKBOX));
        Driver.waitForPresenceElementByXPath(driver, LeviPage.FILTER_WAIST_CHECKBOX, 10);
        FilterWaistCheckbox.click();
        WebElement FilterLengthCheckbox = driver.findElement(By.xpath(LeviPage.FILTER_LENGTH_CHECKBOX));
        Driver.waitForPresenceElementByXPath(driver, LeviPage.FILTER_LENGTH_CHECKBOX, 10);
        FilterLengthCheckbox.click();
        WebElement AddToCartBtn = driver.findElement(By.xpath(LeviPage.ADD_TO_CART_BTN));
        AddToCartBtn.click();
        Util.waitFor(5);
        WebElement CartIconHeader = driver.findElement(By.xpath(LeviPage.CART_ICON_HEADER));
        CartIconHeader.click();
        WebElement ItemQualityCart = driver.findElement(By.xpath(LeviPage.ITEM_QUALITY_CART));
        return ItemQualityCart.getText();
    }
}





