package TestReport;

import org.testng.annotations.Test;

public class LowStockTesting extends BaseClass {
    @Test
    public void LowStockPage() {
        pageFactory.getLoginPage().loginPage();
        pageFactory.getLowStockPage().lowStock();
        pageFactory.getLoginPage().logout();
    }
}

