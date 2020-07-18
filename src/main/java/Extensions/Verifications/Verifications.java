package Extensions.Verifications;           //Assertion methods that are meant to verify our tests. The methods will get called from the tests.
                                            //The class inherits from CommonOps class

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.*;

import java.util.List;

public class Verifications extends CommonOps {

    public static void verifyTextInElement(WebElement elem, String expected) {
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
        System.out.println("Expected result is: " + expected + ".\nActual result is: " + elem.getText());
    }

    public static void verifyNumberOfElementsProjectAdd(List<WebElement> actual, int expected) throws InterruptedException {

    }

    public static void verifyNumberOfElementsProjectRemove(List<WebElement> actual, int expected) throws InterruptedException {

    }

}
