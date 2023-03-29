package byitacademy.habasaraba.finalproject.leviPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
    public WebDriver driver;
    public LogIn(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath ="//*[@id=\"headerBar\"]/div[2]/div/div/div/div/ul/li[1]/a")
    private WebElement loginBtnHeader;

    @FindBy(xpath="//*[@id=\"login-email\"]/div/div")
    private WebElement inputEmail;

    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[2]/div/div/input")
    private WebElement inputPassword;

    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[5]/button")
    private WebElement loginBtn;

    public void clickLoginBtnHeader(){
        loginBtnHeader.click();
    }

    public void inputEmail(String login){
        inputEmail.sendKeys(login);
    }

    public void inputPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void LoginBtn(){
        loginBtn.click();
    }


}
