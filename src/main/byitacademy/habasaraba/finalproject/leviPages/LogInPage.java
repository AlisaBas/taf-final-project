package byitacademy.habasaraba.finalproject.leviPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
    public static final String LOGIN_BTN_HEADER = "//*[@id=\"headerBar\"]/div[2]/div/div/div/div/ul/li[1]/a";
    public static final String INPUT_EMAIL = "//*[@id=\"login-email\"]/div/div";
    public static final String INPUT_PASSWORD = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[2]/div/div/input";

    public static final String LOGIN_BTN = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[5]/button";
    public static final String HELLO_USER = "//*[@id=\"greeting-link-dropdown\"]";
    public static final String ERR_MSG_PASSWORD = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[2]/div[2]/div";
    public static final String ERR_MSG_EMAIL = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/section/div[2]/form/div[2]/div";

}