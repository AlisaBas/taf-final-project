package byitacademy.habasaraba.finalproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step {
    WebDriver driver;

    Step(WebDriver driver) {
        this.driver = driver;
    }
    public String LogInWithValidCredentials(){
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
        WebElement helloUser=driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.HELLO_USER));
        return helloUser.getText();
    }
    public String LoginWithoutPassword(){
        Util.waitFor(5);
        WebElement OfferBtn= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
        WebElement LogInBtnHeader= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER,10);
        LogInBtnHeader.click();
        Util.waitFor(5);
        WebElement EmailInputField= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.com");
        WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        WebElement ErrMsgPassword=driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.ERR_MSG_PASSWORD));
        return ErrMsgPassword.getText();
    }
    public String LoginWithIncorrectEmail(){
    Util.waitFor(5);
    WebElement OfferBtn= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.OFFER_BTN));
        OfferBtn.click();
    WebElement LogInBtnHeader= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER));
        Driver.waitForPresenceElementByXPath(driver, byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN_HEADER,10);
        LogInBtnHeader.click();
        Util.waitFor(5);
    WebElement EmailInputField= driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_EMAIL));
        EmailInputField.sendKeys("alisa.basaraba@icloud.con");
    WebElement PasswordInputField=driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.INPUT_PASSWORD));
        PasswordInputField.sendKeys("0505alisa");
    WebElement LogInBtn = driver.findElement(By.xpath(byitacademy.habasaraba.finalproject.LeviPage.LOGIN_BTN));
        LogInBtn.click();
        Util.waitFor(10);
        WebElement ErrMsgEmail=driver.findElement(By.xpath(LeviPage.ERR_MSG_EMAIL));
        return ErrMsgEmail.getText();
}
}





