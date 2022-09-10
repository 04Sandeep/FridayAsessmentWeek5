package TestReport;

import org.testng.annotations.Test;

public class ReportSearchingTesting extends BaseClass{
    @Test
    public void SearchingSalesSummaryInReports()
    {
        pageFactory.getLoginPage().loginPage();
        pageFactory.getSearchingSalesSummaryInReports().searchingSalesSummaryInReports();
        pageFactory.getLoginPage().logout();

    }
}
