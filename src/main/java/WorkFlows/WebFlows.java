package WorkFlows;              //Represents regular routine tasks and operations that the system does: Creating / removing users,
                                // new tasks etc. - Inherits from CommonOps

import Extensions.Web.UiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utilities.HelperMethods.getDataFromXML;

public class WebFlows extends CommonOps {

    @Step("Sign in to Basecamp")
    public static void searchPricesTzurYitzhak() {
        driver.get(getDataFromXML("URL"));
        wait.until(ExpectedConditions.visibilityOf(searchSaleMainPage.search_btn));
        UiActions.insertKeys(searchSaleMainPage.citySearch_fld, getDataFromXML("TzurYitzhak"));
        wait.until(ExpectedConditions.visibilityOf(searchSaleMainPage.tzurYizhak_btn));
        UiActions.click(searchSaleMainPage.tzurYizhak_btn);
        UiActions.click(searchSaleMainPage.propertyType_slct);
        UiActions.clickForPropertyType();
        UiActions.clickForNoOfRooms();
        UiActions.insertKeys(searchSaleMainPage.fromPrice_fld, "50000");
        UiActions.click(searchSaleMainPage.search_btn);

    }

    @Step("Sign out from Basecamp")
    public static void signOut() {
    }

    @Step("Sign up to Basecamp")
    public static void signUp() {

    }

    @Step("Add new project")
    public static void addNewProject() {

    }

    @Step("Remove first project")
    public static void removeAProject() {

    }

}
