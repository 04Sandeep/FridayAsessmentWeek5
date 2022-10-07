package NopCommerce;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private Search searchInfo;
    private AddingNewGiftCardsInSales addingNewGiftCardsInSales;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public Search getSearch() {
        if (searchInfo == null) {
            searchInfo = new Search(driver);
        }
        return searchInfo;
    }

    public AddingNewGiftCardsInSales getAddingNewGiftCardsInSales() {
        if (addingNewGiftCardsInSales == null) {
            addingNewGiftCardsInSales = new AddingNewGiftCardsInSales(driver);
        }
        return addingNewGiftCardsInSales;
    }
}
