package Utilities;              //A class that will define an object for each page/section class of the app and initialize the
                                // objects we define in each and every one. Inherits from Base class

import PageObjects.Web.ResultsPage;
import PageObjects.Web.SearchSaleMainPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public static void initWeb() {
        searchSaleMainPage = PageFactory.initElements(driver, SearchSaleMainPage.class);
        resultsPage = PageFactory.initElements(driver, ResultsPage.class);
    }

}
