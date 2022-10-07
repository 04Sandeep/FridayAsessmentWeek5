package Test;

import org.testng.annotations.Test;

public class AddingNewGiftCardsTesting extends BaseClass{
    @Test

        public void LoginPage() {
        pageFactory.getLoginPage().loginPage();
    }

        @Test(dependsOnMethods = "LoginPage")
        public void AddingNewGiftCardsInSales()
        {
            pageFactory.getAddingNewGiftCardsInSales().addingNewGiftCardsSales();
            pageFactory.getLoginPage().logout();
        }

    }



