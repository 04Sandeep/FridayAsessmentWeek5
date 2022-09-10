package Reports;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private SearchingSalesSummaryInReports searchingSalesSummaryInReports;
    private LowStockPage lowStock;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public SearchingSalesSummaryInReports getSearchingSalesSummaryInReports() {
        if (searchingSalesSummaryInReports == null) {
            searchingSalesSummaryInReports = new SearchingSalesSummaryInReports(driver);
        }
        return searchingSalesSummaryInReports;
    }
    public LowStockPage getLowStockPage()
    {
        if(lowStock==null)
        {
            lowStock = new LowStockPage(driver);
        }
        return lowStock;
    }
}
