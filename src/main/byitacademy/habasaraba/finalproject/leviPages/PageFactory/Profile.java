package byitacademy.habasaraba.finalproject.leviPages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
    public WebDriver driver;
    public Profile(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath="//*[@id=\"greeting-link-dropdown\"]")
    private WebElement UserData;

    public String getUserName(){
        String UserName=UserData.getText();
        return UserName;
    }
}
