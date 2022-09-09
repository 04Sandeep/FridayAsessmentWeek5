package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginPage() {
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");
    }

    public void logout() {
        driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
    }
}


