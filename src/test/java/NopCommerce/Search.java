package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
    }

    public void searchInfo()
    {
        driver.findElement(search).click();

        driver.findElement(search).sendKeys("Dashboard");
    }
}
