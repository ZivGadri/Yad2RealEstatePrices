package Extensions.Web;         //Actions we commonly do on UI objects will be wrapped here with our methods in order to simplify
//the process. Inherits from CommonOps.

import PageObjects.Web.ResultsPage;
import Utilities.CommonOps;
import Utilities.HelperMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class UiActions extends CommonOps {

    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }

    public static void clickForPropertyType() {
        click(searchSaleMainPage.apa_chcbx);
        click(searchSaleMainPage.morePropertyType_btn);
        click(searchSaleMainPage.gardenApa_chcbx);
        click(searchSaleMainPage.roofPenthouse_chcbx);
        click(searchSaleMainPage.prvHouse_chcbx);
        click(searchSaleMainPage.duplex_chcbx);
        click(searchSaleMainPage.dblFamily_chcbx);
        click(searchSaleMainPage.apa_chcbx);
    }

    public static void clickForNoOfRooms() {
        String fromRooms = String.valueOf(2 * Integer.parseInt(HelperMethods.getDataFromXML("fromRooms")));
        String upToRooms = String.valueOf(Integer.parseInt(HelperMethods.getDataFromXML("upToRooms")));
        click(searchSaleMainPage.roomNum_btn);
        click(searchSaleMainPage.fromRoomNum_btn);
        click(driver.findElement(By.xpath("//div/div/div/div[1]/div/div[3]/ul/li[" + fromRooms + "]")));
        click(searchSaleMainPage.toRoomNum_btn);
        click(driver.findElement(By.xpath("//*[@data-test-id='desktop_to-rooms_option_" + upToRooms + "']")));
    }

    public static void insertKeys(WebElement elem, String info) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
        elem.sendKeys(info);
    }

    public static void insertKeysAndClick(WebElement elem1, String info, WebElement elem2) {
        wait.until(ExpectedConditions.visibilityOf(elem1));
        insertKeys(elem1, info);
        elem2.click();
    }

    public static void mouseHover(WebElement elem1, WebElement elem2) {
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

    public static void numberOfAdsPerSearch() {
        wait.until(ExpectedConditions.titleContains(HelperMethods.getDataFromXML("Yishuv")));
        String presentsNumberOfAdsFound = resultsPage.numberOfAds_txt.getText();
        String[] numberOfAdsPerSearch = presentsNumberOfAdsFound.split(" ");
        /*for (String index : numberOfAdsPerSearch) {
            System.out.println(index);
        }*/
        numberOfAdsInResults = Integer.parseInt(numberOfAdsPerSearch[0]);
    }

    public static void numberOfPagesPerSearch() {

    }

    public static void numberOfAdsPerPage() {

    }
}


