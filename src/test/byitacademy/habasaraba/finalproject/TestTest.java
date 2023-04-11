package byitacademy.habasaraba.finalproject;

import byitacademy.habasaraba.finalproject.leviPages.CartPage;
import byitacademy.habasaraba.finalproject.leviPages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class TestTest {
    WebDriver driver;
    Step leviPage;

    @Test
    public void testJeans() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3)):*/
        driver.get("https://www.levi.com/US/en_US/clothing/men/jeans/c/levi_clothing_men_jeans");
        Driver.waitForPresenceElementByXPath(driver,"//div[@class='product-cell']/a",15);
       WebElement productCell= driver.findElement(By.xpath("//div[@class='product-cell']/a"));
        /*WebElement productName=productCell.findElement(By.xpath("//div[@class='product-name']"));*/
        productCell.click();
        /*Actions actions2=new Actions(driver);
        Driver.waitForPresenceElementByXPath(driver, CartPage.ITEM_COLOR_CHECKBOX,5);
        WebElement target2=driver.findElement(By.xpath(CartPage.ITEM_COLOR_CHECKBOX));
        actions2.moveToElement(target2).perform();*/
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
        Assertions.assertEquals("$68.60", leviPage.AddItemToCart());
    }

}
