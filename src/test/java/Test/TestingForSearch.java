package Test;

import org.testng.annotations.Test;

public class TestingForSearch extends BaseClass {

    @Test
    public void LoginPage() {
        pageFactory.getLoginPage().loginPage();
    }

    @Test(dependsOnMethods = "LoginPage")
    public void searchInfo()
    {
        pageFactory.getSearch().searchInfo();
        pageFactory.getLoginPage().logout();
    }

}
