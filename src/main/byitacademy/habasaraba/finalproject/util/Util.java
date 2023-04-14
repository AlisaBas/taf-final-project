package byitacademy.habasaraba.finalproject.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {

    public static void clickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void waitForPresenceElementByXPath(WebDriver driver, String xPath, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }

    public static void waitForNoEmptyCart(WebDriver driver, String xpath, int seconds) {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(seconds))

                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

        fluentWait.until(driver1 -> {
            WebElement element = driver1.findElement(By.xpath(xpath));
            return !element.getText().equals("0 items");
        });
    }
}

