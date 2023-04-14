package byitacademy.habasaraba.finalproject.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
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






