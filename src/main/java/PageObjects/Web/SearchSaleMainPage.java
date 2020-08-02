package PageObjects.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchSaleMainPage {

    @FindBy(how = How.XPATH, using = "//li[1]/div/div/div[1]/div/label/span[3]/input")
    public WebElement citySearch_fld;

    @FindBy(how = How.XPATH, using = "//form/ul/li[2]/div/div/div[1]/button")
    public WebElement propertyType_slct;

    @FindBy(how = How.XPATH, using = "//li[3]/div/div/div[1]/button")
    public WebElement roomNum_btn;

    @FindBy(how = How.XPATH, using = "//div/div/div/div[1]/div/div[1]/div/label/span[3]/input")
    public WebElement fromRoomNum_btn;

    @FindBy(how = How.XPATH, using = "//div/div/div/div[2]/div/div[1]/div/label/span[3]/input")
    public WebElement toRoomNum_btn;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchRangeInputFrom_price']")
    public WebElement fromPrice_fld;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchRangeInputTo_price']")
    public WebElement toPrice_fld;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchButton']")
    public WebElement search_btn;

    @FindBy(how = How.XPATH, using = "li[3]/div/span[1]/strong")
    public WebElement tzurYizhak_btn;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_1_property']")
    public WebElement apa_chcbx;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_3_property']")
    public WebElement gardenApa_chcbx;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_5_property']")
    public WebElement prvHouse_chcbx;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_6_property']")
    public WebElement roofPenthouse_chcbx;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_7_property']")
    public WebElement duplex_chcbx;

    @FindBy(how = How.XPATH, using = "//*[@data-test-id='searchDropMultiCheckbox_Checkbox_39_property']")
    public WebElement dblFamily_chcbx;

    /*@FindBy(how = How.XPATH, using = "li[3]/div/span[1]/strong")
    public WebElement ;

    @FindBy(how = How.XPATH, using = "li[3]/div/span[1]/strong")
    public WebElement ;*/


}
