package Extensions.Web;         //Actions we commonly do on UI objects will be wrapped here with our methods in order to simplify
                                //the process. Inherits from CommonOps.

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class UiActions extends CommonOps {

    public static void click(WebElement elem) {
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }

    public static void insertKeys(WebElement elem, String info) {
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
        elem.sendKeys(info);
    }

    public static void insertKeysAndClick(WebElement elem1, String info, WebElement elem2) {
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem1));
        insertKeys(elem1, info);
        elem2.click();
    }

    public static void mouseHover(WebElement elem1, WebElement elem2) {
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem1));
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    public static void selectFromDropDownList(WebElement elem, String selection) {
        Select DropDown = new Select(elem);
        DropDown.selectByVisibleText(selection);
    }

    public static void dragAndDrop(WebElement elem1, WebElement elem2) {
        action.dragAndDrop(elem1, elem2);
    }

    public static void changeToIframe(WebElement frm) {
        driver.switchTo().frame(frm);
    }
}
