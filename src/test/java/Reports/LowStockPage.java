package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LowStockPage {
    WebDriver driver;



    By reportsitemclick = By.xpath("//*[contains(text(), 'Reports')]");
    By lowstockclick = By.xpath("//*[contains(text(),'Low stock')]");
    By selectpublished = By.xpath("//select[@name = 'SearchPublishedId']");
    By clickonsearchbutton = By.xpath("//button[@class = 'btn btn-primary btn-search']");
    public LowStockPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void lowStock()
    {
        driver.findElement(reportsitemclick).click();
        driver.findElement(lowstockclick).click();
        driver.findElement(selectpublished).sendKeys("Published only");
        driver.findElement(By.xpath("//*[contains(text(), 'Published only')]"));
        driver.findElement(clickonsearchbutton).click();
    }
}



