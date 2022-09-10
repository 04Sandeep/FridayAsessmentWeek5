package TestReport;

import org.testng.annotations.Test;

import static TestReport.BaseClass.pageFactory;

public class LoginTestingforAdminDemo extends BaseClass {
    @Test
    public void LoginPage()
    {
        pageFactory.getLoginPage().loginPage();
    }

}
