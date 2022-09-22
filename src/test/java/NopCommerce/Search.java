package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Search {
    WebDriver driver;
    WebDriverWait wait;
    By search = By.xpath("//input[@class = 'form-control admin-search-box typeahead tt-input']");
    public Search(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void searchInfo()
    {
        driver.findElement(search);
        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        driver.findElement(search).sendKeys("GIFT CARDS");
        driver.findElement(search).click();
    }
}
