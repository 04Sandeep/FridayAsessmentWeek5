package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddingNewGiftCardsInSales {
    WebDriver driver;
    By sales = By.xpath("//*[contains(text(),'Sales')]");

    public AddingNewGiftCardsInSales(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addingNewGiftCardsSales()
    {
        driver.findElement(sales).click();
    }
}
