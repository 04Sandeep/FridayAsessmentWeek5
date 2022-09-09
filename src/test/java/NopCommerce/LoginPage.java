package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    WebDriver driver;

    By username = By.xpath("//input[@class='email valid']");
    By password = By.xpath("//input[@class='password valid']");
    By login = By.xpath("//button[@class='button-1 login-button']");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void loginPage()
    {
        driver.findElement(username).sendKeys("admin@yourstore.com");
        driver.findElement(password).sendKeys("admin");
        driver.findElement(login).click();
    }
}
