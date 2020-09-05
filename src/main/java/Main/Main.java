package Main;

import Extensions.Web.UiActions;
import Utilities.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utilities.HelperMethods.getDataFromXML;

public class Main extends Base {

    /*public static void main(String[] args) {
        searchPricesTzurYitzhak();
    }*/

    public static void searchPricesTzurYitzhak() {
        driver.get(getDataFromXML("URL"));
        wait.until(ExpectedConditions.visibilityOf(searchSaleMainPage.search_btn));
        UiActions.insertKeys(searchSaleMainPage.citySearch_fld, getDataFromXML("Yishuv"));
        wait.until(ExpectedConditions.visibilityOf(searchSaleMainPage.tzurYizhak_btn));
        UiActions.click(searchSaleMainPage.tzurYizhak_btn);
        UiActions.click(searchSaleMainPage.propertyType_slct);
        UiActions.clickForPropertyType();
        UiActions.clickForNoOfRooms();
        UiActions.insertKeys(searchSaleMainPage.fromPrice_fld, "50000");
        UiActions.click(searchSaleMainPage.search_btn);
        UiActions.numberOfAdsPerSearch();

    }
}
