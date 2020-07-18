package WorkFlows;              //Represents regular routine tasks and operations that the system does: Creating / removing users,
                                // new tasks etc. - Inherits from CommonOps

import Extensions.DataBase.DbActions;
import Extensions.Web.UiActions;
import Utilities.CommonOps;
import Utilities.HelperMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utilities.HelperMethods.getDataFromXML;

public class WebFlows extends CommonOps {

    @Step("Sign in to Basecamp")
    public static void signIn() {
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
