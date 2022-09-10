package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchingSalesSummaryInReports {
    WebDriver driver;
    WebDriverWait wait;
    By reportsmenuclick = By.xpath("//*[contains(text(), 'Reports')]");
    By salessummaryclick = By.xpath("//*[contains(text(),'Sales summary')]");
    By startdate = By.xpath("//input[@name = 'StartDate']");
    By enddate = By.xpath("//input[@name = 'EndDate']");
    By selectstore = By.xpath("//select[@name = 'StoreId']");
    By selectorderstatus = By.xpath("//select[@name = 'OrderStatusId']");
    By paymentstatusstore = By.xpath("//select[@name = 'PaymentStatusId']");
    By selectcategory = By.xpath("//select[@name = 'CategoryId']");
    By selectmanufacturer = By.xpath("//select[@name = 'ManufacturerId']");
    By selectbillingcountry = By.xpath("//select[@name='BillingCountryId']");
    By enterproduct = By.xpath("//input[@class = 'form-control ui-autocomplete-input']");
    By groupby = By.xpath("//select[@name='SearchGroupId']");
    By runreport = By.xpath("//button[@class = 'btn btn-primary btn-search']");

    public SearchingSalesSummaryInReports(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchingSalesSummaryInReports() {
        String startdatesales = "9/14/2022";
        String enddatesales = "9/20/2022";
        driver.findElement(reportsmenuclick).click();
        driver.findElement(salessummaryclick).click();
        driver.findElement(startdate).sendKeys(startdatesales);
        wait.until(ExpectedConditions.elementToBeClickable(startdate));
        driver.findElement(enddate).sendKeys(enddatesales);
        driver.findElement(selectstore).sendKeys("Your store name");
        driver.findElement(By.xpath("//*[contains(text(), 'Your store name')]")).click();
        driver.findElement(selectorderstatus).sendKeys("Processing");
        driver.findElement(By.xpath("//*[contains(text(), 'Processing')]")).click();
        driver.findElement(paymentstatusstore).sendKeys("Paid");
        driver.findElement(By.xpath("//*[contains(text(), 'Paid')]")).click();
        driver.findElement(selectcategory).sendKeys("Computers");
        driver.findElement(By.xpath("//*[contains(text(), 'Computers')]")).click();
        driver.findElement(selectmanufacturer).sendKeys("Apple");
        driver.findElement(By.xpath("//*[contains(text(), 'Apple')]")).click();
        driver.findElement(selectbillingcountry).sendKeys("Australia");
        driver.findElement(By.xpath("//*[contains(text(), 'Australia')]")).click();
        driver.findElement(enterproduct).sendKeys("Electronics");
        driver.findElement(groupby).sendKeys("Week");
        driver.findElement(By.xpath("//*[contains(text(), 'Week')]")).click();
        driver.findElement(runreport).click();
    }

}



