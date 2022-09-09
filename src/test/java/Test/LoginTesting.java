package Test;

import org.testng.annotations.Test;

public class LoginTesting extends BaseClass
{
    @Test
    public void LoginPage() {
        pageFactory.getLoginPage().loginPage();
    }
}